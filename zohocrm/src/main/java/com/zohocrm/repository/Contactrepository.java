package com.zohocrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entity.Contacts;

public interface Contactrepository extends JpaRepository<Contacts, Long> {

}
