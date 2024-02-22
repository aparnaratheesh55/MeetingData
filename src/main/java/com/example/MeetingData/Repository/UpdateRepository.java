package com.example.MeetingData.Repository;


import com.example.MeetingData.Model.Meeting;
import com.example.MeetingData.Model.Response;
import com.example.MeetingData.Model.Updates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UpdateRepository extends JpaRepository<Updates,Integer> {



}
