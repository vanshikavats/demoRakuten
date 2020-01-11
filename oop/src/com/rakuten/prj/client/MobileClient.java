package com.rakuten.prj.client;

import com.rakuten.prj.dao.MobileDao;
import com.rakuten.prj.dao.MobileDaoMongoImpl;
import com.rakuten.prj.entity.Mobile;

public class MobileClient {

		public static void main(String[] args)
		{
			Mobile m = new Mobile();
			MobileDao mobileDao= new MobileDaoMongoImpl(); //for SQL, change the call to MobileDaoSQLImpl
			mobileDao.addMobile(m);
		}
	

}
