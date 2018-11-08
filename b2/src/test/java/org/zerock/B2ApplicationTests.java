package org.zerock;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.Cleanup;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log //문자열로만 표시
public class B2ApplicationTests {
	
	@Setter(onMethod_=@Autowired)
	private DataSource ds;

	@Test
	public void contextLoads() {
		
	}

	
	
	@Test
	@SneakyThrows(Exception.class)
	public void testConection(){
		
		@Cleanup Connection con = ds.getConnection();
		log.info("" + con);
		
	}
}
