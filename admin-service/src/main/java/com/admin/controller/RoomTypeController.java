package com.admin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.entity.RoomType;
import com.admin.repository.RoomTypeRepository;
import com.admin.service.RoomTypeService;

@RestController
@RequestMapping("/room")
public class RoomTypeController {
	

	@Autowired
	RoomTypeService roomTypeService;
	@Autowired
	RoomTypeRepository roomTypeRepository;
	@PostMapping(path = "/save")
	public ResponseEntity<RoomType> insert(@RequestBody RoomType roomType){
		roomTypeService.save(roomType);
		ResponseEntity<RoomType> entity=new ResponseEntity<>(roomType,HttpStatus.CREATED);
		System.out.println("inserted");
		return entity;
	}
	@GetMapping(path ="/getAll")
	public ResponseEntity<List<RoomType>> getAll(){
		List<RoomType> list=roomTypeService.getAll();
		return new ResponseEntity<List<RoomType>>(list,HttpStatus.OK);
	}
	@GetMapping(path = "/getbyid")
	public ResponseEntity<RoomType> getById(@PathVariable Integer id){
		Optional<RoomType> roombyid = roomTypeService.getById(id);
		return new ResponseEntity<RoomType>(roombyid.get(),HttpStatus.OK);	
	}
	@DeleteMapping(path = "/delete")
	public ResponseEntity<RoomType> delete(@PathVariable Long id){
		roomTypeService.delete(id);
		return new ResponseEntity<RoomType>(HttpStatus.OK);
		
	}
	
}
