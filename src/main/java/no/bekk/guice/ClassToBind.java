package no.bekk.guice;

import com.google.inject.Inject;

public class ClassToBind implements BindableClass{
	
	private ArrayListWrapper arrayListWrapper;

	@Inject
	public ClassToBind(ArrayListWrapper arrayListWrapper) {
		this.arrayListWrapper = arrayListWrapper;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		for (String s : this.arrayListWrapper.fetchList()) {
			result.append(s + " ");
		}
		return result.toString();
	}

}
