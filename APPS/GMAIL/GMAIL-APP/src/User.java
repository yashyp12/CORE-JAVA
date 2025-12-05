import java.util.ArrayList;

public class User {


    private String name;
    private Long contact;
    private String mail;
    private String dob;
    private String password;
    private ArrayList<Mail> sendMail = new ArrayList<Mail>();
    private ArrayList<Mail> inboxMail = new ArrayList<Mail>();
    private ArrayList<Mail> starredMail = new ArrayList<Mail>();
    private ArrayList<Mail> draftMail = new ArrayList<Mail>();
    private ArrayList<Mail> binMail = new ArrayList<Mail>();

    public User(String name, Long contact, String mail, String dob, String password) {
        this.name = name;
        this.contact = contact;
        this.mail = mail;
        this.dob = dob;
        this.password = password;
    }

    public String getMail() {
        return this.mail;
    }

    public String getPassword() {
        return this.password;
    }

    public void sendMail(Mail send) {
    sendMail.add(send);
    }

    public void inboxMail(Mail inbox){
        inboxMail.add(inbox);
    }

    public void draftMail(Mail draft){
        draftMail.add(draft);
    }
    public String getName(){
        return this.name;
    }

    public ArrayList<Mail> getInboxMail(){
        return this.inboxMail;
    }

    public ArrayList<Mail> getSendMail(){
        return this.sendMail;
    }

    public ArrayList<Mail> getDraftMail(){
        return this.draftMail;
    }
}
