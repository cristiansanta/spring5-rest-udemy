package com.globant.proyecto4profiles.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"Prod","default"})
public class ProdEnvironment implements EnvironmentService{
    @Override
    public String getEnvironment() {
        return "Prod";
    }
}