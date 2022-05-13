import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a greeting: ");
		String greeting = scanner.nextLine();

		System.out.println("Enter a name: ");
		String name = scanner.nextLine();

		System.out.println("How much volume to add? ");
		int volume = scanner.nextInt();

		// normal
		Greeter greeter = new Greeter(greeting);
		System.out.println(greeter.greet(name));

		// simongreeter
		SimonGreeter greeter2 = new SimonGreeter(greeting);
		System.out.println(greeter2.greet(name));

		// loud greeting
		LoudGreeter greeter3 = new LoudGreeter(greeting);
		for (int i = 0; i < volume; i++) {
			greeter3.addVolume();
		}
		System.out.println(greeter3.greet(name));

		// html tag greeter
		HtmlGreeter greeter4 = new HtmlGreeter(greeting, "p");
		System.out.println(greeter4.greet(name));

		scanner.close();

	}

}
