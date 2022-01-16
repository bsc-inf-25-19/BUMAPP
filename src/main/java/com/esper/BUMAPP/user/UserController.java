package com.esper.BUMAPP.user;

import com.esper.BUMAPP.common.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class    UserController {

    @Autowired private UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<UserProfile>> getUsers() {
        List<UserProfile> dtos = userService.listProfiles();
        return new ResponseEntity<List<UserProfile>>(dtos, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addSurvey(@RequestBody UserProfile profile) {
        userService.addProfile(profile);
        return new ResponseEntity<>(new ApiResponse(true, "Profile has been created."), HttpStatus.CREATED);
    }
}