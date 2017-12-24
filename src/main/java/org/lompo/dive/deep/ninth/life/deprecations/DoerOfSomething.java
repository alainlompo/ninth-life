package org.lompo.dive.deep.ninth.life.deprecations;

import java.util.List;

public class DoerOfSomething implements IImplementable {
	public void doSomething() {
	}
	
	public void doSomething(Object o) {
	}
	
	@Override
	public <T> void doSomething(List<T>...lists) {
	}
	
}
