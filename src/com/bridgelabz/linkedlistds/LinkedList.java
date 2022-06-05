package com.bridgelabz.linkedlistds;

public class LinkedList<E extends Comparable<E>> {

	Node<E> head;
	Node<E> tail;

	int size;

	public void push(E data) {
		Node<E> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			newNode.next = head;
			head = newNode;
			size++;
		}
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

	public void add(E data) {
		Node<E> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}

	}

	public E pop() {
		Node<E> temp = head;
		head = head.next;
		size--;
		return temp.data;

	}

	public E popLast() {
		Node<E> temp = head;
		Node<E> prevTemp = null;
		while (temp.next != null) {
			prevTemp = temp;
			temp = temp.next;
		}
		prevTemp.next = null;
		tail = prevTemp;
		size--;
		return temp.data;
	}

	public Node<E> search(E data) {
		Node<E> temp = head;
		Node<E> searchedNode = null;
		while (temp != null) {
			if (temp.data.compareTo(data) == 0) {
				searchedNode = temp;
			}
			temp = temp.next;
		}
		return searchedNode;

	}

	public boolean insertAfter(E searchData, E insertData) {
		Node<E> newNode = new Node<>(insertData);
		Node<E> searchedNode = search(searchData);
		boolean flag = false;
		if (searchedNode != null) {
			newNode.next = searchedNode.next;
			searchedNode.next = newNode;
			flag = true;
		}
		return flag;

	}

}
