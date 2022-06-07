package com.bridgelabz.linkedlistds;

public class LinkedListMain {

	public static void main(String args[]) {

		LinkedList<Integer> LinkedList = new LinkedList<>();

		// UC-2

//		LinkedList.push(70);  
//		LinkedList.push(30);
//		LinkedList.push(56);
//		LinkedList.print();

		// UC-3

		LinkedList.add(56);
		LinkedList.add(30);
		LinkedList.add(70);
		LinkedList.print();
		
		//UC-4
//		LinkedList.insert(30);
//		System.out.println("\nAfter inserting the 30 between 56 and 70");
//		LinkedList.print();

		// UC-5

//		int deletedData = LinkedList.pop();    
//		System.out.println();
//		System.out.println("popped head element: " +deletedData);
//		LinkedList.print();

		// UC-6

//		int poppedLastData = LinkedList.popLast();    
//		System.out.println("popped last element: " +poppedLastData);
//		LinkedList.print();
//		System.out.println();
//		System.out.println("Linked List size: " +LinkedList.size);

		//UC-7
		
//		System.out.println();
//		if (LinkedList.search(30) != null) {    //We can change the search value to check else condition (eg. 35)
//			System.out.println("Element is found!!");
//		} else {
//			System.out.println("Element not found!!");
//		}
		
		//UC-8
		System.out.println();
		if (LinkedList.insertAfter(30, 40)) {
			System.out.println("Elemet inserted successfully!!");
		} else {
			System.out.println("After element not found!!");
		}
		LinkedList.print();

	}

}
