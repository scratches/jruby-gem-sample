package app;


public class Application {

	private demo.Application app;

	public Application() {
		app = new demo.Application();
	}

	public static void main(String[] args) {
		System.out.println(new Application().render());
	}
	
	private String render() {
		return "Hello (" + app.version() + ")";
	}
}
