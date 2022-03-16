package edu.school.repos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.tree.TreePath;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import edu.school.interfaces.IRepoUser;
import edu.school.models.Subject;
import edu.school.models.User;

@Repository("mapUserRepo")
public class UserRepo implements IRepoUser{

	private JdbcTemplate template;

	@Override
	public List<User> getAll() {
		
		List<User> result =  template.query("SELECT * FROM Users", new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u = new User(
						rs.getString("firstName"),
						rs.getString("lastName"),
						rs.getString("email"),
						rs.getString("phoneNumber"),
						rs.getString("address"),
						rs.getString("password"));
					return u;
			}
			
		});
		return result;
	}

	@Override
	public User getById(Long id) {
		User u = template.queryForObject("SELECT * FROM Users where id=?",
				new RowMapper <User> () {

					@Override
					public User mapRow(ResultSet rs, int rowNum) throws SQLException {
						User u = new User(
						rs.getString("firstName"),
						rs.getString("lastName"),
						rs.getString("email"),
						rs.getString("phoneNumber"),
						rs.getString("address"),
						rs.getString("password")); 
						u.setId(rs.getLong("id"));
						return u;
					}
		},id);
		return u;
	}

	@Override
	public void create(User user) {
		
	}

	@Override
	public List<User> getAllUsersBySubject(Subject s) {
		// TODO Auto-generated method stub
		return null;
	}




}
