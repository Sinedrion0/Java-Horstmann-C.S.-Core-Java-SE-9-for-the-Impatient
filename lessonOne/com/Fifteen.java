package lessonOne.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Fifteen {
	 public static void main(String[] args) {
		 arrayListTriangle();
		 }
	 public static void arrayListTriangle() {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Write number of lines: ");
		 int lines = in.nextInt();
		 ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(lines);
		 for(int i = 0; i < lines; i++) {
			 list.add(new ArrayList<Integer>(i+1));
			 for(int j = 0; j < i+1; j++) {
			 list.get(i).add(0);
			 }
		 }
	
		 for(int i = 0; i < lines; i++) {
			 list.get(i).set(0,1);
			 list.get(i).set(list.get(i).size()- 1, 1);
			 for(int j = 1; j < i; j++) {
				list.get(i).set(j, list.get(i-1).get(j-1) + list.get(i-1).get(j));
			 }
		 }
		 
	 
		 for(ArrayList<Integer> i : list ) {
			 for(int k : i) 
				 System.out.print(k + " ");{ 
			 }
				 System.out.println(" ");
		 }
	 }
	 
	 public static void arrayTriangle() {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Write number of lines: ");
		 int lines = in.nextInt();
		 int array [][] = new int [lines][];
		 for(int i = 0; i < lines; i++) {
			 array[i] = new int [i+1];
			 array[i][0] = 1;
			 array[i][array[i].length-1] = 1;
		 for(int j = 1; j < i; j++) {
			 array[i][j] = array[i-1][j-1] + array[i-1][j]; 
		 	}
		 }
		 for(int i []  : array ) {
			 for(int k : i) 
				 System.out.print(k + " ");{ 
			 }
				 System.out.println(" ");
		 }
	 }
}

