package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.model.User;
import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	User findByEmail(String email);
    User  findByPassword(String password);
    Optional<User> findByName(String name);

}
