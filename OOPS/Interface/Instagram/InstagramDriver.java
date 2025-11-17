package Interface.Instagram;

public class InstagramDriver {


    public static void main(String[] args) {

     Instagram instagram = new InstagramImp("yashyp12","yashyp12","yash@gmail.com");

        instagram.login("yashyp12","yashyp12");
        instagram.post("hello everywone");

        instagram.story("hello buddies");
        instagram.comment("yashyp12","how are you nice one 1");

    }
}
