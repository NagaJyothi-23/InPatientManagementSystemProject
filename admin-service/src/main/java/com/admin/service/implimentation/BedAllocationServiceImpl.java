package com.admin.service.implimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.entity.BedAllocation;
import com.admin.repository.BedAllocationRepository;
import com.admin.service.BedAllocationService;

@Service
public class BedAllocationServiceImpl implements BedAllocationService{

	@Autowired
	BedAllocationRepository bedAllocationRepository; 
	@Override
	public BedAllocation save(BedAllocation bedAllocation) {
		// TODO Auto-generated method stub
		return bedAllocationRepository.save( bedAllocation);
	}

	@Override
	public BedAllocation getById(long id) {
		// TODO Auto-generated method stub
		return bedAllocationRepository.getReferenceById(id);
	}

	@Override
	public List<BedAllocation> getAll() {
		// TODO Auto-generated method stub
		return bedAllocationRepository.findAll();
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		bedAllocationRepository.deleteById(id);
		
	}

}
