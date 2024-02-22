package com.example.MeetingData.Repository;


import com.example.MeetingData.Model.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRepository  extends JpaRepository<Meeting,Integer> {
}
