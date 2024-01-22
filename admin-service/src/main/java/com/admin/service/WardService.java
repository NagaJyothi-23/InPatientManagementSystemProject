package com.admin.service;

import java.util.List;

import com.admin.entity.Ward;

public interface WardService {
	void save(Ward ward);

	Ward get(Long id);

	void delete(long id);

	List<Ward> getAll();

}
