package com.example.MeetingData.Controller;


import com.example.MeetingData.Model.Meeting;
import com.example.MeetingData.Model.Response;
import com.example.MeetingData.Service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class ResponseController {



    @Autowired
    private ResponseService responseService;

    @PostMapping("/add-response")
    public Response addAllResponse(@RequestBody Response response){
        return responseService.addResponse(response);
    }
}
