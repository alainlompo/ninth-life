package org.lompo.dive.deep.ninth.life.mpc;

public class PolarPlanCoordinates {
	private double r;
	private double theta;
	
	public PolarPlanCoordinates(double r, double theta) {
		super();
		this.r = r;
		this.theta = theta;
	}
	
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getTheta() {
		return theta;
	}
	public void setTheta(double theta) {
		this.theta = theta;
	}
	
	public String toString() {
		return "(r=" + r + ", theta=" + theta + ")";
	}
}
