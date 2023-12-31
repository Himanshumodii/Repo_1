package java.springmvc.duo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.springmvc.model.User;

@Repository
public class UserDuo {
    
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user){
	int id = (Integer)this.hibernateTemplate.save(user);
    return id;
	}
}