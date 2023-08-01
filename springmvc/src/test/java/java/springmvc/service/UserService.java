package java.springmvc.service;
import java.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.springmvc.duo.UserDuo;

@Service
public class UserService {
     
	@Autowired
	private UserDuo userDao;
	public int createUser(User user) {
		return this.userDao.saveUser(user);
	}
}