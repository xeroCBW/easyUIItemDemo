package manager;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbw.dto.TbUser;
import com.cbw.service.UserService;

public class TestUserService {
	
	
	@Test
	public void TestUserService() throws Exception{
		@SuppressWarnings("resource")
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us=(UserService) ac.getBean("userService");
		TbUser user = us.selectByPrimaryKey(new Long(22));
		System.out.println(user);

	}
	
	
	
	

}
