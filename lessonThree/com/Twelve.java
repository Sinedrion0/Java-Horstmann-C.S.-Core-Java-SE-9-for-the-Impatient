package lessonThree.com;

import java.io.File;
import java.io.FilenameFilter;

public class Twelve {
	public static void main(String [] args) {
		denotingDirection(new File("C:\\Nothing"));
		System.out.println(" ");
		
 }
 public static void denotingDirection(File f) {
	File[] array = f.listFiles((file,name)-> new File(file,name).isDirectory());
	for(File count : array) System.out.println(count);
 }
}
