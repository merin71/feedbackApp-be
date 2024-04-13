package com.ictak.coursefeedbackapp.dbmodels;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ictak.coursefeedbackapp.enums.OrganizationUnit;
import com.ictak.coursefeedbackapp.enums.Status;
import com.ictak.coursefeedbackapp.enums.TrainingType;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "courses")

public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "course_name", nullable = false, length = 255)
    private String courseName;

    @Enumerated(EnumType.STRING)
    @Column(name = "ou", nullable = false)
    private OrganizationUnit ou;

    @Enumerated(EnumType.STRING)
    @Column(name = "training_type", nullable = false)
    private TrainingType trainingType;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @Column(name = "batch_count", nullable = false)
    private int batchCount;

    @Column(name = "trainer_name", nullable = false, length = 255)
    private String trainerName;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @Column(name = "final_feedback", columnDefinition = "TEXT")
    private String finalFeedback;

    public CourseEntity() {
    }

    public CourseEntity(Long courseId, String courseName, OrganizationUnit ou, TrainingType trainingType, LocalDate startDate, LocalDate endDate, int batchCount, String trainerName, Status status, String finalFeedback) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.ou = ou;
        this.trainingType = trainingType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.batchCount = batchCount;
        this.trainerName = trainerName;
        this.status = status;
        this.finalFeedback = finalFeedback;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public OrganizationUnit getOu() {
        return ou;
    }

    public void setOu(OrganizationUnit ou) {
        this.ou = ou;
    }

    public TrainingType getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(TrainingType trainingType) {
        this.trainingType = trainingType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getBatchCount() {
        return batchCount;
    }

    public void setBatchCount(int batchCount) {
        this.batchCount = batchCount;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getFinalFeedback() {
        return finalFeedback;
    }

    public void setFinalFeedback(String finalFeedback) {
        this.finalFeedback = finalFeedback;
    }
}
