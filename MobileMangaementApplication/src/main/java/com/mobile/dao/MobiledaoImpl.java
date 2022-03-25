package com.mobile.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.mobile.entity.Mobile;


@Repository
public class MobiledaoImpl implements Mobiledao {
	
	
	@PersistenceContext
	EntityManager entity;

	@Override
	public Mobile addmobile(Mobile mobile) {
		entity.persist(mobile);
		return entity.find(Mobile.class, mobile.getMobileId());
		
		
	}

	@Override
	public Mobile updatemobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return entity.merge(mobile);
	}

	@Override
	public String deletemobile(int mobileId) {
		Mobile mb = entity.find(Mobile.class, mobileId);
				if(mb!=null)
				{
					entity.remove(mb);
					return "mobile deleted successfully";
				}
				else
				{
					return"no mobile found";
				}
	}

	@Override
	public Mobile getmobile(int mobileId) {
		// TODO Auto-generated method stub
		return entity.find(Mobile.class, mobileId);
	}

	@Override
	public List<Mobile> getAllmobiles() {
		TypedQuery<Mobile> result = entity.createQuery("select * from Employee e",Mobile.class);
		return result.getResultList();
	}



}


