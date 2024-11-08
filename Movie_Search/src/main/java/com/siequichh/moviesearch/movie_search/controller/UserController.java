package com.siequichh.moviesearch.movie_search.controller;

import com.siequichh.moviesearch.movie_search.entity.User;
import com.siequichh.moviesearch.movie_search.request.RequestUser;
import com.siequichh.moviesearch.movie_search.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getUsers")
    List<User> getUsers() {
      return  userService.getUsers();
    }

    @GetMapping("/getUsers/{id}")
    Optional<User> getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/addUser")
    User addUser(@RequestBody RequestUser requestUser) {
        return userService.addUser(requestUser);
    }
    @PutMapping("/updateUser/{id}")
    User updateUser(@PathVariable Long id,@RequestBody RequestUser requestUser) {
        return userService.updateUser(id, requestUser);
    }



}
