package com.app.demo.controller;

import com.app.demo.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AccountController {
    @Autowired
    AccountService accountService;
    @GetMapping("/")
    public ResponseEntity<String> welcome() {

        return ResponseEntity.ok("Welcome to the Account Management Service!");
    }

}
