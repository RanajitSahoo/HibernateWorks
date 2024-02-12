package com.jsp.controller.Principal;

import com.jsp.dao.PrincipalDao;
import com.jsp.dao.SchoolDao;
import com.jsp.dto.Principal;
import com.jsp.dto.School;
import com.jsp.util.Address;

public class SavePrincipal {

	public static void main(String[] args) {
		
		Principal p = new Principal();
		p.setP_name("Raja");
		p.setP_age(56);
		p.setP_experience(20);
		p.setP_salary(50000);
		Address ad = new Address();
		ad.setCity("q");
		ad.setDistrict("a");
		ad.setNation("s");
		ad.setPin(9999);
		ad.setState("od");
		ad.setStreet("e");
		ad.setVillage("i");
		p.setAddress(ad);
		SchoolDao sd = new SchoolDao();
		School s=sd.getSchoolById("SCH-2023-BNGLR-012");
		p.setSchool(s);
		PrincipalDao pd = new PrincipalDao();
		pd.savePrincipal(p);
	}

}
