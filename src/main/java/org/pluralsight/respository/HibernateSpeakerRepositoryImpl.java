package org.pluralsight.respository;

import org.pluralsight.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository(value = "speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {


    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Hosam");
        speaker.setLastName("Youssef");
        speakers.add(speaker);
        return speakers;
    }
}
