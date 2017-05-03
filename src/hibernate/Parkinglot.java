package hibernate;
// Generated 2017-4-26 14:48:25 by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Parkinglot generated by hbm2java
 */
public class Parkinglot implements java.io.Serializable {

	private Integer parkingLotId;
	private String parkingLotName;
	private String parkingLotLocation;
	private Exit exit;
	private Set outlays = new HashSet(0);
	private Set bookforms = new HashSet(0);
	private Set parkinglotfloors = new HashSet(0);
	private Set rentforms = new HashSet(0);
	private Strategy strategy;

	public Parkinglot() {
	}

	public Parkinglot(String parkingLotName, String parkingLotLocation, Exit exit, Set outlays, Set bookforms,
			Set parkinglotfloors, Set rentforms, Strategy strategy) {
		this.parkingLotName = parkingLotName;
		this.parkingLotLocation = parkingLotLocation;
		this.exit = exit;
		this.outlays = outlays;
		this.bookforms = bookforms;
		this.parkinglotfloors = parkinglotfloors;
		this.rentforms = rentforms;
		this.strategy = strategy;
	}

	public Integer getParkingLotId() {
		return this.parkingLotId;
	}

	public void setParkingLotId(Integer parkingLotId) {
		this.parkingLotId = parkingLotId;
	}

	public String getParkingLotName() {
		return this.parkingLotName;
	}

	public void setParkingLotName(String parkingLotName) {
		this.parkingLotName = parkingLotName;
	}

	public String getParkingLotLocation() {
		return this.parkingLotLocation;
	}

	public void setParkingLotLocation(String parkingLotLocation) {
		this.parkingLotLocation = parkingLotLocation;
	}

	public Exit getExit() {
		return this.exit;
	}

	public void setExit(Exit exit) {
		this.exit = exit;
	}

	public Set getOutlays() {
		return this.outlays;
	}

	public void setOutlays(Set outlays) {
		this.outlays = outlays;
	}

	public Set getBookforms() {
		return this.bookforms;
	}

	public void setBookforms(Set bookforms) {
		this.bookforms = bookforms;
	}

	public Set getParkinglotfloors() {
		return this.parkinglotfloors;
	}

	public void setParkinglotfloors(Set parkinglotfloors) {
		this.parkinglotfloors = parkinglotfloors;
	}

	public Set getRentforms() {
		return this.rentforms;
	}

	public void setRentforms(Set rentforms) {
		this.rentforms = rentforms;
	}

	public Strategy getStrategy() {
		return this.strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}
