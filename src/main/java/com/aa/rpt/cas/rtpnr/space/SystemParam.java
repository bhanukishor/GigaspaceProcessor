package com.aa.rpt.cas.rtpnr.space;

import java.io.Serializable;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

@SpaceClass
public class SystemParam implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private String parmId;
	private String parmName;
	private String parmValue;
	private Character parmTypeInd;
	private Character parmValueInd;
	private String parmDesc;
	private String moduleName;
	private String typicalValue;
	private String longDesc;
	private Character defaultValueInd;
	private String parmMinValue;
	private String parmMaxValue;
	
	
	
	@SpaceId(autoGenerate = true)	
	public String getParmId() {
		return parmId;
	}
	public void setParmId(String parmId) {
		this.parmId = parmId;
	}
	public String getParmName() {
		return parmName;
	}
	public void setParmName(String parmName) {
		this.parmName = parmName;
	}
	public String getParmValue() {
		return parmValue;
	}
	public void setParmValue(String parmValue) {
		this.parmValue = parmValue;
	}
	public Character getParmTypeInd() {
		return parmTypeInd;
	}
	public void setParmTypeInd(Character parmTypeInd) {
		this.parmTypeInd = parmTypeInd;
	}
	public Character getParmValueInd() {
		return parmValueInd;
	}
	public void setParmValueInd(Character parmValueInd) {
		this.parmValueInd = parmValueInd;
	}
	public String getParmDesc() {
		return parmDesc;
	}
	public void setParmDesc(String parmDesc) {
		this.parmDesc = parmDesc;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getTypicalValue() {
		return typicalValue;
	}
	public void setTypicalValue(String typicalValue) {
		this.typicalValue = typicalValue;
	}
	public String getLongDesc() {
		return longDesc;
	}
	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}
	public Character getDefaultValueInd() {
		return defaultValueInd;
	}
	public void setDefaultValueInd(Character defaultValueInd) {
		this.defaultValueInd = defaultValueInd;
	}
	public String getParmMinValue() {
		return parmMinValue;
	}
	public void setParmMinValue(String parmMinValue) {
		this.parmMinValue = parmMinValue;
	}
	public String getParmMaxValue() {
		return parmMaxValue;
	}
	public void setParmMaxValue(String parmMaxValue) {
		this.parmMaxValue = parmMaxValue;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SystemParam [parmId=");
		builder.append(parmId);
		builder.append(", parmName=");
		builder.append(parmName);
		builder.append(", parmValue=");
		builder.append(parmValue);
		builder.append(", parmTypeInd=");
		builder.append(parmTypeInd);
		builder.append(", parmValueInd=");
		builder.append(parmValueInd);
		builder.append(", parmDesc=");
		builder.append(parmDesc);
		builder.append(", moduleName=");
		builder.append(moduleName);
		builder.append(", typicalValue=");
		builder.append(typicalValue);
		builder.append(", longDesc=");
		builder.append(longDesc);
		builder.append(", defaultValueInd=");
		builder.append(defaultValueInd);
		builder.append(", parmMinValue=");
		builder.append(parmMinValue);
		builder.append(", parmMaxValue=");
		builder.append(parmMaxValue);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	

}
