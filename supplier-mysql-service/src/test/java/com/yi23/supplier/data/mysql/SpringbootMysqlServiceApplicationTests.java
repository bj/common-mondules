package com.yi23.supplier.data.mysql;

import com.yi23.commons.redis.IYiersanRedis;
import com.yi23.supplier.data.mysql.supplier.mapper.SupplierMapper;
import com.yi23.supplier.data.mysql.supplier.po.Supplier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMysqlServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	SupplierMapper mapper;
	
	@Test
	public void insert(){	
		try {
			Supplier record = new Supplier();
			record.setSupplierName("uuuuuuuuuuuuu"); 
			mapper.insert(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void selectById(){
		Supplier supplier = mapper.selectByPrimaryKey(1L);
		System.out.println("name============"+supplier.getSupplierName()); 
	}

	@Autowired
	IYiersanRedis redis;

	@Test
	public void test(){
		try {
			
			redis.set("namekkkkkkkkkkkkkkkk", "uusjvabABVAVBAHBVOAB");
			System.out.println("namekkkkkkkkkkkkkkkk=============="+redis.get("namekkkkkkkkkkkkkkkk"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
