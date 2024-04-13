package com.ictak.coursefeedbackapp.repository;

import com.ictak.coursefeedbackapp.dbmodels.UserEnitity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserEnitity, Long> {
    @Query(value = "SELECT * FROM users WHERE email=?1 and password=?2",nativeQuery = true)
    UserEnitity userlogin(String email,String password);
}
