package com.gemetech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gemetech.entity.AdminList;

@Repository
public interface AdminListRepository extends JpaRepository<AdminList,Integer>{

}
