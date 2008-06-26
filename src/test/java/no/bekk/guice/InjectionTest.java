package no.bekk.guice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class InjectionTest {
	
	@Test
	public void shouldInjectDefinedBinding() {
		InjectionStartPoint injectionStartPoint = new InjectionStartPoint();
		assertEquals(injectionStartPoint.toString(), "one two three");
	}

}
