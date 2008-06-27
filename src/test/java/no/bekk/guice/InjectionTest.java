package no.bekk.guice;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class InjectionTest {
	
	@Test
	public void shouldInjectDefinedBindingUsingRegularCreation() {
		InjectionStartPoint injectionStartPoint = new InjectionStartPoint();
		assertEquals(injectionStartPoint.toString().trim(), "one two three");
	}
	
	@Test
	public void shouldInjectDefinedBindingUsingReflection() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		InjectionStartPoint injectionStartPoint = new InjectionStartPoint();
		Class<? extends InjectionStartPoint> clazz = injectionStartPoint.getClass();
		Method[] allMethods = clazz.getDeclaredMethods();
		for (Method method : allMethods) {
			method.invoke(injectionStartPoint);
		}
	}
	
	@Test(expectedExceptions={Exception.class})
	public void shouldFailDuringInjectingBecauseOfMissingBinding() {
		InjectionStartPointThatFails injectionStartPoint = new InjectionStartPointThatFails();
		injectionStartPoint.toStringThatFails();
	}
}
