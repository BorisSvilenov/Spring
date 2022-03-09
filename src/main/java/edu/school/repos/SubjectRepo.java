package edu.school.repos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import edu.school.interfaces.IRepoSubject;
import edu.school.models.Subject;
import edu.school.models.User;

@Repository("mapSubjectRepo")
public class SubjectRepo implements IRepoSubject {

	private Map<Long, Subject> subjects = new HashMap<>();
	private long id=0L;
	
	
	@Override
	public List<Subject> getAll() 
	{
		return new ArrayList<Subject>(subjects.values());
	}

	@Override
	public Subject getById(Long id)
	{
		return subjects.get(id);
	}

	@Override
	public void create(Subject s) {
		s.setId(++id);
		subjects.put(id, s);
	}

	@Override
	public List<Subject> getAllSubjectsByUser(User u) {
		// TODO Auto-generated method stub
		return null;
	}

}
