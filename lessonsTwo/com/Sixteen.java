package lessonsTwo.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Sixteen {
	
	static LinkedList<Node> listOfNodes = new LinkedList<Node>();
	
	public void add(ArrayList <String> listOfStrings) {
		for(int i = 0; i < listOfStrings.size(); i++) {
			new Sixteen().addingToNode(listOfStrings.get(i));
		}
	}
	
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private class Node {
		@Override
		public String toString() {
			return "Node [word=" + word + "]";
		}

		String word;
	}
	
	public void addingToNode(String word) {
		Node node = new Node();
		node.word = word;
		if(listOfNodes.size() == 0) listOfNodes.add(0,node);		
		listOfNodes.add(listOfNodes.size()-1, node);
	}
	
	public static void main(String [] args) {
		ArrayList<String> linesOfString = new ArrayList<String>();
		linesOfString.add("соль");
		linesOfString.add("манка");
		linesOfString.add("кетчуп");
		linesOfString.add("хлопья");
		linesOfString.add("мёд");
		linesOfString.add("баранина");
		Sixteen six = new Sixteen();
		six.add(linesOfString);
		for(var v : six.listOfNodes) {System.out.println(v);}
	}
}
	
	
	
	
	
	
	
	
	