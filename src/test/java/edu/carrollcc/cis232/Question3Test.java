package edu.carrollcc.cis232;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class Question3Test {

	@Test
	public void testWordCountMethodExists() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("wordCount", String.class);
			assertTrue("wordCount must return an int", m.getReturnType().getName().equals("int"));
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (NoSuchMethodException e) {
			fail("Question3 must have method wordCount");
		} 
	}
	
	@Test
	public void testWordCountOnMultipleWords() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("wordCount", String.class);
			int count = (Integer)m.invoke(clazz, "this has four words.");
			
			assertEquals("Failed 4 word test", count, 4);
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method wordCount");
		}
	}
	
	@Test
	public void testWordCountOnOneWord() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("wordCount", String.class);
			int count = (Integer)m.invoke(clazz, "hi ");
			
			assertEquals("Failed 1 word test", count, 1);
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method wordCount");
		} 
	}
	
	@Test
	public void testWordCountZeroWords() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("wordCount", String.class);
			int count = (Integer)m.invoke(clazz, " ");
			
			assertEquals("Failed 0 word test", count, 0);
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method wordCount");
		} 
	}
	
	@Test
	public void testWordCountNull() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("wordCount", String.class);
			String input = null;
			int count = (Integer)m.invoke(clazz, input);
			assertEquals("Failed 0 word test", count, 0);
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method wordCount");
		} 
	}
	
	@Test
	public void testWordCountWithPunctuation() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("wordCount", String.class);
			int count = (Integer)m.invoke(clazz, "These are a couple of sentences. The word count should be correct!");
			
			assertEquals("Failed 12 word test", count, 12);
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method wordCount");
		} 
	}
	
	@Test
	public void testArrayToStringMethodExists() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("arrayToString", char[].class);
			assertEquals("arrayToString must return a String", m.getReturnType(), String.class);
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method arrayToString");
		} 
	}
	
	@Test
	public void testArrayToStringMethodNormal() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			char[] array = {'h','e','l','l','o'};
			Method m = clazz.getDeclaredMethod("arrayToString", char[].class);
			String result = (String)m.invoke(clazz, array);
			
			assertEquals("Failed String conversion for 'hello'", result, "hello");
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method arrayToString");
		} 
	}
	
	@Test
	public void testArrayToStringMethodEmpty() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			char[] array = {};
			Method m = clazz.getDeclaredMethod("arrayToString", char[].class);
			String result = (String)m.invoke(clazz, array);
			
			assertEquals("Failed String conversion for ''", result, "");
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method arrayToString");
		} 
	}
	
	@Test
	public void testArrayToStringMethodNull() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			char[] array = null;
			Method m = clazz.getDeclaredMethod("arrayToString", char[].class);
			String result = (String)m.invoke(clazz, array);
			assertEquals("Failed String conversion for null to empty string", result, "");
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method arrayToString");
		} 
	}
	
	@Test
	public void testMostFrequestExists() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("mostFrequent", String.class);

			assertEquals("mostFrequent must return a char", m.getReturnType(), Character.class);
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method mostFrequent");
		} 
	}
	
	@Test
	public void testMostFrequentNull() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("mostFrequent", String.class);

			String input = null;
			Character result = (Character)m.invoke(clazz, input);
			assertEquals("mostFrequent should return null on null input", result, null);
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method mostFrequent");
		} 
	}
	
	@Test
	public void testMostFrequentEmpty() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("mostFrequent", String.class);

			String input = "";
			Character result = (Character)m.invoke(clazz, input);
			assertEquals("mostFrequent should return null on '' input", result, null);
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method mostFrequent");
		} 
	}
	
	@Test
	public void testMostFrequentA() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("mostFrequent", String.class);

			String input = "a is a character that has a lot of aaaa";
			Character result = (Character)m.invoke(clazz, input);
			Character expected = 'A';
			assertEquals("mostFrequent should return A on 'a is a character that has a lot of aaaa' input", result, expected);
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method mostFrequent");
		} 
	}
	
	@Test
	public void testMostFrequentAOneChar() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("mostFrequent", String.class);

			String input = "a";
			Character result = (Character)m.invoke(clazz, input);
			Character expected = 'A';
			assertEquals("mostFrequent should return A on 'a' input", result, expected);
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method mostFrequent");
		} 
	}
	
	@Test
	public void testReplaceSubstringExists() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("replaceSubstring", String.class, String.class, String.class);

			assertEquals("replaceSubstring must return a String", m.getReturnType(), String.class);
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method replaceSubstring");
		} 
	}
	
	@Test
	public void testReplaceSubstringExample() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("replaceSubstring", String.class, String.class, String.class);
			String string1 = "the dog jumped over the fence";
			String string2 = "the";
			String string3 = "that";
			
			String result = (String)m.invoke(clazz, string1, string2, string3);
			
			assertEquals("replaceSubstring must work like example", result, "that dog jumped over that fence");
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method replaceSubstring");
		} 
	}
	
	@Test
	public void testReplaceSubstringNullString2() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("replaceSubstring", String.class, String.class, String.class);
			String string1 = "the dog jumped over the fence";
			String string2 = null;
			String string3 = "that";
			
			String result = (String)m.invoke(clazz, string1, string2, string3);
			
			assertEquals("replaceSubstring must work with second argument null", result, string1);
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method replaceSubstring");
		} 
	}
	
	@Test
	public void testReplaceSubstringNullString1() {
		try {
			Class<?> clazz = Class.forName("edu.carrollcc.cis232.Question3");
			assertNotNull("Question3 class does not exist at edu.carrollcc.cis232", clazz);
			Method m = clazz.getDeclaredMethod("replaceSubstring", String.class, String.class, String.class);
			String string1 = null;
			String string2 = "the";
			String string3 = "that";
			
			String result = (String)m.invoke(clazz, string1, string2, string3);
			
			assertEquals("replaceSubstring must work with null first argument", result, string1);
		} catch (ClassNotFoundException e) {
			fail("Question3 does not exist!");
		} catch (Exception e) {
			fail("Question3 must have method replaceSubstring");
		} 
	}
	
}
