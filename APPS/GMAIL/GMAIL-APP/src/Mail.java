import java.util.ArrayList;

public class Mail {
    private String sender;
    private String reciver;
    private String subject;
    private String body;

    public Mail(String sender,String reciver,String subject,String body)
    {
        super();
        this.sender = sender;
        this.reciver = reciver;
        this.subject = subject;
        this.body = body;
    }

    public void getMailInfo(){
        System.out.println("*** MAIL ***");
        System.out.println("Receiver :" + reciver);
        System.out.println("Sender :" + sender);
        System.out.println("Subject :" + subject);
        System.out.println("Body :" + body);
    }

    public String getReciverMail(){
        return this.reciver;
    }

    public void setReciverMail(String newReceiverMail){
        this.reciver = newReceiverMail;
    }

    public void setSubject(String newSubject){
        this.subject = newSubject;
    }

    public void setBody(String newBody){
        this.body = newBody;
    }

    public String getSender(){
        return this.sender;
    }
}

