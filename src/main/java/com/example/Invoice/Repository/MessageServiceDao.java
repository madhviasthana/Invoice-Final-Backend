package com.example.Invoice.Repository;
import com.example.Invoice.Model.Message;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MessageServiceDao implements MessageDao{

    private static List<Message> DB =new ArrayList<>();

    @Override
    public int insertMessage(Message invoice_id, Message chatmsg, Message timestamp, Message is_approver) {
        DB.add(new Message(invoice_id.getInvoice_id(),chatmsg.getChatmsg(),timestamp.getTimestamp(),is_approver.isIs_approver()));
        return 1;
    }


}
