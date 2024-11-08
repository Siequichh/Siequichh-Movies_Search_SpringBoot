package com.siequichh.moviesearch.movie_search.service;

import com.siequichh.moviesearch.movie_search.dao.UserDao;
import com.siequichh.moviesearch.movie_search.entity.User;
import com.siequichh.moviesearch.movie_search.request.RequestUser;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.findAll();    }

    @Override
    public Optional<User> getUser(Long id) {
        return userDao.findById(id);
    }

    @Override
    public User addUser(RequestUser requestUser) {
        User user = new User();
        user.setUsername(requestUser.getUsername());
        user.setPassword(requestUser.getPassword());
        user.setEmail(requestUser.getEmail());
        return userDao.save(user);
    }

    @Override
    public User updateUser(Long id, RequestUser requestUser) {
        User user = userDao.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found " + id));
        user.setUsername(requestUser.getUsername());
        user.setPassword(requestUser.getPassword());
        user.setEmail(requestUser.getEmail());
        userDao.save(user);
        return user;
    }


}
