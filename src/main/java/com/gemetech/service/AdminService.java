package com.gemetech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gemetech.entity.Admin;
import com.gemetech.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository bRepo;

	public void save(Admin b) {
		bRepo.save(b);
	}

	public List<Admin> getAllBook() {
		return bRepo.findAll();
	}

	public Admin getBookById(int id) {
		return bRepo.findById(id).get();
	}

	public void deleteById(int id) {
		bRepo.deleteById(id);
	}
}
