
public class grass {
    String grasstype = "Bermuda";
    private int grassHeightCm;
    private int growthRate;
    private int age;
    private boolean isCut;
    private double waterPercentage;
    private String color = "green";
    private boolean isWatered;
    private boolean isFertilized;

    public static void main(String[] args) {
        System.out.println("Grass is: green");
        System.out.println("Grass is: Bermuda");
    }
    

    public grass(String grasstype, int grassHeightCm, int growthRate, int age) {
        this.grasstype = grasstype;
        this.grassHeightCm = grassHeightCm;
        this.growthRate = growthRate;
        this.age = age;
        this.isCut = true;
        this.waterPercentage = 0.0;
        this.color = "green";
        this.isWatered = true;
        this.isFertilized = true;
    }

    public void cutGrass() {
        isCut = true;
        grassHeightCm = 1;
        age = 0;
        System.out.println("Snip Snip");
        System.out.println("Grass is:" + grassHeightCm);
    }

    public void waterGrass() {
        isWatered = true;
        waterPercentage += 0.5;
        if (waterPercentage > 1.0) {
            waterPercentage = 1.0;
        }
        System.out.println("Grass is watered");
    }

    public void fertilizeGrass() {
        isFertilized = true;
        System.out.println("Grass is fertilized");
        growthRate += 1;
    }

    public void growGrass() {
        if (isWatered) {
            isCut = false;
            grassHeightCm += growthRate;
            age += 1;
            System.out.println("Grass has grown to: " + grassHeightCm + " cm");
        } else {
            System.out.println("Grass cannot grow without water");
        }
    }

    public void check() {
        if (grassHeightCm > 10 && !isCut) {
            System.out.println("Grass is too tall, needs to be cut");
        } else {
            System.out.println("Grass is at a healthy height");
        }
        if (waterPercentage < 0.5) {
            System.out.println("Grass needs more water");
        } else {
            System.out.println("Grass has enough water");
        }
        if (age > 30) {
            System.out.println("Grass is too old, needs to be cut");
        }
        if (isFertilized) {
            System.out.println("Grass is fertilized");
        } else {
            System.out.println("Grass needs fertilizer");
        }
    }
}