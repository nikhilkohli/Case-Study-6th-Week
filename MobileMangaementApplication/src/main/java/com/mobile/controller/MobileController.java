package com.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;


@RestController
@RequestMapping("/mobile")                                      //http://localhost:1234/mobile
public class MobileController {
	
	@Autowired
	MobileService service;
	
	
	@PostMapping("/addMobile")                                 //http://localhost:1234/mobile/addMobile
	public Mobile addMobile(@RequestBody Mobile mb)
	{
		return service.addmobile(mb);
	}
	
	
	@PostMapping("/updateMobile")                             //http://localhost:1234/mobile/updateMobile
	public Mobile updateMobile(@RequestBody Mobile mb)
	{
		return service.updatemobile(mb);
	}
	
	
	@DeleteMapping("/deleteMobile/{mid}")                      //http://localhost:1234/mobile/deleteMobile/mid
	public String deleteMobile(@PathVariable("mid") int mobileId)
	{
		return service.deletemobile(mobileId);
	}
	
	
	@GetMapping("/getMobile/{mid}")                           //http://localhost:1234/mobile/getMobile/mid
	public Mobile getMobile(@PathVariable("mid") int mobileId)
	{
		return service.getmobile(mobileId);
	}
	
	@GetMapping("/getAllMobile")     	                      //http://localhost:1234/mobile/getAllMobile
	public  List<Mobile> getAllEmployees()
	{
		return service.getAllmobiles();
	}

}
