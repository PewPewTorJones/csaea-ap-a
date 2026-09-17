import java.util.Random;

public class Toaster {
    private String brand;
    String color;
    Random random = new Random();
    private int numberOfSlots = new Random().nextInt(0, 3);
    private double cookLevel;
    boolean isPluggedIn;
    boolean isToasting;
    private boolean hasBagelMode;


    public Toaster(int numberOfSlots, boolean isToasting, boolean isPluggedIn) {
        this.numberOfSlots = numberOfSlots;
        this.isToasting = isToasting;
        this.isPluggedIn = isPluggedIn;
    }
    public void unboxToaster() {
        System.out.println("Toaster is a: " + brand);
        System.out.println("Toaster has: " + numberOfSlots + " slots");
        System.out.println("Bagel mode: " + hasBagelMode);
    }
    public void upgrades() {
        numberOfSlots += 1;
        System.out.println("Toaster has been upgraded to: " + numberOfSlots + " slots");
    }
    public void toastBread() {
        if(isPluggedIn == false) {
            isToasting = false;
        }
        else{
            isToasting = true;
        }
        cookLevel += 1;
        if(cookLevel > 5){
            System.out.println("Bread is burnt");
        }
    }
    public void cancelToasting() {
        isToasting = false;
    }

    public void ejectToast() {
        if(isToasting == false) {
            System.out.println("No toast to eject");
        }
        else {
            System.out.println("Ejecting toast");
        }
        isToasting = false;
        System.out.println("Toast is ejected");
    }
   public void plugIn() {
        isPluggedIn = true;

    }

    public void unplug() {
        isPluggedIn = false;
    }

}
