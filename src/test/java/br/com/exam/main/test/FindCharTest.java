package br.com.exam.main.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.exam.api.StreamAPI;
import br.com.exam.impl.StreamStringImpl;
import br.com.exam.main.FindChar;

public class FindCharTest {

	@Test
	public void testFirstNonRepeatedChar() {
		StreamAPI streamOne = new StreamStringImpl("aAbBaaaaACd");
		StreamAPI streamTwo = new StreamStringImpl("aAbBABac");
		StreamAPI streamThree = new StreamStringImpl("DgTDhhjJjJ");
		StreamAPI streamFour = new StreamStringImpl("0178aA0189"); 
		StreamAPI streamFive = new StreamStringImpl("bBbhlkjhhjklBtTyuio");
		
		assertEquals('b', FindChar.firstChar(streamOne));
		assertEquals('b', FindChar.firstChar(streamTwo));
		assertEquals('g', FindChar.firstChar(streamThree));
		assertEquals('7', FindChar.firstChar(streamFour));
		assertEquals('t', FindChar.firstChar(streamFive));
	}
	
	@Test
	public void testMatchNotFound() {
		StreamAPI streamOne = new StreamStringImpl("aaaa"); // Nao existe primeiro nao repetido
		
		assertEquals(0, FindChar.firstChar(streamOne));
	}
}
