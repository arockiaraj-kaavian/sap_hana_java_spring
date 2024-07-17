package com.example.saphana.dao;


import com.example.saphana.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public interface GetRecordDao extends MongoRepository<Users, String> {
    List<Users> findByid(int id);

}