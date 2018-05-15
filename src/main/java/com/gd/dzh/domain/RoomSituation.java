package com.gd.dzh.domain;

public class RoomSituation {
	private int booked;
	private int used;
	private int empty;
	private int disable;
	public int getBooked() {
		return booked;
	}
	public void setBooked(int booked) {
		this.booked = booked;
	}
	public int getUsed() {
		return used;
	}
	public void setUsed(int used) {
		this.used = used;
	}
	public int getEmpty() {
		return empty;
	}
	public void setEmpty(int empty) {
		this.empty = empty;
	}
	public int getDisable() {
		return disable;
	}
	public void setDisable(int disable) {
		this.disable = disable;
	}
	@Override
	public String toString() {
		return "RoomSituation [booked=" + booked + ", used=" + used + ", empty=" + empty + ", disable=" + disable + "]";
	}
	
	
}
