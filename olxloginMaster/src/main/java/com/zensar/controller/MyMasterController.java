package com.zensar.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entity.Category;
import com.zensar.entity.Status;



@RestController
public class MyMasterController{
	static List<Category> category=new ArrayList<Category>();
	static {
	category.add(new Category(1L,"Furniture"));
	category.add(new Category(2L,"Cars"));
	category.add(new Category(3L,"Mobiles"));
	category.add(new Category(4L,"RealEstate"));
	category.add(new Category(5L,"Sports"));
	}
	
	static List<Status> status=new ArrayList<Status>();
	static {
		status.add(new Status(1L,"open"));
		status.add(new Status(2L,"closed"));
	
	}
	@GetMapping("/advertise/category")
	public List<Category> getAllAdvertisementCategories() {
	return category;
	}

	@GetMapping("/advertise/status")
	public List<Status> getAllAdvertisementStatus(){
	return status;
	}
	
	
}