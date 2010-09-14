package org.mybatis.example;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.example.beans.Contact;
import org.mybatis.example.mappers.ContactMapper;

public class ExampleApplication {
	/**
	 * scope: application
	 */
	private static SqlSessionFactory sqlMapper = null;

	public static void main(String[] args) {
		String resource = "org/mybatis/example/configuration.xml";
		Reader reader = null;

		try {
			reader = Resources.getResourceAsReader(resource);
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SqlSession session = sqlMapper.openSession();
		try {
			ContactMapper mapper = session.getMapper(ContactMapper.class);
			List<Contact> contacts = mapper.selectAll();
			for (Contact contact : contacts) {
				System.out.println(contact.getEmail() + ":"
						+ contact.getFirstName() + ":" + contact.getLastName());
			}
		} finally {
			session.close();
		}
	}
}
