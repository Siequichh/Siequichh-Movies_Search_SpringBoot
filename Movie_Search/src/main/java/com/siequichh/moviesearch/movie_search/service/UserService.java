package com.siequichh.moviesearch.movie_search.service;

import com.siequichh.moviesearch.movie_search.entity.User;
import com.siequichh.moviesearch.movie_search.request.RequestUser;
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

