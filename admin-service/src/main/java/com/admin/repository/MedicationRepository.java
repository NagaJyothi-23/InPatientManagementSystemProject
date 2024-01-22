package com.admin.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.entity.Medication;



@Repository
public interface MedicationRepository extends JpaRepository<Medication,Long>{
    
}
