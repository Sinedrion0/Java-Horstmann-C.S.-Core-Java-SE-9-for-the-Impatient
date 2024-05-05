package lessonThree.com;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

public class Eleven {
	 public static void main(String [] args) {
			denotingDirection(new File("C:\\Nothing"));
			System.out.println(" ");
			denoting(new File("C:\\Nothing"));
			System.out.println(" ");
			denotingWithMethod(new File("C:\\Nothing"));
	 }
	 public static void denotingDirection(File f) {
		File[] array = f.listFiles((file)-> file.isDirectory());
		for(File count : array) System.out.println(count);
	 }
	 
	 public static void denoting(File f) {
			File[] array = f.listFiles(new FileFilter() {

				@Override
				public boolean accept(File pathname) {
					return pathname.isDirectory();
				}});
			for(File count : array) System.out.println(count);
		 }
	 public static void denotingWithMethod(File f) {
		 File[] array = f.listFiles(File::isDirectory);
		 for(File count : array) System.out.println(count);
	 }
}
