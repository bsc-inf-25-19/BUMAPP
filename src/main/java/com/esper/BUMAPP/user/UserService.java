package com.esper.BUMAPP.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserProfileRepository userProfileRepository;


    public void addProfile(UserProfile userProfile) {
        userProfileRepository.save(userProfile);
    }

    public List<UserProfile> listProfiles(){
        return userProfileRepository.findAll();
    }

}