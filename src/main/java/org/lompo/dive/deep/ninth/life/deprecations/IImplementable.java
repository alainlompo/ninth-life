package org.lompo.dive.deep.ninth.life.deprecations;

import java.util.List;

public interface IImplementable {
	void doSomething();
	
	/**
	 * The method is deprecated since API version 1.5 (only illustrative in this trivial code)
	 * the forRemoval attribute is an intent expression
	 * @deprecated as of API 1.5
	 * @param o
	 */
	@Deprecated(since="1.5", forRemoval=false)
	void doSomething(Object o);
	
	<T> void  doSomething(List<T>...lists);
}
