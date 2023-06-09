package org.pluralsight.service;

import org.pluralsight.model.Speaker;
import org.pluralsight.respository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl repository constructor ");

        this.repository = repository;
    }
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter ");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();

    }
}
