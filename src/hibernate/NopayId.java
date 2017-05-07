package hibernate;
// Generated 2017-5-7 13:38:56 by Hibernate Tools 3.5.0.Final

/**
 * NopayId generated by hbm2java
 */
public class NopayId implements java.io.Serializable {

	private String notPayBookid;
	private int notPayUserid;

	public NopayId() {
	}

	public NopayId(String notPayBookid, int notPayUserid) {
		this.notPayBookid = notPayBookid;
		this.notPayUserid = notPayUserid;
	}

	public String getNotPayBookid() {
		return this.notPayBookid;
	}

	public void setNotPayBookid(String notPayBookid) {
		this.notPayBookid = notPayBookid;
	}

	public int getNotPayUserid() {
		return this.notPayUserid;
	}

	public void setNotPayUserid(int notPayUserid) {
		this.notPayUserid = notPayUserid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NopayId))
			return false;
		NopayId castOther = (NopayId) other;

		return ((this.getNotPayBookid() == castOther.getNotPayBookid()) || (this.getNotPayBookid() != null
				&& castOther.getNotPayBookid() != null && this.getNotPayBookid().equals(castOther.getNotPayBookid())))
				&& (this.getNotPayUserid() == castOther.getNotPayUserid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNotPayBookid() == null ? 0 : this.getNotPayBookid().hashCode());
		result = 37 * result + this.getNotPayUserid();
		return result;
	}

}
