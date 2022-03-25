package com.mobile.service;

import java.util.List;
import java.util.Optional;

import com.mobile.entity.Mobile;

public interface MobileService {
	
	Mobile addmobile(Mobile mobile);

	Mobile updatemobile(Mobile mobile);

	void deletemobile(int mobileId);

	Optional<Mobile> getmobile(int mobileId);

	Iterable<Mobile> getAllmobiles();

}
