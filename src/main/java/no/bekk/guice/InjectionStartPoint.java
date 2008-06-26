package no.bekk.guice;



public class InjectionStartPoint {
	
	public String toString() {
		BindableClass injectedClass = TestingModule.inject().getInstance(ClassToBind.class);
		return injectedClass.toString();
	}
}
