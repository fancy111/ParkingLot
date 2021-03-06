package hibernate;
// Generated 2017-5-7 13:38:56 by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Cashier generated by hbm2java
 */
public class Cashier implements java.io.Serializable {

	private int cashierId;
	private Worker worker;
	private Set outlays = new HashSet(0);

	public Cashier() {
	}

	public Cashier(Worker worker) {
		this.worker = worker;
	}

	public Cashier(Worker worker, Set outlays) {
		this.worker = worker;
		this.outlays = outlays;
	}

	public int getCashierId() {
		return this.cashierId;
	}

	public void setCashierId(int cashierId) {
		this.cashierId = cashierId;
	}

	public Worker getWorker() {
		return this.worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public Set getOutlays() {
		return this.outlays;
	}

	public void setOutlays(Set outlays) {
		this.outlays = outlays;
	}

}
