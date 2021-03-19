package com.ltts.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.user.domain.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
