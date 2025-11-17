package Interface.Instagram;

public class InstagramImp extends Object implements Instagram {

    int attemptCount = 0;


    String username;
    String password;
    String comment;
    String email;
    boolean login;


    //    private constructor to keep it unmodifed for eveyrone
    private InstagramImp() {
        this.login = false;
    }


    public InstagramImp(String username, String password, String email) {
        super();
        this.username = username;
        this.password = password;
        this.email = email;

        System.out.println("account has been created");
    }


    @Override
    public void story(String message) {
        if (login) {
            System.out.println("story uploadede successfully     " + message);
        } else {
            System.out.println("please logged in again !");
        }
    }

    public void myOpinion() {
        System.out.println("its an demo method ");
    }

    public String toString() {
        return username;
    }

//    public boolean equals(Object o){
//        if(o!=null){
//            if(o instanceof InstagramImp){
//                InstagramImp i = (InstagramImp) o;
//                return this.username==i.username && this.password == i.password &&this.email == i.email;
//            }
//        }
//        return false;
//    }

    public int hashCode() {
        return username.hashCode() + password.hashCode() + email.hashCode();
    }

    @Override
    public void post(String caption) {
        if (login) {
            System.out.println("posted successfully with caption " + caption);
        } else {
            System.out.println("please logged in again !");
        }
    }

    @Override
    public void login(String username, String pass) {

        if (attemptCount < attempts) {
            if (this.username.equals(username) && this.password.equals(pass)) {
                login = true;
                System.out.println("***********login succesfulyl ***************");
            } else {
                attemptCount++;
                System.out.println("login failed remainign attempt " + attemptCount);
            }
        } else {
            System.out.println("you have exhauseted the limit Thank you for visit again !");
        }

    }


    @Override
    public void logout() {
        login = false;
        System.out.println("logout succesfull ************");
    }

    @Override
    public void comment(String username, String comment) {
        if (login) {
            System.out.println(username + " has commetned you " + comment);
        } else {
            System.out.println("please logged in again !");
        }
    }
}
