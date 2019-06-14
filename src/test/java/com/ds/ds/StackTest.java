package com.ds.ds;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {
	
	@Test(expected = RuntimeException.class)
	public void when_no_elements_than_throw_exception() {
		StackDS<String> s = new StackDS<String>();
		s.pop();
	}
	
	@Test
	public void when_push_element_than_return_correct_size() {
		StackDS<String> s = new StackDS<String>();
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");
		s.push("5");
		
		Assert.assertEquals(5, s.size());
	}

	
	@Test
	public void when_push_elements_and_pop_element_than_return_correct_size() {
		StackDS<String> s = new StackDS<String>();
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");
		s.pop();
		Assert.assertEquals(3, s.size());
	}

	
	@Test
	public void when_push_element_and_pop_element_than_size_zero() {
		StackDS<String> s = new StackDS<String>();
		s.push("1");
		s.pop();
		Assert.assertEquals(0, s.size());
	}

	@Test
	public void when_push_elements_and_pop_element_than_last_element_popped() {
		StackDS<String> s = new StackDS<String>();
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");
		Assert.assertEquals("4", s.pop());
	}


	@Test
	public void when_push_elements_and_pop_two_elements_than_correct_element_popped() {
		StackDS<String> s = new StackDS<String>();
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");
		s.pop();
		Assert.assertEquals("3", s.pop());
	}

	@Test
	public void when_push_elements_and_all_elements_popped_than_size_zero() {
		StackDS<String> s = new StackDS<String>();
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		Assert.assertEquals(0, s.size());
	}

	@Test
	public void when_push_elements_and_check_element_present() {
		StackDS<String> s = new StackDS<String>();
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");
		Assert.assertEquals(true, s.contains("3"));
	}

	@Test
	public void when_push_elements_and_check_element_not_present() {
		StackDS<String> s = new StackDS<String>();
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");
		Assert.assertEquals(false, s.contains("10"));
	}

	@Test
	public void when_push_elements_and_check_element_not_present_after_pop() {
		StackDS<String> s = new StackDS<String>();
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");
		s.pop();
		Assert.assertEquals(false, s.contains("4"));
	}

}
