package org.lompo.dive.deep.ninth.life.mpc;

/**
 * milling project coin, code snippets and notes wrapper
 * @author LOMPO
 *
 */
public class MpcDemoAndNotes {
	public void changesInNumbers() {
		Integer hugeNumber = 987_654_321; // Since java se 7
		Integer other_HugeNumber = 123_456_789; 
		Integer _tada = 10;
	
		// The following line does not compile
		// In java 8 it compiled and yielded a warning
		// But in java 9 its a compile time error with the following message
		//  error: as of release 9, '_' is a keyword, and may not be used as an identifier
		// Integer _ = 15;
		
		// Of course the following works
		Integer __ = 45;
	}
	
	public static void main(String[] args) {
		CartesianPlanCoordinates coordinates = new CartesianPlanCoordinates(12.5, 8.34);
		Polarisable polarService = new Polarisable() {
		};
		
		
		PolarPlanCoordinates polarCoords = polarService.toPolarCoordinates(coordinates);
		System.out.println(coordinates + " expressed as polar coordinates is " + polarCoords);
	}

}
