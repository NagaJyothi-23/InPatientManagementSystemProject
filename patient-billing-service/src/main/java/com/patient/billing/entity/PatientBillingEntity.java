package com.patient.billing.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="patient_billing")
public class PatientBillingEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bill_id")
	private int billId;
	
	@Column(name="bill_date")
	private Date billingDate;
	@Column(name="bed_allocation_id")
	private int bedAllocationId;
	@Column(name="patient_id")
	private int patientId;
	@Column(name="roomtype_id")
	private int roomtypeId;
	@Column(name="paid_amount")
	private double paidAmount;
	@Column(name="discount")
	private double discount;
	@Column(name="total_amount")
	private double totalAmount;
	@Column(name="payment_status")
	private String paymentStatus;
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public Date getBillingDate() {
		return billingDate;
	}
	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}
	public int getBedAllocationId() {
		return bedAllocationId;
	}
	public void setBedAllocationId(int bedAllocationId) {
		this.bedAllocationId = bedAllocationId;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getRoomtypeId() {
		return roomtypeId;
	}
	public void setRoomtypeId(int roomtypeId) {
		this.roomtypeId = roomtypeId;
	}
	public double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public PatientBillingEntity(int billId, Date billingDate, int bedAllocationId, int patientId, int roomtypeId,
			double paidAmount, double discount, double totalAmount, String paymentStatus) {
		super();
		this.billId = billId;
		this.billingDate = billingDate;
		this.bedAllocationId = bedAllocationId;
		this.patientId = patientId;
		this.roomtypeId = roomtypeId;
		this.paidAmount = paidAmount;
		this.discount = discount;
		this.totalAmount = totalAmount;
		this.paymentStatus = paymentStatus;
	}
	public PatientBillingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
