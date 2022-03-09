package edu.school.interfaces;

import java.util.List;

import edu.school.models.Subject;
import edu.school.models.User;

public interface IRepoSubject {
	List<Subject> getAll();
	Subject getById(Long id);
	void create(Subject s);
	List<Subject> getAllSubjectsByUser(User u);

}
