package com.example.trg.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trg.spring.entity.Member;
import com.example.trg.spring.repo.MemberRepository;

@RestController

@RequestMapping("member")
public class MemberController {
	
	@Autowired
	MemberRepository mem;
	
	@PostMapping()
	public ResponseEntity<?> saveMember (@RequestBody Member p){
		if(mem.existsById(p.getMid())) {
			return new ResponseEntity<String>("Product already exist",HttpStatus.BAD_REQUEST);
		}
		mem.save(p);
		return new ResponseEntity<String>("Product with id "+p.getMid()+" successfully saved",HttpStatus.OK);
	}
	@GetMapping("{mid}")
	public ResponseEntity<?> getMember(@PathVariable  int mid){
		Optional<Member> opt=mem.findById(mid);
		if(opt.isPresent()) {
			Member p=opt.get();
			return new ResponseEntity<Member>(p,HttpStatus.OK);
			
		}
		return new ResponseEntity<String>("Product "+mid+" does not exist",HttpStatus.NOT_FOUND);
	}
	
	@GetMapping
	public List<Member> getAll(){
		List<Member> l= mem.findAll();
		return l;
	}
}
