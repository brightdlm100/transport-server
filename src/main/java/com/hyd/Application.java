package com.hyd;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;

@SpringBootApplication
//@	ComponentScan(basePackages= {"controller","dao.po.mapper","controller.base","service.base.impl"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Autowired
    private Environment env;

    //destroy-method="close"�������ǵ����ݿ����Ӳ�ʹ�õ�ʱ��,�ͰѸ��������·ŵ����ݳ���,�����´�ʹ�õ���.
    @Bean(destroyMethod =  "close")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));//�û���
        dataSource.setPassword(env.getProperty("spring.datasource.password"));//����
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        dataSource.setInitialSize(2);//��ʼ��ʱ�����������ӵĸ���
        dataSource.setMaxActive(20);//������ӳ�����
        dataSource.setMinIdle(0);//��С���ӳ�����
        dataSource.setMaxWait(60000);//��ȡ����ʱ���ȴ�ʱ�䣬��λ���롣
        dataSource.setValidationQuery("SELECT 1");//������������Ƿ���Ч��sql
        dataSource.setTestOnBorrow(false);//��������ʱִ��validationQuery��������Ƿ���Ч
        dataSource.setTestWhileIdle(true);//��������Ϊtrue����Ӱ�����ܣ����ұ�֤��ȫ�ԡ�
        dataSource.setPoolPreparedStatements(false);//�Ƿ񻺴�preparedStatement��Ҳ����PSCache
        return dataSource;
    }
}

    /* @Bean
   public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }*/

