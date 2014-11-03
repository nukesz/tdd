package com.nukesz.tdd.fizzbuzz;

public class FizzBuzz {

	public String getResult(final int number) {
		final StringBuilder result = new StringBuilder();
		handleFizzy(number, result);
		handleBuzzy(number, result);
		handleOthers(number, result);
		return result.toString();
	}

	private void handleFizzy(final int number, final StringBuilder result) {
		if (isMultipleOfThree(number)) {
			result.append("Fizz");
		}
	}

	private boolean isMultipleOfThree(final int number) {
		return isMultipleOf(number, 3);
	}

	private boolean isMultipleOf(final int number, final int quotient) {
		return number % quotient == 0;
	}

	private void handleBuzzy(final int number, final StringBuilder result) {
		if (isMultipleOfFive(number)) {
			result.append("Buzz");
		}
	}

	private void handleOthers(final int number, final StringBuilder result) {
		if (result.length() == 0) {
			result.append(number);
		}
	}

	private boolean isMultipleOfFive(final int number) {
		return isMultipleOf(number, 5);
	}
}
