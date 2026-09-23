import module java.base;
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
Toaster t1 = new Toaster(2, false, true);
Toaster t2 = new Toaster(4, true, true);
Toaster t3 = new Toaster(1, false, false);
Toaster t4 = new Toaster(2, true, false);
Toaster t5 = new Toaster(4, false, true);
t1.color
t2.isPluggedIn
t3.isToasting
t1.brand
t1.numberOfSlots
t1.cookLevel
t1.hasBagelMode
t1.unboxtoaster()
t1.unboxToaster()
t1.upgrades
t1.upgrades()
t1.toastBread()
t1.toastBread()
t1.toastBread()
t1.toastBread()
t1.toastBread()
t1.toastBread()
t1.cancelToasting()
t1.ejectToast()
t1.plugIn()
t1.unPlug()
t1.unplug()
save -all Jones.jsh