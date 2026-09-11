public class Knight {

    // attributes / data
    // variables
    String characterName;
    int health; // between 0 and 100
    int energyLevel; // 0-100
    boolean isHoly;
    int strength;
    boolean hasWeapon;
    int speed; // betweem 0 and 100


    // constructor -- SPECIAL METHOD called every time make an object
    // same name
    public Knight(String characterName, int health, boolean isHoly) {
        this.characterName = characterName;
        this.health = health;
        this.isHoly = isHoly;
    }

    public void eat() {
        energyLevel += 25;
        if(energyLevel > 100){
            energyLevel = 100;
        }
    }

    public void breakWeapon() {
        hasWeapon = false;
        health /= 2;
    }

    public void workOut() {
        strength += 1;
        if (strength > 100) {
            strength = 100
            System.out.println("You're too strong!!");
        }
    }

    public void damaged(int amount) {
        health -= amount;
        if (health < 0) {
            System.out.println("You died.");
        }
    }

}
