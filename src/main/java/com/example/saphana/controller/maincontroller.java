package com.example.saphana.controller;

import com.example.saphana.Users;
import com.example.saphana.services.GetRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class maincontroller {

    @Autowired
    GetRecordService getRecordService;

    @GetMapping("/getData")
    public List<Users> getUsers()
    {
        System.out.println("Welcome to all to in java Spring");

        // return "Welcome to all for java Spring Class, First of all you must need to know basic info of java Spring and java design patterns";

         return getRecordService.getUsers();

    }
    @PostMapping("/addData")
    public String addUsers(@RequestBody Users data){
        System.out.println(data);
        boolean created = getRecordService.addUsers(data);

        if(created) {
            return "user added successfully";
        }
        else {
            return "operation failed";
        }
    }
    @PutMapping("/editData")
    public String editUsers(@RequestBody Users data){
        boolean updated = getRecordService.editUsers(data);
        if(updated) {
            return "user updated successfully";
        }
        else {
            return " operation failed";
        }
    }
    @DeleteMapping("/deleteData")
    public String deleteUsers(@RequestBody Users data){
        System.out.println(data);
        boolean deleted = getRecordService.deleteUsers(data);
        if(deleted){
            return "user deleted successfully";
        }else{
            return "operation failed";
        }
    }
}
