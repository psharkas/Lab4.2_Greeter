import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTest {

	@Test
	void testGreeting1() {
		String expected = "Hola, Peter!";
		Greeter greeter = new Greeter("Hola");
		String actual = greeter.greet("Peter");
		assertEquals(expected, actual);
	}

	@Test
	void testGreeting2() {
		String expected = "Annyeong haseyo, Joseph!";
		Greeter greeter = new Greeter("Annyeong haseyo");
		String actual = greeter.greet("Joseph");
		assertEquals(expected, actual);
	}

}
