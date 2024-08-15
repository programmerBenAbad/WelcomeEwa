package com.example.demo.repository;

import com.example.demo.model.User;

public class JpaRepository {
	public interface UserRepository extends JpaRepository <User, Long> {
		
	}
}
