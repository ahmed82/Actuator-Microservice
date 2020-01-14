package com.atr.rent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atr.rent.model.Vendor;
import com.atr.rent.repository.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService{
	
	
	@Autowired
	VendorRepository vendorRepository;

	@Override
	public Vendor save(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

}
