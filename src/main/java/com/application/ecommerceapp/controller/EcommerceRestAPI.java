package com.application.ecommerceapp.controller;

import com.application.ecommerceapp.pojo.UserPojo;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "ecommerce")
public class EcommerceRestAPI {
    @RequestMapping(method = RequestMethod.GET, value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity healthCheck(){
        return ResponseEntity.status(200).body("OK");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity userLogin(@RequestBody UserPojo user){
        return ResponseEntity.status(200).body(user);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity userRegistration(@RequestBody UserPojo user){
        return ResponseEntity.status(200).body(user);
    }
}
