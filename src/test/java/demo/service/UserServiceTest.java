package demo.service;

import javax.sql.DataSource;

import org.aspectj.weaver.Utils;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

	@Autowired
	private DataSource dataSource;

	@Mock
	private Utils utils;
}
