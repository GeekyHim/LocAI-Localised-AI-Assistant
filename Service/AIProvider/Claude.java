package com.geekyhim.springai.Service.AIProvider;

import org.springframework.ai.anthropic.AnthropicChatModel;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service("claude")
public class Claude implements AIProvider{
    // now we will try chat client
    // chat client has more options for us
    // for eg
    // i might want to get some metadata, i might need to add system prompts, guardrails etc
    // it gives us more power + abstraction layer over chatModel
    private ChatClient chatClient;

    Claude(AnthropicChatModel chatModel){
        this.chatClient = ChatClient.create(chatModel);
    }

    @Override
    public String call(String prompt) {
        return chatClient.prompt(prompt).call().content();
    }
}
