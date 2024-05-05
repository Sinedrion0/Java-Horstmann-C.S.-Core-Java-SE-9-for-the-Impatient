package lessonOne.com;

import java.util.Scanner;

public class Fourteen {
	 public static void main(String[] args) {
		 int value = 0;
		 int row = 0;
		 boolean loop = true;
		 int [][] array = new int [4][4];
		 String [][] numbersTogether = new String[4][4];
		 Scanner scan = new Scanner(System.in);
		 
		 while(loop == true) {
		 String line = "";
		 System.out.println("Write " + Integer.toString(row) + "th" + " row: ");
		 numbersTogether[row] = scan.nextLine().split(", ", 4);
		 for(int i = 0; i < 4; i++) {
			 array[row][i] = Integer.parseInt(numbersTogether[row][i]); 
		 }
		 row++;
		 if(row == 4) loop = false;
		 }
		 
		 int [] sum = new int [4];
		 for(int i = 0; i < 4; i++) {
			 for(int j = 0; j < 4; j++) {
				 sum[i]+= array[i][j];
			 }
		 }
		 
		 for(int i = 1; i < sum.length; i++) {
			if (sum[0] == sum [i]) value++;
			else {break;}
		 }
		 
		 int colomns[] = new int [4];
		 for(int i = 0; i < sum.length; i++) {
			 for(int j = 0; j < sum.length; j++) {
				 colomns[i] += array[j][i] ;
			 }
			if( colomns[i] == sum[i]) value++;
			else break;
		 }
		 
		 int diagonalLeft = 0;
		 for(int i = 0; i < array.length; i++) {
			 for(int j = i; j <= i; j++) {
				 diagonalLeft += array[i][j];
			 }
		 }
		 
		 int diagonalRight = 0;
		 int count = 3;
		 for(int i = 0; i < array.length; i++) {
				 diagonalRight += array[i][count--];
			 }
		 
		 
		 if(diagonalLeft == diagonalRight) value++;
		 
		 if(value == 8) System.out.println("Posistive");
		 else System.out.println("Negative");
		 
	 }
}
