package com.esper.BUMAPP.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired private UserProfileRepository userRepo;


    public void addProfile(UserProfile userProfile) {
        userRepo.save(userProfile);
    }

    public List<UserProfile> listProfiles(){
        return userRepo.findAll();
    }

}