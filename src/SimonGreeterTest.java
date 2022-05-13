import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimonGreeterTest {

	@Test
	void testGreeting1() {
		String expected = "Simon Says, " + "\"" + "Hola, Peter!" + "\"";
		SimonGreeter greeter = new SimonGreeter("Hola");
		String actual = greeter.greet("Peter");
		assertEquals(expected, actual);
	}

	@Test
	void testGreeting2() {
		String expected = "Simon Says, " + "\"" + "Annyeong haseyo, Joseph!" + "\"";
		SimonGreeter greeter = new SimonGreeter("Annyeong haseyo");
		String actual = greeter.greet("Joseph");
		assertEquals(expected, actual);
	}

}
