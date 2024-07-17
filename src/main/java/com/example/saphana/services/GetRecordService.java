package com.example.saphana.services;


import com.example.saphana.Users;
import com.example.saphana.dao.GetRecordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetRecordService {

    @Autowired
     GetRecordDao getRecordDao;
    public List<Users> getUsers(){

         return getRecordDao.findAll();

    }

    public Boolean addUsers(Users data) {
        try {

            getRecordDao.save(data);
            return true;
        }catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean editUsers(Users data) {
        try{
            getRecordDao.save(data);
            return true;
        }catch(Exception e){
            System.out.println(e);
        }return false;
    }

    public boolean deleteUsers(Users data) {

        System.out.println(data);
        try{
            getRecordDao.delete(data);
            return true;
        }catch(Exception e){
            System.out.println(e);
        }return false;
    }
}
