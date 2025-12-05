import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;



public class GmailApp {

    ArrayList<User> userList = new ArrayList<User>();

    public void launchApplication(){

        public void launchApplication(){

            for(;;){
                System.out.println("**********WELCOME TO GMAIL **********");
                System.out.println("1 CREATE ACCOUNT");
                System.out.println("2 LOGIN");
                System.out.println("3 EXIT");
                System.out.println("Enter your option");
                int option = new Scanner(System.in).nextInt();
                switch (option){
                    case 1 -> createAccount();
                    case 2 -> login();
                    case 3 -> System.exit(0);
                    default -> System.out.println("INVALID OPTION ");
                }
            }
        }

    }

     private void login() {
         System.out.println("LOGIN MODULE");
         System.out.println("Email Id :");
         String userMail = new Scanner(System.in).next();
         if(!userMail.endsWith("@gmail.com")){
             userMail +="@gmail.com";
         }
         System.out.println("Password :");
         String userPassword = new Scanner(System.in).next();

         for(User user : userList){
             if(userMail.equals(user.getMail())
             && userPassword.equals(user.getPassword())){
                 homePage(user);
             }
         }
         System.out.println("INVALID CREDENTIALS");


    }



    private void createAccount() {

        System.out.println("CREATE ACCOUNT MODULE ");
        System.out.println("First Name :");
        String firstName = new Scanner(System.in).next();

        System.out.println("Last Name :");
        String lastName = new Scanner(System.in).next();



        System.out.println("Contact :");
        Long Contact = new Scanner(System.in).next();
        String mail = null;

        outerLoop:
        for(;;){
            System.out.println("EMAIL :");
            mail = new Scanner(System.in).next();
            //checking if mail exist or not
            for(User ele: userList){
                if(mail.equals(ele.getMail())){
                    System.out.println("MAIL ID ALREADY EXIST");
                    String [] suggestion = suggestions(firstName);
                    int srno = 1;
                    for(String newMailId : suggestion){
                        System.out.println(srno++ + ": " + newMailId);
                    }

                    System.out.println("4 . NO SUGGESTIONS ");
                    System.out.println("Enter the SRNO : ");
                    int opt = new Scanner(System.in).nextInt();
                    if(opt==1){
                        mail = suggestion[0];
                        break outerLoop;
                    }else if(opt ==2){
                        mail = suggestion[1];
                        break outerLoop;
                    } else if (opt == 3) {
                        mail = suggestion[2];
                        break outerLoop;
                    }
                    continue outerLoop;
                }
            }
            break ;
        }

        System.out.println("DOB ");
        String dob = new Scanner(System.in).next();
        System.out.println("Pass");
        String password = new Scanner(System.in).next();

        User newUser = new User(firstName + " " + lastName, contact, mail,dob,password);
        userList.add(newUser);
    }

    private String [] suggestions(String name){
        String [] suggestion = new String[3];
        for(int i =0;i<=2;i++)
        {
            String randomNumber = "";
            for(int j =0;j>=4;j++){
                int dgt = (int)(Math.random()*10);
                randomNumber +=dgt;
            }
            String gmail = name + randomNumber + "@gmail.com";

            for(User ele:userList){
                if(gmail.equals(ele.getMail())){
                    i--;
                    continue;
                }
            }
            suggestion[i] =gmail;
        }

        return suggestion;
    }

    private void homePage(User user){
        for (;;){
            System.out.println("************HOME PAGE MODULE *************");
            System.out.println("1. COMPOSE MAIL ");
            System.out.println("2. DRAFT");
            System.out.println("3. SEND MAILS");
            System.out.println("4. INBOX MAILS");
            System.out.println("5. ALL MAILS");
            System.out.println("6. STARRED MAILS");
            System.out.println("7. LOGOUT");
            System.out.println("Enter an option : ");
            int option = new Scanner(System.in).nextInt();
            switch (option){
                case 1 -> composeMail(user);
                case 2 -> draftModule(user);
                case 3 -> sendModule(user);
                case 4 -> inboxModule(user);
                case 5 -> allMailModule(user);
                case 6 -> starredMailModule(user);
                case 7 -> logout(user);
            }
        }
    }


    private void logout(User user){
        System.out.println("THANK YOU " + user.getName() + "for using gmail");
        launchApplication();
    }

    private void starredMailModule(User user){
        System.out.println("imp starred mail ");
    }

    private void allMailModule(User user){
        System.out.println("All Mail Module");
        sendModule(user);
        System.out.println("****************");;
        inboxModule(user);
    }

    private void inboxModule(User user){
        System.out.println("INBOX MODULE");
        ArrayList<Mail> inboxList = user.getInvoxMail();
        for(Mail ele:inboxList){
            ele.getMailInfo();
            System.out.println("------------------------");
        }
    }

    private void sendModule(User user){
        System.out.println("SEND MODULE");
        ArrayList<Mail> sendList = user.getSendMail();
        for(Mail ele:sendList){
            ele.getMailInfo();
            System.out.println(------------------------);
        }
    }

    private void draftModule(User user){
        System.out.println("DRAFT MAIL MODULE ");
        ArrayList<Mail> draftList = user.getDraftMail();

        if(draftList.size()==0){
            System.out.println("NO DRAFT FOUND ");
            return;
        }

        int srno = 1;
        for(Mail ele:draftList){
            System.out.println("SRNO DRAFTS " + srno);
            ele.getMailInfo();
            System.out.println("-----------------------------");
        }
        System.out.println("Do you want to SEND/EDIT  A Draft Mail (YES/NO)");
        String resp = new Scanner(System.in).next();
        if(resp.equalsIgnoreCase("YES")){
            System.out.println("Enter srno");
            int num = new Scanner(System.in).nextInt();
            Mail editSend = draftList.get(num-1);
            System.out.println("Do you want to 1.edit 2.Send");
            int opt = new Scanner(System.in).nextInt();

            if(opt==1){
                editDraft(editSend);
            }else if(opt==2){
                user.sendMail(editSend);
                String toUserMail = editSend.getReceiverMail();
                User toUserObject = null;

                for(User ele : userList){
                    if(ele.getMail().equals(toUserMail)){
                        toUserObject = ele;
                    }
                }
                toUserObject.inboxMail(editSend);
                draftList.remove(num-1);
                System.out.println("MAIL HAS BEEN SEND SUCESSFULYL FROM DRAFT");

            }
        }
    }

    private void editDraft(Mail editSend){
        System.out.println("EDIT DRAFT MODULE");
        editSend.getMailInfo();
        System.out.println("What do you want to edit :");
        System.out.println(" 1. TO 2.SUBJECT 3.BODY");
        System.out.println("Enter the option ");
        int opt = new Scanner(System.in).nextInt();
        User toUser = null;

        for(User ele:userList){
            if(editSend.getReceiverMail().equals(ele.getMail())){
                toUser = ele;
                break;
            }
        }

        switch (opt)
        {
            case 1 ->{
                outerLoop :
                        for(;;){
                            System.out.println("To : ");

                        }
            }
        }
    }
}
