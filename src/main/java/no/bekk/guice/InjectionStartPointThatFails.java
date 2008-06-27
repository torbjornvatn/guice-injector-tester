package no.bekk.guice;



public class InjectionStartPointThatFails {
	
	public String toStringThatFails() {
		BindableClass injectedClassWithMissingBinding = TestingModule.injector().getInstance(ClassWithMissingBinding.class);
		String daString = injectedClassWithMissingBinding.toString();
		System.out.println("This is me: "+daString);
		return daString;
	}
}
