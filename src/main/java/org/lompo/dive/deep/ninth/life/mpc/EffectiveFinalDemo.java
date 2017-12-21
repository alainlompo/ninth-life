package org.lompo.dive.deep.ninth.life.mpc;

public class EffectiveFinalDemo {
	
	public void doConnect(Connection connection) throws Exception {
		DataSource dataSource = connection.getDataSource();
		
		// before java 9: this try statement should look like try (DataSource dataSource) ...
		try (dataSource) {
			// Since java 9
			// No modifications is applied to dataSource in our try-with-resource block
			// it is therefore effectively final
			int tablesCount = dataSource.getTables().size();
		}
	}

}
