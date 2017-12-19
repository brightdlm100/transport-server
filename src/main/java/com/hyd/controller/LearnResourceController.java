package com.hyd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hyd.domain.vo.entity.LearnResouce;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/learn")
public class LearnResourceController {

	@RequestMapping("/")
    public ModelAndView index(){

        List<LearnResouce> learnList =new ArrayList<LearnResouce>();
        LearnResouce bean =new LearnResouce("�ٷ��ο��ĵ�","Spring Boot Reference Guide","http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
        learnList.add(bean);
        bean =new LearnResouce("�ٷ�SpringBoot����","�ٷ�SpriongBoot����","https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples");
        learnList.add(bean);
        bean =new LearnResouce("����ѧԺ","Spring Boot �̳�ϵ��ѧϰ","http://www.roncoo.com/article/detail/125488");
        learnList.add(bean);
        bean =new LearnResouce("��MD��������","Spring Boot�ɻ�ϵ�� ","http://tengj.top/");
        learnList.add(bean);
        bean =new LearnResouce("��˱���","Spring Boot�̳̺���Ƶ ","http://www.toutiao.com/m1559096720023553/");
        learnList.add(bean);
        bean =new LearnResouce("����ԳDD","Spring Bootϵ��","http://www.roncoo.com/article/detail/125488");
        learnList.add(bean);
        bean =new LearnResouce("�����΢Ц","Sping Bootϵ������","http://www.ityouknow.com/spring-boot");
        learnList.add(bean);
        bean =new LearnResouce("CSDN����С������ר��","Sping Bootѧϰ","http://blog.csdn.net/column/details/spring-boot.html");
        learnList.add(bean);
        bean =new LearnResouce("�����ȵĲ���","Spring Boot ������ʵս","http://blog.csdn.net/column/details/spring-boot.html");
        learnList.add(bean);
        bean =new LearnResouce("�����˲���ϵ��","���㿪ʼѧSpring Boot ","http://412887952-qq-com.iteye.com/category/356333");
        learnList.add(bean);
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("learnList", learnList);
        return modelAndView;
    }
	

}
