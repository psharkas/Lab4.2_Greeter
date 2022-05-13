import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HtmlGreeterTest {
	
	@Test
	void testGreeting1() {
		String expected = "<h1>Hola, Peter!</h1>";
		HtmlGreeter greeter = new HtmlGreeter("Hola");
		String actual = greeter.greet("Peter");
		assertEquals(expected, actual);
	}

	@Test
	void testGreeting2() {
		String expected = "<p>Hola, Peter!</p>";
		HtmlGreeter greeter = new HtmlGreeter("Hola","p");
		String actual = greeter.greet("Peter");
		assertEquals(expected, actual);
	}
	
	@Test
	void testGreeting3() {
		String expected = "<div>Annyeong haseyo, Joseph!</div>";
		HtmlGreeter greeter = new HtmlGreeter("Annyeong haseyo","div");
		String actual = greeter.greet("Joseph");
		assertEquals(expected, actual);
	}
}
