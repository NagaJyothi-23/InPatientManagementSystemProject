package com.patient.billing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.billing.entity.PatientBillingEntity;

public interface PatientBillingRepository extends JpaRepository<PatientBillingEntity, Integer>
{
	

}
