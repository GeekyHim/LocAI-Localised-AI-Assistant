package com.geekyhim.springai.Service.AIProvider;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.stereotype.Service;

@Service("openai")
public class OpenAI implements AIProvider{
    private OpenAiChatModel chatModel;
    public OpenAI(OpenAiChatModel chatModel){
        this.chatModel = chatModel;
    }
    @Override
    public String call(String prompt) {
        return chatModel.call(prompt);
    }
}
