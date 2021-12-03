package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.FeedBackRepo;
import com.example.demo.model.Feedback;

@Service
public class FeedbackService {
    @Autowired
    private FeedBackRepo feedbackRepository;

    public List<Feedback> listAll(){
        return feedbackRepository.findAll();
    }

    public Feedback get(long id){
        return feedbackRepository.findById(id).get();

    }

    public void save(Feedback feedback){
        feedbackRepository.save(feedback);
    }

    public Feedback update(Feedback feedback ){
        return feedbackRepository.save(feedback);
    }

    public void delete(long id){
        feedbackRepository.deleteById(id);
    }
}

