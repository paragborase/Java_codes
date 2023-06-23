package com.api.book.bootrestbook.dao;

import org.springframework.data.repository.CrudRepository;
import com.api.book.bootrestbook.entities.Book;

public interface BookRepository extends CrudRepository<Book,Integer>{
   public Book findById(int id);
}



//Application.properties
//server.port=8080
//#spring.datasource.name=springjpa
//spring.datasource.url=jdbc:mysql://localhost:3306/springjpa
//spring.datasource.username=root
//spring.datasource.password=root
//spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
//spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL55Dialect
//
//spring.jpa.hibernate.ddl-auto=update