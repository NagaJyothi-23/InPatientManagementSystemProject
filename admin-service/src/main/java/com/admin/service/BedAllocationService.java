package com.admin.service;

import java.util.List;

import com.admin.entity.BedAllocation;




public interface BedAllocationService {

	BedAllocation save(BedAllocation bedAllocation);
	BedAllocation getById(long id);
	List<BedAllocation> getAll();
	void delete(long id);
}
