package com.admin.service;

import java.util.List;
import java.util.Optional;

import com.admin.entity.RoomType;

public interface RoomTypeService {
	public void save(RoomType roomType);

	List<RoomType> getAll();

	Optional<RoomType> getById(long id);

	RoomType update(long id);

	public void delete(long id);
}
