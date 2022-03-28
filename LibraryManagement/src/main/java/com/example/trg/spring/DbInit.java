package com.example.trg.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.trg.spring.entity.Book;
import com.example.trg.spring.entity.Member;
import com.example.trg.spring.repo.BookRepository;
import com.example.trg.spring.repo.MemberRepository;

@Component
public class DbInit implements CommandLineRunner {
	@Autowired
	MemberRepository repo1;
	@Autowired
	BookRepository repo2;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo1.save(new Member(11, "Dinesh","Hyderabad"));
		repo1.save(new Member(22, "Vignesh ","Chennai"));
		repo1.save(new Member(33, "Kamlesh", "Bangalore"));
		repo1.save(new Member(44, "Harish", "Delhi"));
		
		repo2.save(new Book(101, "Introduction to c++","C++",200.0,11));
		repo2.save(new Book(202, "Head First Java ","Java",500.0,null));
		repo2.save(new Book(303, "Introduction to DBMS", "DBMS",450.0,null));
		repo2.save(new Book(404, "Learning SQL", "SQL",350.0,null));
		
	}

}