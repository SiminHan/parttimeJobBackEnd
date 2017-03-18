package com.testUnit;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javax.servlet.http.HttpSession;
import com.parttimeJob.vo.CodeMsgVo;
import com.parttimeJob.vo.LoginVo;
import com.parttimeJob.vo.RegestVo;
import com.parttimeJob.service.UserService;

public class TestUser {
	private ApplicationContext context ;
	private String[] config = {"spring/springmvc.xml","spring/applicationContext-dao.xml"};
	private UserService userService;

	@Before
	public void init(){
		this.context = new ClassPathXmlApplicationContext(config);
		userService = (UserService) context.getBean("userService");
	}
	
	 //@Test
		public void regist() throws Exception{
			RegestVo rvo = new RegestVo();
			rvo.setUsername("yixun");
			rvo.setPassword("123456");
		   CodeMsgVo vo = userService.regest(rvo);
		   System.out.println(vo);
	   }
		
		@Test
		public void login() throws Exception{
			LoginVo input = new LoginVo();
			input.setUsername("simin");
			input.setPassword("123456");
		   CodeMsgVo vo = userService.login(null, input);
		   System.out.println(vo);
	   }
		
		//@Test
		public void getUserDetail() throws Exception{
		   Object vo = userService.getUserDetail(null, (long) 1);
		   System.out.println(vo);
	   }
	
}
