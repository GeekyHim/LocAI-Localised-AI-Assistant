package com.geekyhim.springai.Service.AIProvider;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Service("ollamachat")
public class OllamaChat implements AIProvider{
    private ChatClient chatClient;

    public OllamaChat(OllamaChatModel chatModel){
        this.chatClient = ChatClient.create(chatModel);
    }

    @Override
    public String call(String prompt) {
        return chatClient.prompt(prompt).call().content();
    }
}
