package com.atr.rent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atr.rent.model.Vendor;
import com.atr.rent.service.VendorService;

@RestController
public class MainController {
	
	@Autowired
	VendorService vendorService;
	
	@RequestMapping(value = "/hello", method=RequestMethod.GET)
	public String greeting(){
		
		return "Hello Micro-Services";
	}
	
	
	@RequestMapping(value = "/hello", method=RequestMethod.POST)
	public String greeting2(){
		
		return "Hello Micro-Services POST";
	}
	
	@RequestMapping(value = "/vendor", method=RequestMethod.POST)
	public Vendor save(@RequestBody Vendor vendor){
		return vendorService.save(vendor);
	}

}
