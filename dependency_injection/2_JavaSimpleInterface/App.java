public class App {
	private LoggerInterface log;

	public static void main(String... args) {
		App app = new App();
		app.setLogger(new LoggerImplementation());
		app.log.write("hello");
	}

	public void setLogger(LoggerInterface logger) {
		log = logger;
	}
}