package com.Siequichh.MovieSearch.User_Service.dao;

import com.Siequichh.MovieSearch.User_Service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
