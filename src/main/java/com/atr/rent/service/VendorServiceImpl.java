package com.atr.rent.service;

import java.util.Optional;

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
	
	public Vendor fetchVendorByid(int id){
		
		Optional<Vendor> vendor = vendorRepository.findById(id);
		if (vendor.isPresent()){
			return vendor.get();
		}
		return null;
	}

}
