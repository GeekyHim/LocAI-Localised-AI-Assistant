package com.geekyhim.springai.Controller;

import com.geekyhim.springai.Service.AIService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AIController {
    @GetMapping("/{provider}/{prompt}")
    public ResponseEntity<String> getChat(@PathVariable String provider, @PathVariable String prompt){
        return AIService.getAns(provider, prompt);
    }
}
