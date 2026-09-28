package com.geekyhim.springai.Service.AIProvider;

import org.springframework.stereotype.Service;

@Service("ollamachat")
public class OllamaChat implements AIProvider{
    @Override
    public String call(String prompt) {
        return "";
    }
}
