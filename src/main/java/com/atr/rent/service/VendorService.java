package com.atr.rent.service;

import com.atr.rent.model.Vendor;

public interface VendorService {
	
	Vendor save(Vendor vendor);

	Vendor fetchVendorByid(int id);

}
