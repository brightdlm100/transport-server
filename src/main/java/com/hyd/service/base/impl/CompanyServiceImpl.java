package com.hyd.service.base.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyd.dao.po.mapper.CompanyMapper;
import com.hyd.domain.po.Company;
import com.hyd.service.base.CompanyService;

@Service
public class CompanyServiceImpl  implements CompanyService{
	
	    @Autowired
	    CompanyMapper companyMapper;
		public int add(Company company) {
			return this.companyMapper.insert(company);
		}
}
