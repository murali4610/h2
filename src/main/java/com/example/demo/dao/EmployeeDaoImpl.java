package com.example.demo.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private final static Logger LOGGER=LoggerFactory.getLogger(Employee.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Employee> findAll() {
		 LOGGER.info("### FINDALL METHODS INOVKED###");
		
		return jdbcTemplate.query("select * from TBL_EMPLOYEES",(rs,count)->{
			Employee employee=new Employee();
			employee.setId(rs.getInt("id"));
			employee.setFist_name(rs.getString("first_name"));
			employee.setLast_name(rs.getString("last_name"));
			employee.setEmail(rs.getString("email"));
			return employee;
		});
			
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee employee, int eid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int eid) {
		// TODO Auto-generated method stub
		
	}

	

}
