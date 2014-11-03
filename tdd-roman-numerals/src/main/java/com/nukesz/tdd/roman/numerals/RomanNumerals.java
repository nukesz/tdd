package com.nukesz.tdd.roman.numerals;

public class RomanNumerals {

	private static final int[] ARABIC_VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	private static final String[] ROMAN_SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV",
			"I"};

	public String arabicToRoman(final int arabic) {
		final StringBuilder result = new StringBuilder();
		int remaining = arabic;
		for (int i = 0; i < ARABIC_VALUES.length; i++) {
			remaining = appendRomanNumerals(result, remaining, ARABIC_VALUES[i], ROMAN_SYMBOLS[i]);
		}
		return result.toString();
	}

	private int appendRomanNumerals(final StringBuilder builder, int remaining, final int value, final String roman) {
		while (remaining >= value) {
			builder.append(roman);
			remaining -= value;
		}
		return remaining;
	}

}
