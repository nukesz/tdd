package com.nukesz.tdd.roman.numerals;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nukesz.tdd.roman.numerals.RomanNumerals;


public class RomanNumeralsTest {

	private RomanNumerals romanNumerals;

	@BeforeMethod(alwaysRun = true)
	public void init() {
		romanNumerals = new RomanNumerals();
	}

	@Test(groups = "unit")
	public void convertOne() {
		assertNumbers(1, "I");
	}

	@Test(groups = "unit")
	public void convertTwo() {
		assertNumbers(2, "II");
	}

	@Test(groups = "unit")
	public void convertThree() {
		assertNumbers(3, "III");
	}

	@Test(groups = "unit")
	public void convertFour() {
		assertNumbers(4, "IV");
	}

	@Test(groups = "unit")
	public void convertFive() {
		assertNumbers(5, "V");
	}

	@Test(groups = "unit")
	public void convertSix() {
		assertNumbers(6, "VI");
	}

	@Test(groups = "unit")
	public void convertNine() {
		assertNumbers(9, "IX");
	}

	@Test(groups = "unit")
	public void convertTen() {
		assertNumbers(10, "X");
	}

	@Test(groups = "unit")
	public void convertTheRest() {
		assertNumbers(40, "XL");
		assertNumbers(50, "L");
		assertNumbers(90, "XC");
		assertNumbers(100, "C");
		assertNumbers(400, "CD");
		assertNumbers(500, "D");
		assertNumbers(900, "CM");
		assertNumbers(1000, "M");
	}

	@Test(groups = "unit")
	public void convertTheExampleYear() {
		assertNumbers(1988, "MCMLXXXVIII");
	}

	private void assertNumbers(final int arabic, final String roman) {
		assertEquals(romanNumerals.arabicToRoman(arabic), roman);
	}
}
