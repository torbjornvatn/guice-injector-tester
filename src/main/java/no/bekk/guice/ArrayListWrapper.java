package no.bekk.guice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWrapper {
	List<String> list = new ArrayList<String>();
	
	public List<String> fetchList() {
		list.add("one");
		list.add("two");
		list.add("three");
		return list;
	}
	
}
