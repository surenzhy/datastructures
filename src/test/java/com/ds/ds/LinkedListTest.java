package com.ds.ds;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
	
	@Test
	public void when_no_elements_than_return_null() {
		LinkedListDS<String> s = new LinkedListDS<String>();
		Assert.assertNull(s.remove());
	}
	
	@Test
	public void when_no_elements_after_all_elements_removed_than_return_null() {
		LinkedListDS<String> s = new LinkedListDS<String>();
		s.add("1");
		s.add("2");
		s.remove();
		s.remove();
		s.add("3");
		s.remove();
		Assert.assertNull(s.remove());
	}

	
	@Test
	public void when_push_element_than_return_correct_size() {
		LinkedListDS<String> s = new LinkedListDS<String>();
		s.add("1");
		s.add("2");
		s.remove();
		s.add("3");
		Assert.assertEquals(2, s.size());
	}

	
	@Test
	public void when_push_elements_and_remove_element_than_return_correct_size() {
		LinkedListDS<String> s = new LinkedListDS<String>();
		s.add("1");
		s.add("2");
		s.remove();
		Assert.assertEquals(1, s.size());
	}

	
	@Test
	public void when_push_element_and_remove_element_than_correct_element() {
		LinkedListDS<String> s = new LinkedListDS<String>();
		s.add("1");
		s.add("2");
		Assert.assertEquals("1", s.remove());
		Assert.assertEquals("2", s.remove());
	}

	@Test
	public void when_push_element_and_pop_element_than_size_zero() {
		LinkedListDS<String> s = new LinkedListDS<String>();
		s.add("1");
		s.add("2");
		s.remove();
		s.remove();
		Assert.assertEquals(0, s.size());
	}

	
	@Test
	public void when_push_elements_and_pop_element_than_first_element_popped() {
		LinkedListDS<String> s = new LinkedListDS<String>();
		s.add("1");
		s.add("2");
		Assert.assertEquals("1", s.remove());
	}


	@Test
	public void when_push_elements_and_pop_two_elements_than_correct_element_popped() {
		LinkedListDS<String> s = new LinkedListDS<String>();
		s.add("1");
		s.add("2");
		s.add("3");
		s.add("4");
		s.remove();
		Assert.assertEquals("2", s.remove());
	}

	@Test
	public void when_push_elements_and_pop_two_elements_than_correct_element_popped1() {
		LinkedListDS<String> s = new LinkedListDS<String>();
		s.add("1");
		s.add("2");
		s.add("3");
		s.add("4");
		s.remove();
		Assert.assertNotEquals("1", s.remove());
	}

	@Test
	public void when_push_elements_and_all_elements_popped_than_size_zero() {
		LinkedListDS<String> s = new LinkedListDS<String>();
		s.add("1");
		s.add("2");
		s.add("3");
		s.add("4");
		s.remove();
		s.remove();
		s.remove();
		s.remove();
		Assert.assertEquals(0, s.size());
	}

/*	@Test
	public void when_push_elements_and_check_element_present() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.enQueue("2");
		s.enQueue("3");
		s.enQueue("4");
		s.enQueue("5");
		Assert.assertEquals(true, s.contains("3"));
	}

	@Test
	public void when_push_elements_and_check_element_not_present() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.enQueue("2");
		s.enQueue("3");
		s.enQueue("4");
		s.enQueue("5");
		Assert.assertEquals(false, s.contains("10"));
	}

	@Test
	public void when_push_elements_and_check_element_not_present_after_pop() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.enQueue("2");
		s.enQueue("3");
		s.enQueue("4");
		s.enQueue("5");
		s.deQueue();
		Assert.assertEquals(false, s.contains("1"));
	}

	@Test
	public void when_push_elements_and_check_element_at_first_pos() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.enQueue("2");
		s.enQueue("3");
		s.enQueue("4");
		s.enQueue("5");
		Assert.assertEquals("1", s.elementAt(1));
	}

	@Test
	public void when_push_elements_and_check_element_at_first_pos1() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.enQueue("2");
		s.enQueue("3");
		s.enQueue("4");
		s.enQueue("5");
		Assert.assertEquals("1", s.first());
	}


	@Test
	public void when_push_elements_and_check_element_at_invalid_pos() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.enQueue("2");
		s.enQueue("3");
		s.enQueue("4");
		s.enQueue("5");
		Assert.assertNull(s.elementAt(8));
	}

	@Test
	public void when_push_elements_and_check_element_at_last_pos() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.enQueue("2");
		s.enQueue("3");
		s.enQueue("4");
		s.enQueue("5");
		Assert.assertEquals("5", s.elementAt(s.size()));
	}

	@Test
	public void when_push_elements_and_check_element_at_last_pos1() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.enQueue("2");
		s.enQueue("3");
		s.enQueue("4");
		s.enQueue("5");
		Assert.assertEquals("5", s.last());
	}
*/	

	
}
