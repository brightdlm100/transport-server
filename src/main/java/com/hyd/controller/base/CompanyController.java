package com.hyd.controller.base;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyd.domain.po.Company;
import com.hyd.service.base.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private CompanyService companyservice;
	@RequestMapping("/")
    public String index(){
        Company company=new Company();
        company.setCname("xxx");
        company.setCompanyid("128384");
        company.setTel("123455");
		int a=companyservice.add(company);
		return a+" ";
    }
	

}
