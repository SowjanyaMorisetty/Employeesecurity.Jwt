package com.ust.Employeesecurity.Jwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.Employeesecurity.Jwt.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {




	User findByUsername(String username);

	

}
