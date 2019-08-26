package com.aa.rpt.cas.rtpnr.space;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.annotation.pojo.SpaceRouting;

@SpaceClass
public class SegmentClass implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -462034025799589790L;
	private SegmentClassId segmentClassId;
	private char cabinCode;
	private LocalDateTime lastUpdate;
	private LocalDateTime createDateTime;
	private Integer reservationHolding = 0;
	private Integer unticketed = 0;
	private Integer corporate = 0;
	private Integer largeParty = 0;
	private Integer codeShare = 0;
	private Integer waitList = 0;
	private Integer positiveSpace = 0;
	private Integer oversales = 0;
	private Integer noShow = 0;
	private Integer misconnect = 0;
	private Integer standby = 0;
	private Integer preRemoval = 0;
	private Integer advantageFree = 0;
	private Integer nonrevAPass = 0;
	private Integer nonrevCPass = 0;
	private Integer nonrevD1 = 0;
	private Integer nonrevD1T = 0;
	private Integer nonrevD2 = 0;
	private Integer nonrevD2T = 0;
	private Integer nonrevD2P = 0;
	private Integer nonrevD2PT = 0;
	private Integer nonrevD2R = 0;
	private Integer nonrevD2RT = 0;
	private Integer nonrevD3 = 0;
	private Integer nonrevD3T = 0;
	private Integer nonrevTWR = 0;
	private Integer nonrevTWRT = 0;
	private Integer nonrevMM = 0;
	private Integer nonrevAAC = 0;
	private Integer nonrevAACT = 0;
	
	
	

	/*@Override	
	public boolean equals(Object obj) {
	   if (obj == null) { return false; }
	   if (obj == this) { return true; }
	   if (obj.getClass() != getClass()) {
	     return false;
	   }
	   SegmentClass rhs = (SegmentClass) obj;
	   return new EqualsBuilder()
	                 .appendSuper(super.equals(obj))
	                 .append(segAirline, rhs.segAirline)
	                 .append(segDepartureDate, rhs.segDepartureDate)
	                 .append(segFlightNumber, rhs.segFlightNumber)
	                 .append(segBoard, rhs.segBoard)
	                 .append(segOff, rhs.segOff)
	                 .append(fareClass, rhs.fareClass)
	                 .isEquals();
	  }

	@Override
	public Integer hashCode() {
	     // you pick a hard-coded, randomly chosen, non-zero, odd number
	     // ideally different for each class
	     return new HashCodeBuilder(17, 39)
	    		 .append(segAirline)
                 .append(segDepartureDate)
                 .append(segFlightNumber)
                 .append(segBoard)
                 .append(segOff)
                 .append(fareClass)
                 .toHashCode();
	   }*/
	@SpaceId
	@SpaceRouting
	public SegmentClassId getSegmentClassId() {
		return segmentClassId;
	}




	public void setSegmentClassId(SegmentClassId segmentClassId) {
		this.segmentClassId = segmentClassId;
	}




	public char getCabinCode() {
		return cabinCode;
	}




	public void setCabinCode(char cabinCode) {
		this.cabinCode = cabinCode;
	}




	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}




	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}




	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}




	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}




	public Integer getReservationHolding() {
		return reservationHolding;
	}




	public void setReservationHolding(Integer reservationHolding) {
		this.reservationHolding = reservationHolding;
	}




	public Integer getUnticketed() {
		return unticketed;
	}




	public void setUnticketed(Integer unticketed) {
		this.unticketed = unticketed;
	}




	public Integer getCorporate() {
		return corporate;
	}




	public void setCorporate(Integer corporate) {
		this.corporate = corporate;
	}




	public Integer getLargeParty() {
		return largeParty;
	}




	public void setLargeParty(Integer largeParty) {
		this.largeParty = largeParty;
	}




	public Integer getCodeShare() {
		return codeShare;
	}




	public void setCodeShare(Integer codeShare) {
		this.codeShare = codeShare;
	}




	public Integer getWaitList() {
		return waitList;
	}




	public void setWaitList(Integer waitList) {
		this.waitList = waitList;
	}




	public Integer getPositiveSpace() {
		return positiveSpace;
	}




	public void setPositiveSpace(Integer positiveSpace) {
		this.positiveSpace = positiveSpace;
	}




	public Integer getOversales() {
		return oversales;
	}




	public void setOversales(Integer oversales) {
		this.oversales = oversales;
	}




	public Integer getNoShow() {
		return noShow;
	}




	public void setNoShow(Integer noShow) {
		this.noShow = noShow;
	}




	public Integer getMisconnect() {
		return misconnect;
	}




	public void setMisconnect(Integer misconnect) {
		this.misconnect = misconnect;
	}




	public Integer getStandby() {
		return standby;
	}




	public void setStandby(Integer standby) {
		this.standby = standby;
	}




	public Integer getPreRemoval() {
		return preRemoval;
	}




	public void setPreRemoval(Integer preRemoval) {
		this.preRemoval = preRemoval;
	}




	public Integer getAdvantageFree() {
		return advantageFree;
	}




	public void setAdvantageFree(Integer advantageFree) {
		this.advantageFree = advantageFree;
	}




	public Integer getNonrevAPass() {
		return nonrevAPass;
	}




	public void setNonrevAPass(Integer nonrevAPass) {
		this.nonrevAPass = nonrevAPass;
	}




	public Integer getNonrevCPass() {
		return nonrevCPass;
	}




	public void setNonrevCPass(Integer nonrevCPass) {
		this.nonrevCPass = nonrevCPass;
	}




	public Integer getNonrevD1() {
		return nonrevD1;
	}




	public void setNonrevD1(Integer nonrevD1) {
		this.nonrevD1 = nonrevD1;
	}




	public Integer getNonrevD1T() {
		return nonrevD1T;
	}




	public void setNonrevD1T(Integer nonrevD1T) {
		this.nonrevD1T = nonrevD1T;
	}




	public Integer getNonrevD2() {
		return nonrevD2;
	}




	public void setNonrevD2(Integer nonrevD2) {
		this.nonrevD2 = nonrevD2;
	}




	public Integer getNonrevD2T() {
		return nonrevD2T;
	}




	public void setNonrevD2T(Integer nonrevD2T) {
		this.nonrevD2T = nonrevD2T;
	}




	public Integer getNonrevD2P() {
		return nonrevD2P;
	}




	public void setNonrevD2P(Integer nonrevD2P) {
		this.nonrevD2P = nonrevD2P;
	}




	public Integer getNonrevD2PT() {
		return nonrevD2PT;
	}




	public void setNonrevD2PT(Integer nonrevD2PT) {
		this.nonrevD2PT = nonrevD2PT;
	}




	public Integer getNonrevD2R() {
		return nonrevD2R;
	}




	public void setNonrevD2R(Integer nonrevD2R) {
		this.nonrevD2R = nonrevD2R;
	}




	public Integer getNonrevD2RT() {
		return nonrevD2RT;
	}




	public void setNonrevD2RT(Integer nonrevD2RT) {
		this.nonrevD2RT = nonrevD2RT;
	}




	public Integer getNonrevD3() {
		return nonrevD3;
	}




	public void setNonrevD3(Integer nonrevD3) {
		this.nonrevD3 = nonrevD3;
	}




	public Integer getNonrevD3T() {
		return nonrevD3T;
	}




	public void setNonrevD3T(Integer nonrevD3T) {
		this.nonrevD3T = nonrevD3T;
	}




	public Integer getNonrevTWR() {
		return nonrevTWR;
	}




	public void setNonrevTWR(Integer nonrevTWR) {
		this.nonrevTWR = nonrevTWR;
	}




	public Integer getNonrevTWRT() {
		return nonrevTWRT;
	}




	public void setNonrevTWRT(Integer nonrevTWRT) {
		this.nonrevTWRT = nonrevTWRT;
	}




	public Integer getNonrevMM() {
		return nonrevMM;
	}




	public void setNonrevMM(Integer nonrevMM) {
		this.nonrevMM = nonrevMM;
	}




	public Integer getNonrevAAC() {
		return nonrevAAC;
	}




	public void setNonrevAAC(Integer nonrevAAC) {
		this.nonrevAAC = nonrevAAC;
	}




	public Integer getNonrevAACT() {
		return nonrevAACT;
	}




	public void setNonrevAACT(Integer nonrevAACT) {
		this.nonrevAACT = nonrevAACT;
	}
	
	public String getSegAirline() {
		return segmentClassId.getSegAirline();
	}
	public LocalDate getSegDepartureDate() {
		return segmentClassId.getSegDepartureDate();
	}
	public Integer getSegFlightNumber() {
		return segmentClassId.getSegFlightNumber();
	}
	public String getSegBoard() {
		return segmentClassId.getSegBoard();
	}
	public String getSegOff() {
		return segmentClassId.getSegOff();
	}
	public Character getSegFareClass() {
		return segmentClassId.getSegFareClass();
	}
	



	@Override
	public String toString() {
		return "SegmentClass [segmentClassId=" + segmentClassId + ", cabinCode=" + cabinCode + ", lastUpdate="
				+ lastUpdate + ", createDateTime=" + createDateTime + ", reservationHolding=" + reservationHolding
				+ ", unticketed=" + unticketed + ", corporate=" + corporate + ", largeParty=" + largeParty
				+ ", codeShare=" + codeShare + ", waitList=" + waitList + ", positiveSpace=" + positiveSpace
				+ ", oversales=" + oversales + ", noShow=" + noShow + ", misconnect=" + misconnect + ", standby="
				+ standby + ", preRemoval=" + preRemoval + ", advantageFree=" + advantageFree + ", nonrevAPass="
				+ nonrevAPass + ", nonrevCPass=" + nonrevCPass + ", nonrevD1=" + nonrevD1 + ", nonrevD1T=" + nonrevD1T
				+ ", nonrevD2=" + nonrevD2 + ", nonrevD2T=" + nonrevD2T + ", nonrevD2P=" + nonrevD2P + ", nonrevD2PT="
				+ nonrevD2PT + ", nonrevD2R=" + nonrevD2R + ", nonrevD2RT=" + nonrevD2RT + ", nonrevD3=" + nonrevD3
				+ ", nonrevD3T=" + nonrevD3T + ", nonrevTWR=" + nonrevTWR + ", nonrevTWRT=" + nonrevTWRT + ", nonrevMM="
				+ nonrevMM + ", nonrevAAC=" + nonrevAAC + ", nonrevAACT=" + nonrevAACT + "]";
	}
	
	
	
}
