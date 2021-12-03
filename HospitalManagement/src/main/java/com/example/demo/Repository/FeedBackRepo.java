package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Feedback;

public interface FeedBackRepo extends JpaRepository<Feedback,Long>{

}
