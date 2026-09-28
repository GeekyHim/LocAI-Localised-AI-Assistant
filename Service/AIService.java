package com.geekyhim.springai.Service;

import com.geekyhim.springai.Service.AIProvider.AIProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class AIService {

    private static Map<String, AIProvider> providerMap = new HashMap<>();
    public AIService(Map<String, AIProvider> providerMap){
        this.providerMap = providerMap;
    }

    public static ResponseEntity<String> getAns(String provider, String prompt){
        String res = providerMap.get(provider).call(prompt);
        if(!res.isEmpty())
            return ResponseEntity.ok(res);
        else
            return ResponseEntity.status(500).body("Couldn't reach model");
    }
}
