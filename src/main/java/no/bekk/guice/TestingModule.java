package no.bekk.guice;


import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestingModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(BindableClass.class).to(ClassToBind.class);
	}
	
    private static Injector injector;
    
    public static Injector injector() {
        if (injector == null) {
            injector = Guice.createInjector(new TestingModule());
        }
        return injector;
    }
}