package com.payment.UsersProject.service;

import com.payment.UsersProject.entities.User;
import com.payment.UsersProject.repository.UserRepository;
import com.payment.UsersProject.request.UserRequest;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {



        @Autowired
        public UserRepository userRepository;



        public void addUser(UserRequest userRequest) {
            User  user = new User();
            user.setName(userRequest.getName());
            user.setLastName(userRequest.getLastName());

            user.setEmail(userRequest.getEmail());
            user.setPassword(userRequest.getPassword());
            user.setCreationDate(LocalDate.now());
            userRepository.save(user);

        }





        public Optional<User> getUserById(Integer studentId) {
            Optional<User> user = userRepository.findById(studentId);
            System.out.println(studentId);
            return user;
        }


        public User updateUser(Integer studentId, UserRequest userRequest) {
            Optional<User> optionalUser= userRepository.findById(studentId);
            if(optionalUser.isPresent()){
                User user = optionalUser.get();
                user.setName(userRequest.getName());
                user.setLastName(userRequest.getLastName());
                user.setEmail(userRequest.getEmail());

                user.setCreationDate(LocalDate.now());
                return
                        userRepository.save(user);
            }else {
                optionalUser.orElseThrow(() -> new EntityNotFoundException("user not found"));
            }
            return null;

        }


        public void deleteUser(Integer studentId) {
            System.out.println("user Deleted");
            userRepository.deleteById(studentId);

        }
    }


