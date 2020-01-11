package com.rakuten.prj.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayUtilTest {

	@Test
	void testGetSum() {
		int[] values = {45,10,-5};
		int expected = 50;
		assertEquals(expected,ArrayUtil.getSum(values));
	}

	@Test
	void testGetOccurance() {
		int[] values = {43,6,77,6,12,6};
		int expected = 3;
		assertEquals(expected,ArrayUtil.getOccurance(values,6));
	}

	@Test
	void testSort() {
		int[] nos = {6,2,78,12,90};
		ArrayUtil.sort(nos);
		int[] expected = {2,6,12,78,90};
		assertArrayEquals(expected, nos); //assertEquals will compare the address, use assertArrayEquals here
	}

}
