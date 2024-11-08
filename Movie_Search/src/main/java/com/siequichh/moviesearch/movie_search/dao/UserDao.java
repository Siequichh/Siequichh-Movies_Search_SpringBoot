package com.siequichh.moviesearch.movie_search.dao;

import com.siequichh.moviesearch.movie_search.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
