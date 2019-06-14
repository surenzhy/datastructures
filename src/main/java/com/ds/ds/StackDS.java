package com.ds.ds;

public class StackDS<T> {

	private T[] data;
	private int currentCounter;

	public StackDS() {
		data = (T[]) new Object[1000];
	}

	public void push(T value) {
		data[currentCounter++] = value;
	}

	public T pop() {
		if (currentCounter <= 0) {
			throw new RuntimeException("No elements in stack. Stack Size is [" + currentCounter + "]");
		}
		T tData = data[--currentCounter];
		data[currentCounter] = null;
		return tData;
	}

	public int size() {
		return currentCounter;
	}

	public boolean contains(T value) {
		if (currentCounter <= 0) {
			throw new RuntimeException("No elements in stack. Stack Size is [" + currentCounter + "]");
		}
		boolean found = false;
		for (int i = 0; i < currentCounter ; i++) {
			T d = data[i];
			if (d.equals(value)) {
				found = true;
				break;
			}
		}
		return found;
	}

}
