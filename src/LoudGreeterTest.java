import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoudGreeterTest {
	@Test
	void testGreeting1() {
		String expected = "Hola, Peter!!!";
		LoudGreeter greeter = new LoudGreeter("Hola");
		String actual = greeter.greet("Peter");
		assertEquals(expected, actual);
	}

	@Test
	void testGreeting2() {
		String expected = "Hola, Peter!!!!!";
		LoudGreeter greeter = new LoudGreeter("Hola");
		greeter.addVolume();
		greeter.addVolume();
		String actual = greeter.greet("Peter");
		assertEquals(expected, actual);
	}
	
	@Test
	void testGreeting3() {
		String expected = "Hola, Peter!!!!!!!";
		LoudGreeter greeter = new LoudGreeter("Hola");
		greeter.addVolume();
		greeter.addVolume();
		greeter.addVolume();
		greeter.addVolume();
		String actual = greeter.greet("Peter");
		assertEquals(expected, actual);
	}
}
