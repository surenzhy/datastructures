package com.ds.ds;

public class LinkedListDS<E> {

	private int size;
	private Node first;
	private Node last;

	public LinkedListDS() {
		this.size = 0;
		first = null;
		last = null;
	}

	public int size() {
		return size;
	}

	public void add(E element) {
		Node newNode = new Node(element);
		if (first == null) {
			first = newNode;
			last = first;
		} else {
			last.nextNode = newNode;
			last = newNode;
		}
		size++;
	}

	public E remove() {
		if (size() == 0) {
			return null;
		} else {
			E currElem = first.element;
			first = first.nextNode;
			size--;
			return currElem;
		}
	}

	private class Node {
		private E element;
		private Node nextNode;

		public Node(E element) {
			this.element = element;
		}

		public E getElement() {
			return element;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setElement(E element) {
			this.element = element;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

	}

}
