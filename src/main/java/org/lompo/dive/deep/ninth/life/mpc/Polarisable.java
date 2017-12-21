package org.lompo.dive.deep.ninth.life.mpc;

public interface Polarisable {
	
	/**
	 * Illustrating the use of private methods in default method
	 * default methods are present since java 8
	 * @param coordinates
	 * @return
	 */
	default PolarPlanCoordinates toPolarCoordinates(CartesianPlanCoordinates coordinates) {
		return new PolarPlanCoordinates(
				computeRadius(coordinates),
				computeAngle(coordinates)
				);
	}
	
	/**
	 * Private method in interfaces since Java 9
	 * Allows for example to refactor common code from default method into private method for reusability
	 * @param coordinates
	 * @return
	 */
	private double computeRadius(CartesianPlanCoordinates coordinates) {
		// Just for demo purpose we do not care of boundary conditions
		// x = rcos(theta)
		// => r = x/cos(theta)
		return coordinates.getX() / Math.cos(computeAngle(coordinates));
	}
	
	private double computeAngle(CartesianPlanCoordinates coordinates) {
		// Just for demo purpose we do not care of the boundary conditions
		// x = rcos(theta)
		// y = rsin(theta)
		// => theta = arctan(y/x);
		return Math.atan(coordinates.getY() / coordinates.getX());
	}
}
