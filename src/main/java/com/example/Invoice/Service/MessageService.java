package com.example.Invoice.Service;
import com.example.Invoice.Repository.MessageDao;
import com.example.Invoice.Model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//public int insertMessage(Message invoice_id, Message chatmsg, Message timestamp, Message is_approver) {
@Service @Qualifier("Messageservice")
public class MessageService {
    private final MessageDao messageDao;

@Autowired
    public MessageService(@Qualifier("msgservice") MessageDao messageDao) {
        this.messageDao=messageDao;

    }

    public int addMessage(Message message){
        return messageDao.insertMessage(message);

    }



}
