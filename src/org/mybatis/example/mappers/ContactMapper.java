package org.mybatis.example.mappers;

import java.util.List;

import org.mybatis.example.beans.Contact;

public interface ContactMapper {

	Integer insert(Contact contact);

	List<Contact> selectAll();

	Contact select(Integer id);

	Integer update(Contact contact);

	Integer delete(Integer id);

}
