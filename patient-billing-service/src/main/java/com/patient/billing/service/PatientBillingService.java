package com.patient.billing.service;

import java.util.List;
import java.util.Optional;

import com.patient.billing.entity.PatientBillingEntity;

public interface PatientBillingService {
	void save(PatientBillingEntity patientBillingEntity);
	List<PatientBillingEntity> getAll();
	Optional<PatientBillingEntity> getById(int id);
	PatientBillingEntity update(int id,String paymentStatus);
	void delete(int id);

}
