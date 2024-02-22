package com.example.MeetingData.Controller;


import com.example.MeetingData.Model.Meeting;
import com.example.MeetingData.Service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class MeetingController {
    @Autowired
    MeetingService meetingService;

    @PostMapping("/add-meeting")
    public Meeting addMeeting(@RequestBody Meeting meeting){
        return meetingService.addMeeting(meeting);
    }

    @GetMapping("/find-meeting")
    public List<Meeting>  findAllMeeting(){
        return meetingService.findMeeting();
    }
}
