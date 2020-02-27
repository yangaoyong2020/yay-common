package com.yay.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String src=" ";
		boolean b = StringUtil.hasLength(src);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String src=" ";
		boolean b = StringUtil.hasText(src);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenerateChineseName() {
		fail("Not yet implemented");
	}

}
