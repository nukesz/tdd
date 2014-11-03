package com.nukesz.tdd.fizzbuzz;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nukesz.tdd.fizzbuzz.FizzBuzz;


public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@BeforeMethod
	public void initFizzBuzzObject() {
		fizzBuzz = new FizzBuzz();
	}

	@Test(groups = "unit")
	public void callGetResultWithOne() {
		assertEquals(fizzBuzz.getResult(1), "1");
	}

	@Test(groups = "unit")
	public void callGetResultWithTwo() {
		assertEquals(fizzBuzz.getResult(2), "2");
	}

	@Test(groups = "unit")
	public void callingGetResultWithThreeShouldReturnFizz() {
		assertEquals(fizzBuzz.getResult(3), "Fizz");
	}

	@Test(groups = "unit")
	public void multipleOfThreeShouldReturnFizz() {
		assertEquals(fizzBuzz.getResult(9), "Fizz");
	}

	@Test(groups = "unit")
	public void fiveShouldReturnBuzz() {
		assertEquals(fizzBuzz.getResult(5), "Buzz");
	}

	@Test(groups = "unit")
	public void multipleOfFiveShouldReturnBuzz() {
		assertEquals(fizzBuzz.getResult(10), "Buzz");
	}

	@Test(groups = "unit")
	public void multipleOfThreeAndFiveShouldReturnFizzBuzz() {
		assertEquals(fizzBuzz.getResult(15), "FizzBuzz");
	}
}
