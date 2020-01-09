package com.programming.rashmi.springngApp.repository;

import com.programming.rashmi.springngApp.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
