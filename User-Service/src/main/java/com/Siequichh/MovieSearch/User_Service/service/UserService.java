package com.Siequichh.MovieSearch.User_Service.service;


import com.Siequichh.MovieSearch.User_Service.entity.User;
import com.Siequichh.MovieSearch.User_Service.request.RequestUser;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User> getUsers();
    Optional<User> getUser(Long id);
    User addUser(RequestUser requestUser);
    User updateUser(Long id,RequestUser requestUser);
}

