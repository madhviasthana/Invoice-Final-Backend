package com.example.Invoice.Controller;
import com.example.Invoice.Model.Message;

import com.example.Invoice.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api/v1/message")

@RestController

public class MessageController {
    private final MessageService messageService;
@Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public void addMessage(@RequestBody Message message){
        messageService.addMessage(message);

    }

}
