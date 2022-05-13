
public class HtmlGreeter extends Greeter {

	private String tagName;

	@Override
	public String greet(String name) {
		return ("<" + tagName + ">" + greeting + ", " + name + "!" + "</" + tagName + ">");
	}

	public HtmlGreeter(String greeting) {
		super(greeting);
		tagName = "h1";
	}

	public HtmlGreeter(String greeting, String tagName) {
		super(greeting);
		this.tagName = tagName;
	}

}
