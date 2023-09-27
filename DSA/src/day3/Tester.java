package day3;
//import package

import java.util.ArrayList; // Importing the ArrayList class
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

class Tester {
	public static void main(String[] args) {
		List<String>  food1 = new ArrayList<String>(); // Creating a list of String elements
		List<String>  food2 = new ArrayList<String>();
		
		/*	List  food = new ArrayList();
		 * Raw generic 
		 * will allow hetrogeneous data
		 */
		//food is listName
		//cannot instantiate List becoz its a interface
		//calling method .add()
		
		food1.add("Pizza"); // Adding elements
		food1.add("Burger");
		food1.add("Pasta");
		food1.add("Coffee");
		food2.add("Sandwich");
		System.out.println("Food items: " + food1);
		System.out.println("Size of List 1: "+food1.size());
		food2.add(1,"Coffee");
		food2.add(0,"Maggie");
		System.out.println("Food items: " + food2);
		System.out.println("Size of List 2: "+food2.size());
		
		food1.addAll(food2);
		System.out.println("Food items: " + food1);
		System.out.println("Size of List 1: "+food1.size());
		
		//food1.remove(2);
		//System.out.println("Food items: " + food1);
		//System.out.println("Size of List 1: "+food1.size());
		
		//food1.remove("Coffee");//removes first occurrence of Coffee and is case sensitive
		//System.out.println("Food items: " + food1);
		//System.out.println("Size of List 1: "+food1.size());
		
		//System.out.println(food1.contains("Maggie"));
		
		/*
		 food1.removeAll(food2);
		System.out.println("Food items: " + food1);
		System.out.println("Size of List 1: "+food1.size());
		*/
		
		System.out.println("Food items: " + food2.get(2));//get method used to fetch element 
		
		/*System.out.print("//////////////////////////////////////////\n");
		
		//For each loop
		for(String s:food1)//s of type String
			System.out.println(s);
		*/
		System.out.print("//////////////////////////////////////////\n");
		
		//using List Iterator interface
		Iterator<String> iterator=food1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.print("//////////////////////////////////////////\n");
		
		ListIterator<String> listIterator=food1.listIterator();
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
				
		//Can list hold data of hetrogenous type: it can; but here we restricting to String
		/*
		food.add(10); 
		will work only if raw generic is defined
		System.out.println("Food items: " + food);
		System.out.println("Size of List: "+food.size());
		*/
		
		
		
		
		
		
	}
}