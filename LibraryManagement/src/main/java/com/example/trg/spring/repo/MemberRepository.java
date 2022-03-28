package com.example.trg.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trg.spring.entity.Member;

public interface MemberRepository  extends JpaRepository<Member, Integer>{

}
