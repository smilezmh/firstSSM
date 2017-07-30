package smilezmh.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import smilezmh.mapper.UserDao;
import smilezmh.pojo.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public User selectUserById(Integer id) {			
		return userDao.selectUserById(id);
	}

}
