package com.ds.ds;

public class QueueDS<E> {

	private int front;
	private int end;
	private int capacity;
	private E data[];

	public QueueDS() {
		this(100);
	}

	public QueueDS(int capacity) {
		this.capacity = capacity;
		this.data = (E[]) new Object[capacity];
		front = -1;
		end = -1;
	}

	public void enQueue(E element) {
		if (front == -1 && end == -1) {
			front++;
			end++;
			data[end] = element;
		} else if (end + 1 < data.length) {
			end++;
			data[end] = element;
		}
	}

	public E deQueue() {
		E elem = null;
		if (size() <= 0) {
			elem = null;
		} else if (front == 0 || front < end) {
			elem = data[front];
			data[front] = null;
			front++;
		} else if (front == end) {
			this.data = (E[]) new Object[capacity];
			front = -1;
			end = -1;
		}
		return elem;
	}

	public int size() {
		int size;
		if (front == -1 && end == -1) {
			size = 0;
		} else {
			size = end - front + 1;
		}
		return size;
	}

	public boolean contains(String elem) {
		boolean found = false;
		if (front != -1 && end != -1) {
			for (int i = front; i <= end; i++) {
				if (null != elem && elem.equals(data[i])) {
					found = true;
					break;
				}
			}
		}
		return found;
	}
	
	public E elementAt(int pos) {
		E elem = null;
		int currIdx=1;
		if (front != -1 && end != -1) {
			for (int i = front; i <= end; i++) {
				if (currIdx == pos) {
					elem = data[i];
					break;
				}else {
					currIdx++;
				}
			}
		}
		return elem;
	}

	public E first() {
		return elementAt(1);
	}	

	public E last() {
		return elementAt(size());
	}	

}
