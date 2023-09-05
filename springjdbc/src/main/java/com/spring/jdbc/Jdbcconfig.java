package com.spring.jdbc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImp;

@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.dao")
public class Jdbcconfig {

  @Bean("ds")
  public DriverManagerDataSource getDataSource(){
	  
	  DriverManagerDataSource ds = new DriverManagerDataSource();
	  ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	  ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
	  ds.setUsername("root");
	  ds.setPassword("Pass@123");
	  return ds;
  }
  @Bean("jdbcTemplate")
  public JdbcTemplate getTemplate() {
	  
	  JdbcTemplate	jdbcTemplate = new JdbcTemplate();
	  jdbcTemplate.setDataSource(getDataSource());
      return jdbcTemplate;
  }
  
	/*
	 * @Bean("studentDao") 
	 * public StudentDao getStudentDao() {
	 * StudentDaoImp studentDao = new StudentDaoImp();
	 * studentDao.setJdbcTemplate(getTemplate()); return studentDao;
	 *  }
	 */	 
}