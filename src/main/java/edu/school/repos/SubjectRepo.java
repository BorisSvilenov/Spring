package edu.school.repos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import edu.school.interfaces.IRepoSubject;
import edu.school.models.Subject;
import edu.school.models.User;

@Repository("mapSubjectRepo")
public class SubjectRepo implements IRepoSubject {

	private JdbcTemplate template;
	private String tableName = "subjects";
	
	
	@Override
	public List<Subject> getAll() 
	{
		
	}

	@Override
	public Subject getById(Long id)
	{
		
		
	}

	@Override
	public void create(Subject s) {
	
	}

	@Override
	public List<Subject> getAllSubjectsByUser(User u) {
		// TODO Auto-generated method stub
		return null;
	}

}
