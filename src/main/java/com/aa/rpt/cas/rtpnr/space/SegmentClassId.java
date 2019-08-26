package com.aa.rpt.cas.rtpnr.space;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class SegmentClassId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6304602270837914797L;
	private String segAirline;
	private LocalDate segDepartureDate;
	private Integer segFlightNumber;
	private String segBoard;
	private String segOff;
	private Character segFareClass;
	
	public String getSegAirline() {
		return segAirline;
	}
	public void setSegAirline(String segAirline) {
		this.segAirline = segAirline;
	}
	public LocalDate getSegDepartureDate() {
		return segDepartureDate;
	}
	public void setSegDepartureDate(LocalDate segDepartureDate) {
		this.segDepartureDate = segDepartureDate;
	}
	public Integer getSegFlightNumber() {
		return segFlightNumber;
	}
	public void setSegFlightNumber(Integer segFlightNumber) {
		this.segFlightNumber = segFlightNumber;
	}
	public String getSegBoard() {
		return segBoard;
	}
	public void setSegBoard(String segBoard) {
		this.segBoard = segBoard;
	}
	public String getSegOff() {
		return segOff;
	}
	public void setSegOff(String segOff) {
		this.segOff = segOff;
	}
	public Character getSegFareClass() {
		return segFareClass;
	}
	public void setSegFareClass(Character segFareClass) {
		this.segFareClass = segFareClass;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		SegmentClassId that = (SegmentClassId) o;
		return Objects.equals(segAirline, that.segAirline) && 
				Objects.equals(segDepartureDate, that.segDepartureDate)
				&& Objects.equals(segFlightNumber, that.segFlightNumber) 
				&& Objects.equals(segBoard, that.segBoard)
				&& Objects.equals(segOff, that.segOff)
				&& Objects.equals(segFareClass, that.segFareClass)
				;
	}

	@Override
	public  int hashCode() {

		return Objects.hash(segAirline, segDepartureDate, segFlightNumber, segBoard, segOff, segFareClass);
	}
	
	@Override
	public String toString() {
		return "SegmentClassId [segAirline=" + segAirline + ", segDepartureDate=" + segDepartureDate
				+ ", segFlightNumber=" + segFlightNumber + ", segBoard=" + segBoard + ", segOff=" + segOff
				+ ", segFareClass=" + segFareClass + "]";
	}
	
	
	
}
