package com.gemetech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gemetech.entity.AdminList;
import com.gemetech.repository.AdminListRepository;

@Service
public class AdminListService {
	
	@Autowired
	private AdminListRepository mybook;
	
	public void saveMyBooks(AdminList book) {
		mybook.save(book);
	}
	
	public List<AdminList> getAllMyBooks(){
		return mybook.findAll();
	}
	
	public void deleteById(int id) {
		mybook.deleteById(id);
	}
}
