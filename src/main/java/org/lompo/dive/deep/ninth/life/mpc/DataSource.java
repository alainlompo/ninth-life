package org.lompo.dive.deep.ninth.life.mpc;

import java.util.List;

public abstract class DataSource implements AutoCloseable {
	public abstract List<Object> getTables();
}
