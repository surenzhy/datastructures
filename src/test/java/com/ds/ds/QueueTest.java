package com.ds.ds;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
	
	public void when_no_elements_than_throw_exception() {
		QueueDS<String> s = new QueueDS<String>();
		Assert.assertNull(s.deQueue());
	}
	
	public void when_no_elements_after_all_elements_poped_than_throw_exception() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.enQueue("2");
		s.enQueue("3");
		s.enQueue("4");
		s.enQueue("5");
		s.deQueue();
		s.deQueue();
		s.deQueue();
		s.deQueue();
		Assert.assertNull(s.deQueue());
	}

	
	@Test
	public void when_push_element_than_return_correct_size() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.enQueue("2");
		s.enQueue("3");
		s.enQueue("4");
		s.enQueue("5");
		
		Assert.assertEquals(5, s.size());
	}

	
	@Test
	public void when_push_elements_and_pop_element_than_return_correct_size() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.enQueue("2");
		s.enQueue("3");
		s.enQueue("4");
		s.enQueue("5");
		s.deQueue();
		Assert.assertEquals(4, s.size());
	}

	
	@Test
	public void when_push_element_and_pop_element_than_correct_element() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		Assert.assertEquals("1", s.deQueue());
	}

	@Test
	public void when_push_element_and_pop_element_than_size_zero() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.deQueue();
		Assert.assertEquals(0, s.size());
	}

	
	@Test
	public void when_push_elements_and_pop_element_than_first_element_popped() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.enQueue("2");
		s.enQueue("3");
		s.enQueue("4");
		s.enQueue("5");
		Assert.assertEquals("1", s.deQueue());
	}


	@Test
	public void when_push_elements_and_pop_two_elements_than_correct_element_popped() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.enQueue("2");
		s.enQueue("3");
		s.enQueue("4");
		s.enQueue("5");
		s.deQueue();
		Assert.assertEquals("2", s.deQueue());
	}

	@Test
	public void when_push_elements_and_pop_two_elements_than_correct_element_popped1() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.enQueue("2");
		s.enQueue("3");
		s.enQueue("4");
		s.enQueue("5");
		s.deQueue();
		Assert.assertNotEquals("4", s.deQueue());
	}

	@Test
	public void when_push_elements_and_all_elements_popped_than_size_zero() {
		QueueDS<String> s = new QueueDS<String>();
		s.enQueue("1");
		s.enQueue("2");
		s.enQueue("3");
		s.enQueue("4");
		s.enQueue("5");
		s.deQueue();
		s.deQueue();
		s.deQueue();
		s.deQueue();
		s.deQueue();
		Assert.assertEquals(0, s.size());
	}

	@Test
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

}
