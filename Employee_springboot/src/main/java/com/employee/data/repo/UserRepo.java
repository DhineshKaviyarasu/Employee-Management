package com.employee.data.repo;

import com.employee.data.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserData, Long> {
    UserData findByUserName(String userName);
}
