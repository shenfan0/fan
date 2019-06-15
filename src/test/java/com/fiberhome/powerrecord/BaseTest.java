package com.fiberhome.powerrecord;

import com.fiberhome.powerrecord.service.PowerRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@SpringBootTest
public class BaseTest extends AbstractTestNGSpringContextTests {

	public static int i = 0;

	@Autowired
	public PowerRecordService powerRecordService;

	@BeforeTest
	public static void init(){
		i += 1;
		System.out.println("初始化>>>>>>>>>>>>>>>");
	}

}
