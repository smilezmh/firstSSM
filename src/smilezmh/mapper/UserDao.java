package smilezmh.mapper;
import org.springframework.beans.factory.annotation.Autowired;

import smilezmh.pojo.User;
public interface UserDao {
	public User selectUserById(Integer id);
}
