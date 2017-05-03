package hibernate;
// Generated 2017-4-26 14:48:25 by Hibernate Tools 3.5.0.Final

/**
 * ParkingsetId generated by hbm2java
 */
public class ParkingsetId implements java.io.Serializable {

	private int parkingSetLotid;
	private int parkingSetFloorid;
	private int parkingSetId;

	public ParkingsetId() {
	}

	public ParkingsetId(int parkingSetLotid, int parkingSetFloorid, int parkingSetId) {
		this.parkingSetLotid = parkingSetLotid;
		this.parkingSetFloorid = parkingSetFloorid;
		this.parkingSetId = parkingSetId;
	}

	public int getParkingSetLotid() {
		return this.parkingSetLotid;
	}

	public void setParkingSetLotid(int parkingSetLotid) {
		this.parkingSetLotid = parkingSetLotid;
	}

	public int getParkingSetFloorid() {
		return this.parkingSetFloorid;
	}

	public void setParkingSetFloorid(int parkingSetFloorid) {
		this.parkingSetFloorid = parkingSetFloorid;
	}

	public int getParkingSetId() {
		return this.parkingSetId;
	}

	public void setParkingSetId(int parkingSetId) {
		this.parkingSetId = parkingSetId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ParkingsetId))
			return false;
		ParkingsetId castOther = (ParkingsetId) other;

		return (this.getParkingSetLotid() == castOther.getParkingSetLotid())
				&& (this.getParkingSetFloorid() == castOther.getParkingSetFloorid())
				&& (this.getParkingSetId() == castOther.getParkingSetId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getParkingSetLotid();
		result = 37 * result + this.getParkingSetFloorid();
		result = 37 * result + this.getParkingSetId();
		return result;
	}

}