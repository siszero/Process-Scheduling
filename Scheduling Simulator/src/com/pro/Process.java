package com.pro;

public class Process {
	public int arrTime;
	public int burTime;
	public int endTime;
	public int ID;	//프로세스 번호
	public int waitTime;
	public int turnTime;
	public int remainTime;
	//public int totalTime;
	//public boolean checked = false; // 실행되었던 프로세스 막을 boolean 변수

	public Process() {}
	public Process(int arrTime, int burTime) {
		this.arrTime=arrTime;
		this.burTime=burTime;
		this.remainTime=burTime;
	}
	public void reduRemainTime() {
		remainTime--; 
	}
	
	public int getRemainTime() {
		return remainTime;
	}
	public void setRemainTime(int remainTime) {
		this.remainTime = remainTime;
	}
	public int getArrTime() {
		return arrTime;
	}
	public void setArrTime(int arrTime) {
		this.arrTime = arrTime;
	}
	public int getBurTime() {
		return burTime;
	}
	public void setBurTime(int burTime) {
		this.burTime = burTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}

	public int getWaitTime() {
		return waitTime;
	}
	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}
	public int getTurnTime() {
		return turnTime;
	}
	public void setTurnTime(int turnTime) {
		this.turnTime = turnTime;
	}
	@Override
	public String toString() {
		return "Process [arrTime=" + arrTime + ", burTime=" + burTime + ", endTime=" + endTime + ", waitTime="
				+ waitTime + ", turnTime=" + turnTime + "]";
	}
	
	
//	public int getTotalTime() {
//		return totalTime;
//	}
//
//	public void setTotalTime(int totalTime) {
//		this.totalTime = totalTime;
//	}
//	
//	public boolean isChecked() {
//		return checked;
//	}
//
//	public void setChecked(boolean checked) {
//		this.checked = checked;
//	}
	
	
}
