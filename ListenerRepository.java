package com.example.muzick.repositories;

import com.example.muzick.models.Listener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ListenerRepository extends JpaRepository<Listener, Long> {
    //generates query: "SELECT * FROM listener WHERE age = ?1"
    List<Listener> findAllByAge(Integer age);

    @Query("Select * FROM listener WHERE name LIKE '%?1%")
    List<Listener> findAllByPartialName(String query);

}
