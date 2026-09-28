package com.geekyhim.springai.Service.AIProvider;

import org.springframework.stereotype.Service;

@Service("ollamavision")
public class OllamaVision implements AIProvider{
    @Override
    public String call(String prompt) {
        return "";
    }
}
