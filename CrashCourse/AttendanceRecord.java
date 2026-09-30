// Class that represents a student’s attendance record
public class AttendanceRecord {
   private String name;
   private int daysPresent;
 
   public AttendanceRecord(String n, int d) {
      name = n;
      daysPresent = d;
   }
 
   public void markPresent() {
      daysPresent++;
   }
 
   public void printAttendance() {
      System.out.println(name + " — Days Present: " + daysPresent);
   }
}
// Tester class that updates attendance
class AttendanceTester {
   public static void main(String[] args) {
      // write code to create two AttendanceRecord objects:
	AttendanceRecord Jordan = new AttendanceRecord("Jordan", 4);
AttendanceRecord Riley = new AttendanceRecord("Riley", 7);
      // one named "Jordan" with 4 days present
      // one named "Riley" with 7 days present
 
      // mark Jordan present once more
 	Jordan.markPresent();
      // print attendance for both students
	Jordan.printAttendance();
Riley.printAttendance();
   }
}
