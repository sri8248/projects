package com.zohocrm.service;


import java.util.List;

import com.zohocrm.entity.Lead;

public interface Leadservice {
public void saveonelead(Lead lead);

public Lead getoneid(long id);

public void deleteoneLead(long id);

public List<Lead> getalldata();

public void deletebyid(Long id);
}
