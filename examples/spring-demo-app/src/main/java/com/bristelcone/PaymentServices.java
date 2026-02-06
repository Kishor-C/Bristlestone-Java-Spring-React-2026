package com.bristelcone;

import java.util.List;
import java.util.Set;

public class PaymentServices {
	private List<String> names;
	
	private Set<String> platforms;

	public void initializer() {
		System.out.println("initializer() method");
	}
	
	public void cleanUp() {
		System.out.println("cleanUp() method");
	}
	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Set<String> getPlatforms() {
		return platforms;
	}

	public void setPlatforms(Set<String> platforms) {
		this.platforms = platforms;
	}

}
