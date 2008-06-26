package no.bekk.guice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InjectionTest {
	
	@Test
	public void shouldInjectDefinedBinding() {
		BindableClass injectionStartPoint = TestingModule.inject().getInstance(ClassToBind.class);
		Assert.assertEquals(injectionStartPoint.toString().trim(), "one two three");
	}

}
