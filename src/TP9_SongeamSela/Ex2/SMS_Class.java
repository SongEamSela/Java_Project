package TP9_SongeamSela.Ex2;

public class SMS_Class {
    String subject , content,senderPN,recivePN;
    String type, status;

    public SMS_Class(){}

    public SMS_Class(String subject, String content, String senderPN, String recivePN, String type, String status) {
        this.subject = subject;
        this.content = content;
        this.senderPN = senderPN;
        this.recivePN = recivePN;
        this.type = type;
        this.status = status;
    }
    public SMS_Class (String subject,String content, String senderPN, String recivePN){
        this.subject = subject;
        this.content = content;
        this.senderPN = senderPN;
        this.recivePN = recivePN;
    }

    public SMS_Class(String senderPN, String recivePN) {
        this.senderPN = senderPN;
        this.recivePN = recivePN;
    }
}
