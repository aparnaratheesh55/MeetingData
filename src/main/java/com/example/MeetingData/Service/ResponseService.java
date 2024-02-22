package com.example.MeetingData.Service;


import com.example.MeetingData.Model.Response;
import com.example.MeetingData.Repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {


    @Autowired
    private ResponseRepository responseRepository;

    public Response addResponse(Response response){
        return responseRepository.save(response);
    }
}
