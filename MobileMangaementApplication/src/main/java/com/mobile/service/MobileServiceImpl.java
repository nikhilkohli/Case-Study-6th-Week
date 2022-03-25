package com.mobile.service;

import java.util.List;
import java.util.Optional;

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
		return dao.save(mobile);
	}

	@Override
	public Mobile updatemobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return dao.save(mobile);
	}

	@Override
	public void deletemobile(int mobileId) {
		// TODO Auto-generated method stub
		 dao.deleteById(mobileId);
	}

	@Override
	public Optional<Mobile> getmobile(int mobileId) {
		// TODO Auto-generated method stub
		return dao.findById(mobileId);
	}

	@Override
	public Iterable<Mobile> getAllmobiles() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
