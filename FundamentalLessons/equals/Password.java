// create a class header for this class
//one String attribute: 'secret'
// constructor that lets user enter a secret password
// two methods
// boolean called "checkBroken"
// boolean called "check"
public class Password
{
 //  Attribute are data
    private String secret;

    //  Constructor
    public Password(String secret)
    {
        this.secret = secret;
    }

    //BROKEN method: compares objects, not characters
    public boolean checkBroken(String attempt){
        return secret == attempt; // this is incorrect! it returns false even if the attempt is correct.
    }

    //write another method called 'check' that correctly compares the attempt with the secret
    public boolean check(String attempt){
        return attempt.equals(secret);
    }

    // ===== CHALLENGE 1  =====
    // create a meethod called sameAs which takes in a string 'other'. 
    // Return true if THIS Password and another have the same secret.
    // (Inside the class you can reach other.secret.)
    // to test, create a new object with a new password

     // ===== CHALLENGE 2 =====
     // Create another method called "change()" two arguements, 
    // Change the password. The user must type the new password twice.
    // Change secret and return true ONLY if:
    //     both typed passwords match each other, AND
    //     the new password is different from the current one.
    // Otherwise change nothing and return false.
    //     secret "lion": change("tiger", "tiger") -> true   (secret is now "tiger")
    //     secret "lion": change("tiger", "tigre") -> false  (typo)
    //     secret "lion": change("lion", "lion")   -> false  (same as old)
    // Tools: equals, if/else, &&, !

    public boolean change(String newPassword1, String newPassword2) {
        if (newPassword1.equals(newPassword2) && !newPassword1.equals(secret)) {
            secret = newPassword1;
            return true;
        }
        else {
            return false;
        }
    }
     // ===== CHALLENGE 3 =====
    // Return true if the secret is safe to use:
    //     it is NOT the word "password", AND
    //     it does NOT contain the username anywhere inside it.
    //     secret "lion",     isSafe("ana") -> true
    //     secret "password", isSafe("ana") -> false   (too common)
    //     secret "12ana3",   isSafe("ana") -> false   (contains the username)
    // Tools: equals, indexOf, -1, if/else
    public boolean isSafe(String username) {
        if (secret.equals("password") || secret.indexOf(username) != -1) {
            return false;
        }
        else {
            return true;
        }
    }
}
