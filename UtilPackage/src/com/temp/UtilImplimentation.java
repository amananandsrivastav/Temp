package com.temp;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.Vector;

public class UtilImplimentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//used for taking input from user
		Scanner sc=new Scanner(System.in);
		
		LinkedList<String> cityll = new LinkedList<String>();
		
		System.out.print("\nenter a city in linkedlist");
		
		cityll.add(sc.nextLine()); // taking input from user 
		
		
		cityll.add("banglore");
		cityll.add("pune");
		cityll.add("chennai");
		cityll.add("Noida");
		System.out.print("\nlinkedlist ------------------------------");
		//navigate and print using for each loop
		System.out.println("\nnavigate and print linkedlist using for each loop");
		for(String s :cityll) {
			System.out.println(s);
		}
		
		//List demo
		List<String> city=new ArrayList<String>();
		
		city.add("banglore");
		city.add("pune");
		city.add("chennai");
		city.add("Noida");
		
		
		//navigate and print using for each loop
		System.out.println("\nnavigate and print List  using for each loop");
		for(String s :city) {
			System.out.println(s);
		}
		
		//navigate and print using for each loop
		
		System.out.println("\nnavigate and print using for loop");
		for(int i=0;i<city.size();i++) {
			System.out.println(city.get(i));
		}
		
		//navigate and print using Iterator
		System.out.println("\nnavigate and print using Iterator");
		Iterator i=city.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("\nVector  each using for loop");
		
			Vector<String> v=new Vector<String>();
			v.addElement("vector 1");
			v.addElement("vector 2");
			v.addElement("vector 3");
			v.addElement("vector 4");
			
			for(String str:v) {
				System.out.println(str);
			}
			
			//Set collection
			// creating HashSet
			
			System.out.println("\n");
			System.out.println("HashSet Demo ");
			HashSet<Integer> setOfNumbers = new HashSet<Integer>();
			setOfNumbers.add(101);
			setOfNumbers.add(103);
			setOfNumbers.add(102);
			setOfNumbers.add(104);

			// Navigate and print each element of the listArrayList
			System.out.println("List of numbers in setOfNumbers using simplied for loop \n");
			for (int num : setOfNumbers) {
				System.out.println(num);
			}
			
			//HashMap collection
			
			System.out.println("HashMap demo-----------------------------");
			HashMap<String,Integer> hm=new HashMap<String,Integer>();
			hm.put("Delhi",45);
			hm.put("Shimla",0);
			hm.put("Jaipur",53);
			hm.put("pune",37);
			
			System.out.println("pune has temp= "+hm.get("pune"));
			
			//navigate map
			System.out.println("\nnavigate Hashmap----------------------------");
			for(Map.Entry n: hm.entrySet()) {
				System.out.println(n);
			}
			
			//tree map
			System.out.println("TreeMap demo-----------------------------");
			TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
			tm.put("Delhi",45);
			tm.put("Shimla",0);
			tm.put("Jaipur",53);
			tm.put("pune",37);
			
			System.out.println("pune has temp= "+tm.get("pune"));
			
			//navigate map
			System.out.println("\nnavigate Treemap----------------------------");
			for(Map.Entry z: tm.entrySet()) {
				System.out.println(z);
			}
			
			
			// Queue Demo----------------------
			
			 Queue<String> queue = new LinkedList<>();
			 
		        queue.add("apple");
		        queue.add("banana");
		        queue.add("cherry");
		 
		        // print the queue
		        System.out.println("Queue: " + queue);
		 
		        // remove the element at the front of the queue
		        String front = queue.remove();
		        System.out.println("Removed element: " + front);
		 
		        // print the updated queue
		        System.out.println("Queue after removal: " + queue);
		 
		        // add another element to the queue
		        queue.add("date");
		 
		        // peek at the element at the front of the queue
		        String peeked = queue.peek();
		        System.out.println("Peeked element: " + peeked);
		 
		        // print the updated queue
		        System.out.println("Queue after peek: " + queue);
			
			
	}

}
