public class dog {
    
    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel;

    public dog(String name, String ownerName, String breed) {
        
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;


    }
    public void bark() {
        System.out.println("Woof");
    }
    public void scratch() {
        System.out.println("Racket Noises");
    }
    public void bite() {
        System.out.println("Bite noise");
    }
    public void eat() {
        isHungry = false;
        weight += 3;
        if(weight > 15){
            System.out.println("Dog unfortunately passed away");
        }
    }
    public void runAway() {
        isHome = false;
        energyLevel -= 25;
        if(energyLevel <= 10){
            System.out.println("Dog is tired");
        }

    }
    public void comeHome() {
        isHome = true;
    }
    public void sleep() {
        energyLevel += 25;
        if(energyLevel >= 100) {
            energyLevel = 100;
        }

    }
    public void haveABirthday() {
        age += 1;
        }
    }





