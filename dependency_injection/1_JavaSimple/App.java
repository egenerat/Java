public class App {
	private Logger log;

	public static void main(String... args) {
		App app = new App();
		app.setLogger(new Logger());
		app.log.write("hello");
	}

	public void setLogger(Logger logger) {
		log = logger;
	}
}