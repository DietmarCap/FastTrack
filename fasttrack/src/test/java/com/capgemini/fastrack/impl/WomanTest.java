package com.capgemini.fastrack.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.fasttrack.Human;
import com.capgemini.fasttrack.impl.Woman;

class WomanTest {
	
	private Human underTest;

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp");
		underTest = new Woman();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	void speakTest() {
		underTest.setName("Hildegard");
		String expected = "Hello my name is Hildegard";
		String actual = underTest.speak();
		assertEquals(expected, actual);
	}

}
