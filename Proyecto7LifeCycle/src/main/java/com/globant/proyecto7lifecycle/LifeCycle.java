package com.globant.proyecto7lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycle implements BeanNameAware
{
    private static final Logger log = LoggerFactory.getLogger(LifeCycle.class);
    @Override
    public void setBeanName(String name) {
        log.info("Bean name {} ",name);
    }
}
