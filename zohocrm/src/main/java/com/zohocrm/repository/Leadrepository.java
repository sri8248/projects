package com.zohocrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entity.Lead;

public interface Leadrepository extends JpaRepository<Lead, Long> {

}
