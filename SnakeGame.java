import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class SnakeGame {
    static final int WIDTH = 30;
    static final int HEIGHT = 15;

    static LinkedList<Point> snake = new LinkedList<>();
    static Point food;
    static Direction direction = Direction.RIGHT;
    static Direction nextDirection = Direction.RIGHT;
    static Random random = new Random();
    static boolean gameOver = false;
    static int score = 0;

    enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object object) {
            if (!(object instanceof Point)) {
                return false;
            }

            Point other = (Point) object;
            return x == other.x && y == other.y;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        setupGame();

        Thread inputThread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);

            while (!gameOver) {
                String input = scanner.nextLine().trim().toLowerCase();

                if (input.equals("w")) {
                    changeDirection(Direction.UP);
                } else if (input.equals("s")) {
                    changeDirection(Direction.DOWN);
                } else if (input.equals("a")) {
                    changeDirection(Direction.LEFT);
                } else if (input.equals("d")) {
                    changeDirection(Direction.RIGHT);
                } else if (input.equals("q")) {
                    gameOver = true;
                }
            }

            scanner.close();
        });

        inputThread.setDaemon(true);
        inputThread.start();

        while (!gameOver) {
            move();
            draw();
            Thread.sleep(150);
        }

        clearScreen();
        System.out.println("Game over!");
        System.out.println("Final score: " + score);
    }

    static void setupGame() {
        snake.clear();

        int startX = WIDTH / 2;
        int startY = HEIGHT / 2;

        snake.add(new Point(startX, startY));
        snake.add(new Point(startX - 1, startY));
        snake.add(new Point(startX - 2, startY));

        direction = Direction.RIGHT;
        nextDirection = Direction.RIGHT;
        score = 0;
        gameOver = false;

        createFood();
    }

    static void move() {
        direction = nextDirection;

        Point head = snake.getFirst();
        Point newHead = new Point(head.x, head.y);

        switch (direction) {
            case UP:
                newHead.y--;
                break;
            case DOWN:
                newHead.y++;
                break;
            case LEFT:
                newHead.x--;
                break;
            case RIGHT:
                newHead.x++;
                break;
        }

        if (newHead.x < 0 || newHead.x >= WIDTH
                || newHead.y < 0 || newHead.y >= HEIGHT
                || snake.contains(newHead)) {
            gameOver = true;
            return;
        }

        snake.addFirst(newHead);

        if (newHead.equals(food)) {
            score++;
            createFood();
        } else {
            snake.removeLast();
        }
    }

    static void createFood() {
        do {
            food = new Point(random.nextInt(WIDTH), random.nextInt(HEIGHT));
        } while (snake.contains(food));
    }

    static void draw() {
        clearScreen();

        System.out.println("Score: " + score);
        System.out.println("Use W A S D to move. Press Q to quit.");
        System.out.println();

        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                Point current = new Point(x, y);

                if (x == 0 || x == WIDTH - 1 || y == 0 || y == HEIGHT - 1) {
                    System.out.print("#");
                } else if (current.equals(food)) {
                    System.out.print("*");
                } else if (current.equals(snake.getFirst())) {
                    System.out.print("O");
                } else if (snake.contains(current)) {
                    System.out.print("o");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void changeDirection(Direction newDirection) {
        if (direction == Direction.UP && newDirection == Direction.DOWN) {
            return;
        }

        if (direction == Direction.DOWN && newDirection == Direction.UP) {
            return;
        }

        if (direction == Direction.LEFT && newDirection == Direction.RIGHT) {
            return;
        }

        if (direction == Direction.RIGHT && newDirection == Direction.LEFT) {
            return;
        }

        nextDirection = newDirection;
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
