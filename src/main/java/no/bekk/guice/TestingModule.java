package no.bekk.guice;


import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestingModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(BindableClass.class).to(ClassToBind.class);
	}
	
	public static Injector inject() {
		TestingModule testingModule = new TestingModule();
		testingModule.configure();
		return Guice.createInjector(testingModule);
	}
}