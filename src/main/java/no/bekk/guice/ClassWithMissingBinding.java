package no.bekk.guice;

import java.util.List;

import com.google.inject.Inject;

public class ClassWithMissingBinding implements BindableClass{
	
	private List<String> list;

	@Inject
	public ClassWithMissingBinding(List<String> list) {
		this.list = list;
	}
	
	public String toString() {
		list.add("one");
		list.add("two");
		StringBuffer result = new StringBuffer();
		for (String s : list) {
			result.append(s + " ");
		}
		return result.toString();
	}

}
