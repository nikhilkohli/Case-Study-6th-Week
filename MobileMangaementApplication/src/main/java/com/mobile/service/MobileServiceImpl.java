package com.mobile.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.dao.Mobiledao;
import com.mobile.entity.Mobile;

@Service
@Transactional
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	Mobiledao dao;

	@Override
	public Mobile addmobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return dao.addmobile(mobile);
	}

	@Override
	public Mobile updatemobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return dao.updatemobile(mobile);
	}

	@Override
	public String deletemobile(int mobileId) {
		// TODO Auto-generated method stub
		return dao.deletemobile(mobileId);
	}

	@Override
	public Mobile getmobile(int mobileId) {
		// TODO Auto-generated method stub
		return dao.getmobile(mobileId);
	}

	@Override
	public List<Mobile> getAllmobiles() {
		// TODO Auto-generated method stub
		return dao.getAllmobiles();
	}

}
