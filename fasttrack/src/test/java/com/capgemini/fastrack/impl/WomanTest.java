package com.capgemini.fastrack.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.capgemini.fasttrack.Food;
import com.capgemini.fasttrack.Human;
import com.capgemini.fasttrack.Supermarket;
import com.capgemini.fasttrack.impl.Lidl;
import com.capgemini.fasttrack.impl.Meat;
import com.capgemini.fasttrack.impl.Woman;

class WomanTest {
	
	private Human underTest;
	private Meat meat = new Meat();
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp");
		Supermarket lidl = mock(Lidl.class);
		when(lidl.buy(Mockito.anyFloat())).thenReturn(meat);
		underTest = new Woman(lidl);
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
	
	@Test
	void cookingTest() {
		underTest.setName("Hildegard");
		Food expected = meat;
		Food actual = underTest.cooking(50);
		assertEquals(expected, actual);
	}
	
	@Test
	void cookingToLittleBudgetTest() {
		underTest.setName("Hildegard");
		assertThrows(IllegalArgumentException.class, () -> underTest.cooking(200));
	}

}
