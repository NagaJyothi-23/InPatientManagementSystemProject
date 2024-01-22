package com.admin.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.entity.RoomType;
import com.admin.repository.RoomTypeRepository;
import com.admin.service.RoomTypeService;
@Service
public class RoomTypeServiceImplementation implements RoomTypeService{
	@Autowired
	RoomTypeRepository roomTypeRepository;

	@Override
	public void save(RoomType roomType) {
		roomTypeRepository.save(roomType);
	}

	@Override
	public List<RoomType> getAll() {
		List<RoomType> roomlist = roomTypeRepository.findAll();
		return roomlist;
		
	}

	@Override
	public Optional<RoomType> getById(long id) {
		Optional<RoomType> roomtypebyid= roomTypeRepository.findById(id);
		return roomtypebyid;
			
	}

	@Override
	public RoomType update(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		roomTypeRepository.deleteById(id);
		
	}

	
	

}
