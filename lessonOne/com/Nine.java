package lessonOne.com;

public class Nine {
	public static void main(String[] args) {
		String greating = "Hello World!";
		String subGreating = greating.substring(6, greating.length());
		String aGreating = "World!";
		String joinGreating = aGreating.join("","W","o","r","l","d","!");
		String bGreating = "World!";
		
		if(greating == subGreating) {System.out.println("greating == subGreating");}
		else {System.out.println("greating != subGreating");}
		System.out.println(greating.equals(subGreating));
		
		if(greating == "Hello World!") {System.out.println("greating == Hello World!");}
		else {System.out.println("greating != Hello World!");}
		System.out.println("Hello World!".equals(greating));
		
		if(subGreating == "World!") {System.out.println("subGreating == World!");}
		else {System.out.println("subGreating != World!");}
		System.out.println("World!".equals(subGreating));
		
		if(aGreating == "World!") {System.out.println("aGreating == World!");}
		else {System.out.println("aGreating != World!");}
		System.out.println("World!".equals(aGreating));
		
		if(joinGreating == "World!") {System.out.println("joinGreating == World!");}
		else {System.out.println("joinGreating != World!");}
		System.out.println("World!".equals(joinGreating));
		System.out.println(joinGreating);
		
		if(bGreating == aGreating) {System.out.println("bGreating == aGreating");}
		else {System.out.println("bGreating != World!");}
		System.out.println(aGreating.equals(bGreating));
		
	}
}
