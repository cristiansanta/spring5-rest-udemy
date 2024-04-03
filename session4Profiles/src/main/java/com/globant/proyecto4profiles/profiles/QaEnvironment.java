package com.globant.proyecto4profiles.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Qa")
public class QaEnvironment implements EnvironmentService{
    @Override
    public String getEnvironment() {
        return "Qa";
    }
}
