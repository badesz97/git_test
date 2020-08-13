package com.szalai.spring.test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.szalai.spring.test.entity.TestFile;

@Component("filesDao")
public class FilesDao {

	private JdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new JdbcTemplate(jdbc);
	}

	public List<TestFile> getFiles() {

		return jdbc.query("select * from files", new RowMapper<TestFile>() {

			public TestFile mapRow(ResultSet rs, int rowNum) throws SQLException {
				TestFile file = new TestFile("");

				file.setId(rs.getInt("id"));
				file.setCompany(rs.getString("company"));
				file.setFilePath(rs.getString("filepath"));

				return file;
			}

		});
	}
}
