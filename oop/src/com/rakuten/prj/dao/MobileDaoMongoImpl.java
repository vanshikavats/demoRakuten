package com.rakuten.prj.dao;

import com.rakuten.prj.entity.Mobile;

public class MobileDaoMongoImpl implements MobileDao {

	public MobileDaoMongoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addMobile(Mobile m) {
		System.out.println("Stored in MongoDB!!!");

	}

}
