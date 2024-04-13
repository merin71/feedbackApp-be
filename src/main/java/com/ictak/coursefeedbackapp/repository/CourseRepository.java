package com.ictak.coursefeedbackapp.repository;

import com.ictak.coursefeedbackapp.dbmodels.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
}
