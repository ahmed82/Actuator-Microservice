package com.atr.rent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atr.rent.model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor,Integer>{
	
	/*It was used when extends Repository<Vendor,Integer>*/
	//Vendor save(Vendor vendor);

}
