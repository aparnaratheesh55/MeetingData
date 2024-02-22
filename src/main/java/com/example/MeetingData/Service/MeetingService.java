package com.example.MeetingData.Service;


import com.example.MeetingData.Model.Meeting;
import com.example.MeetingData.Repository.MeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingService {


    @Autowired
    private MeetingRepository meetingRepository;

    public Meeting addMeeting(Meeting meeting){
        return meetingRepository.save(meeting);
    }
    public List<Meeting> findMeeting(){
        return meetingRepository.findAll();
    }

}
