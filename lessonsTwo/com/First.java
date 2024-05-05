package lessonsTwo.com;

import java.time.LocalDate;

public class First {
	 public static void main(String[] args) {
		 for(int i = 1; i <= 12; i++ ) {
			 calender(i);
			 System.out.println("\n");
		 	}
		 }		
	 public static void calender(int month) {
		 LocalDate date = LocalDate.of(2024, month, 1);
		 System.out.printf("%18s \n", date.getMonth());
		 System.out.printf(" %s %s %s %s %s %s %s", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		 System.out.print("\n");
		 for(int i = 0; i < date.getDayOfWeek().getValue(); i++ ) {
			 System.out.print("    ");
		 }
		 int firstLine = 7 - date.getDayOfWeek().getValue();
		 for(int k = 1; k <= firstLine; k++) {System.out.print("   " + k);}
		 System.out.print("\n");
		 int count = 0;
		 for(int j = firstLine+1; j <= date.lengthOfMonth(); j++) {
			 if(count == 7) {System.out.print("\n"); count = 0;}
			 System.out.printf("%4d", j);
			 count++;
		 }
	 }
}
