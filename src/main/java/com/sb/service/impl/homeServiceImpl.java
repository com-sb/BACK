package com.sb.service.impl;

import com.sb.service.homeService;
import org.springframework.stereotype.Service;

@Service
public class homeServiceImpl implements homeService {

    @Override
    public String name() {
        String user = "gggggg";
        return user;
    }
}
