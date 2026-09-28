package com.geekyhim.springai.Service.AIProvider;

import org.springframework.stereotype.Service;

@Service("claude")
public class Claude implements AIProvider{
    // now we will try chat client
    @Override
    public String call(String prompt) {
        return "";
    }
}
