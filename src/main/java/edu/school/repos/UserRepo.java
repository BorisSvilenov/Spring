package edu.school.repos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import edu.school.interfaces.IRepoUser;
import edu.school.models.Subject;
import edu.school.models.User;

@Repository("mapUserRepo")
public class UserRepo implements IRepoUser{
	private Map<Long, User> users = new HashMap<>();
	private Long id = 0L;

	@Override
	public List<User> getAll() {
		
		return new ArrayList<User>(users.values());
	}

	@Override
	public User getById(Long id) {
		return users.get(id);
	}

	@Override
	public void create(User user) {
		user.setId(++id);
		users.put(id, user);
	}

	@Override
	public List<User> getAllUsersBySubject(Subject s) {
		// TODO Auto-generated method stub
		return null;
	}

}
