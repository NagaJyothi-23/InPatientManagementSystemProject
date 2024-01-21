package com.patient.billing.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patient.billing.entity.PatientBillingEntity;
import com.patient.billing.service.PatientBillingService;

@RestController
public class PatientBillingController 
{
	
   @Autowired
   private PatientBillingService service;
   
   @PostMapping(path="/save")
   public ResponseEntity<PatientBillingEntity>save(@RequestBody PatientBillingEntity entity)
   {
	   service.save(entity);
	   return new ResponseEntity<PatientBillingEntity>(entity,HttpStatus.OK) ;
   }
   @GetMapping(path="/getAll")
   public ResponseEntity<List<PatientBillingEntity>> getAll()
   {
	   List<PatientBillingEntity> list=service.getAll();
	   return new ResponseEntity<List<PatientBillingEntity>>(list,HttpStatus.OK) ;
   }
   @GetMapping(path="fetch/{id}")
   public ResponseEntity<PatientBillingEntity> getById(@PathVariable Integer id)
   {
	   Optional<PatientBillingEntity> patient=service.getById(id);
	   return new ResponseEntity<PatientBillingEntity>(patient.get(),HttpStatus.OK) ;
   }
   
   @DeleteMapping(path="delete/{id}")
   public ResponseEntity<PatientBillingEntity> deleteId(@PathVariable Integer id)
   {
	   service.delete(id);
	   return new ResponseEntity<PatientBillingEntity>(HttpStatus.OK) ;
   }
   
   
//   @PutMapping(path="update/{id}/paymentStatus")
//   public ResponseEntity<PatientBillingEntity> update(@PathVariable(value="id") @RequestParam (value="paymentStatus"))
//   {
//	   service.update(id,paymentStatus );
//	   return new ResponseEntity<PatientBillingEntity>(HttpStatus.OK) ;
//   }
   
   
   @PutMapping("update/{id}/payment")
   public ResponseEntity<PatientBillingEntity> update(
           @PathVariable int id,
           @RequestParam String paymentStatus) {

	   PatientBillingEntity updatedEntity = service.update(id, paymentStatus);

       if (updatedEntity != null) {
           return new ResponseEntity<>(updatedEntity, HttpStatus.OK);
       } else {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
   
   }
   
}
