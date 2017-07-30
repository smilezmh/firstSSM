package smilezmh.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.el.ELException;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;
import smilezmh.pojo.User;
import smilezmh.service.UserService;
import smilezmh.service.UserServiceImpl;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/check.action")
	public void selectUser(Integer id,HttpServletResponse response){
		User user=userService.selectUserById(id);
		System.out.println(user);
		JSONObject json=JSONObject.fromObject(user);
		response.setContentType("text/html;charset=UTF-8");
		//request.getRequestDispatc her("display.jsp").forward(request,response);
		//java代码只能返回一个json格式的字符串	
		try {
			response.getWriter().print(json);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	/*	ModelAndView mav = new ModelAndView();
		mav.addObject("id1", user.getUsername());
		mav.setViewName("checkedFinished");

		
		return mav;*/
	}
}
