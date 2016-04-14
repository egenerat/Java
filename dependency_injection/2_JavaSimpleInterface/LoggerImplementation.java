public class LoggerImplementation implements LoggerInterface {
	public void write(String msg) {
		System.out.println("Writing: " + msg);
	}
}