package no.bekk.guice;



public class InjectionStartPoint {
	
	public String toString() {
		BindableClass injectedClass = TestingModule.injector().getInstance(ClassToBind.class);
		String daString = injectedClass.toString();
		System.out.println("This is me: "+daString);
		return daString;
	}

}
