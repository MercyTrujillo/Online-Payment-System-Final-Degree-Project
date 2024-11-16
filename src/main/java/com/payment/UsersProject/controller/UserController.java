package com.payment.UsersProject.controller;

import com.payment.UsersProject.entities.User;
import com.payment.UsersProject.request.UserRequest;

import com.payment.UsersProject.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {



        @Autowired
        private UserService userService;
        private static final Logger log = LoggerFactory.getLogger(UserController.class);





        @RequestMapping(method = RequestMethod.POST, value = "/user")
        public ResponseEntity<String> addUser(@RequestBody UserRequest userRequest){
            userService.addUser(userRequest);
            String message = "user added!!";
            return ResponseEntity.status(HttpStatus.OK).body(message);
        }



        @RequestMapping(method = RequestMethod.GET,value = "/user/{studentId}")
        public Optional<User> getUserById(@PathVariable Integer studentId){
            Optional<User> user = userService.getUserById(studentId);
            return userService.getUserById(studentId);
        }


        @RequestMapping(method = RequestMethod.PUT, value = "/user/{studentId}")
        public ResponseEntity<User> updateUser(@PathVariable Integer studentId, @RequestBody  UserRequest userRequest){
            User user = userService.updateUser(studentId, userRequest);
            return ResponseEntity.ok(user);
        }


        @DeleteMapping(value ="/user/{studentId}" )
        public ResponseEntity<String> deleteUser(@PathVariable Integer studentId){
            userService.deleteUser(studentId);

            return ResponseEntity.ok("customer deleted");
        }






    }



