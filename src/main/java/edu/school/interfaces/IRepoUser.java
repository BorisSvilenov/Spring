package edu.school.interfaces;

import java.util.List;

import edu.school.models.Subject;
import edu.school.models.User;

public interface IRepoUser {
	List<User> getAll();
	User getById(Long id);
	void create(User user);
	List<User> getAllUsersBySubject(Subject s);

}
