package com.atr.rent.repository;

import org.springframework.data.repository.Repository;

import com.atr.rent.model.Vendor;

public interface VendorRepository extends Repository<Vendor,Integer>{
	
	Vendor save(Vendor vendor);

}
