package com.globant.proyecto4profiles.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Dev")
public class DevEnvironment implements EnvironmentService {
    @Override
    public String getEnvironment(){
        return "Dev";
    }
}