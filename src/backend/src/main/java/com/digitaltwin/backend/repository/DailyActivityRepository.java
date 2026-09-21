package com.digitaltwin.backend.repository;
import com.digitaltwin.backend.entity.DailyActivity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DailyActivityRepository extends JpaRepository<DailyActivity,Long>{}
