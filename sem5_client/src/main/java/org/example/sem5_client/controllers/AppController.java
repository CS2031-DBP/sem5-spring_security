package org.example.sem5_client.controllers;

import org.example.sem5_client.models.Message;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class AppController {

    @GetMapping("/list")
    public List<Message> list(){
        return Collections.singletonList(new Message("Test list"));
    }

    @PostMapping("/create")
    public Message create(@RequestBody Message message){
        System.out.println("mensaje guardado: " + message.getText());
        return message;
    }

    @GetMapping("/authorized")
    public Map<String, String> authorized(@RequestParam String code){
        return Collections.singletonMap("code", code);
    }
}
