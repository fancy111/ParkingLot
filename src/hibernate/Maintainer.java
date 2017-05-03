package hibernate;
// Generated 2017-4-26 14:48:25 by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Maintainer generated by hbm2java
 */
public class Maintainer implements java.io.Serializable {

	private int maintainerId;
	private Worker worker;
	private Set devices = new HashSet(0);

	public Maintainer() {
	}

	public Maintainer(Worker worker) {
		this.worker = worker;
	}

	public Maintainer(Worker worker, Set devices) {
		this.worker = worker;
		this.devices = devices;
	}

	public int getMaintainerId() {
		return this.maintainerId;
	}

	public void setMaintainerId(int maintainerId) {
		this.maintainerId = maintainerId;
	}

	public Worker getWorker() {
		return this.worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public Set getDevices() {
		return this.devices;
	}

	public void setDevices(Set devices) {
		this.devices = devices;
	}

}