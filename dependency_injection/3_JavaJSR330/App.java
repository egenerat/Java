import javax.inject.Inject;

public class App {
	@Inject
	private LoggerInterface log;

	@Inject
	public void test() {

	}

	/*
	Dependency injection can be performed on:
    - the constructor of the class (construction injection)
    - a field (field injection)
    - the parameters of a method (method injection)

    According to JSR330 the injection is done in the following order:

	- constructor injection
    - field injection
    - method injection

	The order in which the methods or fields annotated with @Inject are called is not defined by JSR330. You cannot assume that the methods or fields are called in the order of their declaration in the class.
	
	Note
		As fields and method parameters are injected after the constructor is called, you cannot use injected member variables in the constructor.
	
	source: http://www.vogella.com/tutorials/DependencyInjection/article.html
    */

	public static void main(String... args) {
	}
}