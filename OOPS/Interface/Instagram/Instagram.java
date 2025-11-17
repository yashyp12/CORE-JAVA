package Interface.Instagram;

public interface Instagram {

    /// multiple inheritcane
    int attempts = 3;
    /*
    Features to implement
     1 login , logout , story , post, comment
     */

    default void profileInfo() {
         message();
    }

    void story(String message);

    void post(String caption);

    void login(String username,String pass);

    void logout();

    void comment(String username,String comment);

    private static void message(){
        System.out.println("welcome to instagram");
    }

}
