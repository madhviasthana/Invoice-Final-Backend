package com.example.Invoice.Repository;
import com.example.Invoice.Model.Message;
public interface MessageDao {

    int insertMessage(Message invoice_id,Message chatmsg,Message timestamp,Message is_approver);

    default int insertMessage(Message message){
        return insertMessage(message);

    }
}
