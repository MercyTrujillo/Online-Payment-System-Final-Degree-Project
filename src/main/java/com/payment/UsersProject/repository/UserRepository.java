package com.payment.UsersProject.repository;

import com.payment.UsersProject.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,Integer> {



}
