package com.patient.billing.serviceImplimentation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patient.billing.entity.PatientBillingEntity;
import com.patient.billing.repository.PatientBillingRepository;
import com.patient.billing.service.PatientBillingService;
@Service
public class PatientBillingServiceImplimentation implements PatientBillingService
{
	@Autowired
    PatientBillingRepository repository;
	@Override
	public void save(PatientBillingEntity patientBillingEntity) {
		
		repository.save(patientBillingEntity);
	}
	@Override
	public List<PatientBillingEntity> getAll() {
		List<PatientBillingEntity> PatientList=repository.findAll();
		return PatientList;
	}
	@Override
	public Optional<PatientBillingEntity> getById(int id) {
		Optional<PatientBillingEntity> entity=repository.findById(id);
		return entity;
	}
	@Override
	public PatientBillingEntity update(int id,String paymentStatus) {
		Optional<PatientBillingEntity> getId=repository.findById(id);
		if(getId.isPresent())
		{
			
			PatientBillingEntity patientBilling=getId.get();
			double totalAmount=patientBilling.getTotalAmount(); //5000

			double paidAmount=patientBilling.getPaidAmount();//1000
			//due ==totalamount-paidAmount
			//balce = due-paymentAmt
			//if balc ===0
			
			//paymentStatus===c;
			//else
			//paritial paid
			
			//
			patientBilling.setPaymentStatus(paymentStatus);
//			double amount=patientId.getPaidAmount();
//			double total=patientId.getTotalAmount();
			
			
			
			return repository.save(patientBilling);
		}
		else {
		return null;
		}
	}
	
//	@Override
//	public PatientBillingEntity update(int id,String paymentStatus, Double paymentAmt) {
//		Optional<PatientBillingEntity> getId=repository.findById(id);
//		if(getId.isPresent())
//		{
//			
//			PatientBillingEntity patientBilling=getId.get();
//			double totalAmount=patientBilling.getTotalAmount(); //5000
//
//			double paidAmount=patientBilling.getPaidAmount();//1000
//			//due ==totalamount-paidAmount
//			//balce = due-paymentAmt
//			//if balc ===0
//			
//			//paymentStatus===c;
//			//else
//			//paritial paid
//			
//			//
//			patientBilling.setPaymentStatus(paymentStatus);
////			double amount=patientId.getPaidAmount();
////			double total=patientId.getTotalAmount();
//			
//			
//			
//			return repository.save(patientBilling);
//		}
//		else {
//		return null;
//		}
//	}
	@Override
	public void delete(int id) {
	  repository.deleteById(id);
		
		
	}
	

}
