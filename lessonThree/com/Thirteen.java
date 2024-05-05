package lessonThree.com;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Thirteen {
	
	public static void main(String [] args) throws IOException {
		
			File f1 = new File("C:\\Nothing\\First Folde");
			File f2 = new File("C:\\Nothing\\Jessus.zip");
			File f3 = new File("C:\\Tides\\register key.txt");
			File f4 = new File("C:\\Marine books\\CodeFSS.pdf");
			File f5 = new File("C:\\SSD\\Textbook. Cargo  Operations_copy.pdf");
			File f6 = new File("C:\\Intel\\iGfx");
		
		File [] arrayOfFile = new File[] {f1,f2,f3,f4,f5,f6};
		/*
		Arrays.sort(arrayOfFile, (x,y) -> x.compareTo(y));
		for(File count : arrayOfFile) System.out.println(count.getAbsolutePath());
		*/
		System.out.println(" ");
		sortFiles(arrayOfFile);
		for(File count : arrayOfFile) System.out.println(count.getAbsolutePath());
	}
	public static void sortFiles(File[] files) {
        Arrays.sort(files, (o1, o2) -> {
            if (o1.isDirectory() && !o2.isDirectory()) {
                return -1;
            } else if (!o1.isDirectory() && o2.isDirectory()) {
                return 1;
            } else {
                return o1.compareTo(o2);
            }
        });
}
}
