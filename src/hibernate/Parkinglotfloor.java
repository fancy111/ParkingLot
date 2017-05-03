package hibernate;
// Generated 2017-4-26 14:48:25 by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Parkinglotfloor generated by hbm2java
 */
public class Parkinglotfloor implements java.io.Serializable {

	private ParkinglotfloorId id;
	private Parkinglot parkinglot;
	private Integer parkingLotFloorSizedx;
	private Integer parkingLotFloorSizedy;
	private Integer parkingLotFloorNumber;
	private Set parkingsets = new HashSet(0);

	public Parkinglotfloor() {
	}

	public Parkinglotfloor(ParkinglotfloorId id, Parkinglot parkinglot) {
		this.id = id;
		this.parkinglot = parkinglot;
	}

	public Parkinglotfloor(ParkinglotfloorId id, Parkinglot parkinglot, Integer parkingLotFloorSizedx,
			Integer parkingLotFloorSizedy, Integer parkingLotFloorNumber, Set parkingsets) {
		this.id = id;
		this.parkinglot = parkinglot;
		this.parkingLotFloorSizedx = parkingLotFloorSizedx;
		this.parkingLotFloorSizedy = parkingLotFloorSizedy;
		this.parkingLotFloorNumber = parkingLotFloorNumber;
		this.parkingsets = parkingsets;
	}

	public ParkinglotfloorId getId() {
		return this.id;
	}

	public void setId(ParkinglotfloorId id) {
		this.id = id;
	}

	public Parkinglot getParkinglot() {
		return this.parkinglot;
	}

	public void setParkinglot(Parkinglot parkinglot) {
		this.parkinglot = parkinglot;
	}

	public Integer getParkingLotFloorSizedx() {
		return this.parkingLotFloorSizedx;
	}

	public void setParkingLotFloorSizedx(Integer parkingLotFloorSizedx) {
		this.parkingLotFloorSizedx = parkingLotFloorSizedx;
	}

	public Integer getParkingLotFloorSizedy() {
		return this.parkingLotFloorSizedy;
	}

	public void setParkingLotFloorSizedy(Integer parkingLotFloorSizedy) {
		this.parkingLotFloorSizedy = parkingLotFloorSizedy;
	}

	public Integer getParkingLotFloorNumber() {
		return this.parkingLotFloorNumber;
	}

	public void setParkingLotFloorNumber(Integer parkingLotFloorNumber) {
		this.parkingLotFloorNumber = parkingLotFloorNumber;
	}

	public Set getParkingsets() {
		return this.parkingsets;
	}

	public void setParkingsets(Set parkingsets) {
		this.parkingsets = parkingsets;
	}

}
