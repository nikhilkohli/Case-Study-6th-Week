package com.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobile")
public class Mobile {
	
	@Id
	@Column(name = "mid", length = 10)
	private int mobileId;
	@Column(name = "mname", length = 10)
	private String mobileName;
	@Column(name = "mtype", length = 10)
	private String mobileTYPE;
	@Column(name = "mprice", length = 10)
	private int mobilePrice;
	@Column(name = "mwarrenty", length = 10)
	private int mobileWarenty;
	@Column(name = "menumber", length = 10)
	private int mobileIMEINumber;
	
	public Mobile() {
		
		// TODO Auto-generated constructor stub
	}

	public Mobile(int mobileId, String mobileName, String mobileTYPE, int mobilePrice, int mobileWarenty,
			int mobileIMEINumber) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileTYPE = mobileTYPE;
		this.mobilePrice = mobilePrice;
		this.mobileWarenty = mobileWarenty;
		this.mobileIMEINumber = mobileIMEINumber;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getMobileTYPE() {
		return mobileTYPE;
	}

	public void setMobileTYPE(String mobileTYPE) {
		this.mobileTYPE = mobileTYPE;
	}

	public int getMobilePrice() {
		return mobilePrice;
	}

	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}

	public int getMobileWarenty() {
		return mobileWarenty;
	}

	public void setMobileWarenty(int mobileWarenty) {
		this.mobileWarenty = mobileWarenty;
	}

	public int getMobileIMEINumber() {
		return mobileIMEINumber;
	}

	public void setMobileIMEINumber(int mobileIMEINumber) {
		this.mobileIMEINumber = mobileIMEINumber;
	}

	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobileTYPE=" + mobileTYPE
				+ ", mobilePrice=" + mobilePrice + ", mobileWarenty=" + mobileWarenty + ", mobileIMEINumber="
				+ mobileIMEINumber + "]";
	}
	
	
	
	

}
