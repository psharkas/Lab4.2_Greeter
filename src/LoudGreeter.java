
public class LoudGreeter extends Greeter {

	private String extra = "!!";

	public void addVolume() {
		extra += "!";

	}

	@Override
	public String greet(String name) {
		return (greeting + ", " + name + "!" + extra);
	}

	public LoudGreeter(String greeting) {
		super(greeting);
		// TODO Auto-generated constructor stub
	}

}
