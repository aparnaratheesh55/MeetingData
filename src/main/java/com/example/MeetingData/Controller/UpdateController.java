package com.example.MeetingData.Controller;


import com.example.MeetingData.Model.Updates;
import com.example.MeetingData.Service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping()
public class UpdateController {
    @Autowired
    UpdateService updateService;

    @PostMapping("/add-updates")
    public String addUpdates(@RequestParam Integer updateId, @RequestParam Integer id , @RequestParam Integer meetingId, @RequestParam Integer responseId, @RequestParam  Integer departmentId){
         updateService.addUpdate(id,updateId,responseId,departmentId,meetingId);
         return "successfully updated updates";
    }
    @GetMapping("/find-updates")
    public List<Updates> getAllUpdates()
    {
        return updateService.getAllUpdate();
    }


}
