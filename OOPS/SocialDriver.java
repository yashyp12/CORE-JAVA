
import java.util.ArrayList;

class Profile {

    private String profilePhoto;
    private String bio;
    private String nickName;

    public Profile(String profilePhoto, String bio) {
        this(profilePhoto, bio, "");
    }

    Profile(String profilePhoto, String bio, String nickName) {
        this.profilePhoto = profilePhoto;
        this.bio = bio;
        this.nickName = nickName;
    }

    public void getProfileInfo() {
        System.out.println("");
        System.out.println("Profile Info");
        System.out.println("profilePhoto : " + profilePhoto);
        System.out.println("Bio : " + bio);
        System.out.println("NickName : " + nickName);

    }
}

class Comment {

    private String comment;
    private User user;

    Comment(String comment, User user) {
        this.comment = comment;
        this.user = user;
    }

    public void getCommentInfo() {
        System.out.println(user.getUserName() + ":" + comment);

    }

}

class Post {

    private String media;
    private String type;
    private String location;
    private String caption;

    // array list for storing the comments
    ArrayList<Comment> commentList = new ArrayList<Comment>();

    // constructor overloading 
    Post(String media, String type) {
        this(media, type, "NOT AVL");

    }

    Post(String media, String type, String location) {
        this(media, type, location, "not avail");
    }

    Post(String media, String type, String location, String caption) {
        this.media = media;
        this.type = type;
        this.location = location;
        this.caption = caption;

    }

    public void GetPostInfo() {
        System.out.println("POST INFO");
        System.out.println("Media " + media);
        System.out.println("Type " + type);
        System.out.println("Location " + location);
        System.out.println("Caption " + caption);

        // checking whether the comment list is empty or not
        if (commentList.size() == 0) {
            System.out.println("no comments");
            return;
        }

        for (Comment comment : commentList) {
            comment.getCommentInfo();
        }

        System.out.println("____________POST END ______________");
    }

    public void addComment(Comment newComment) {
        commentList.add(newComment);
    }
}

class User {

    private String name;
    private Long contact;
    private String email;
    private Profile profile;
    private ArrayList<Post> PostList = new ArrayList<Post>(); // aggregatiion

    User(String name, Long contact, String email, Profile profile) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.profile = profile;
    }

    public void getUserInfo() {
        System.out.println("User Info");
        System.out.println("Username " + name);
        System.out.println("Contact " + contact);
        System.out.println("Email " + email);
    }

    public Profile getProfile() {
        return profile;
    }

    public void addPost(Post newPost) {
        PostList.add(newPost);
    }

    public ArrayList<Post> getPostList() {
        return PostList;
    }

    public String getUserName() {
        return name;
    }

}

class Group {

    private String name;
    private ArrayList<User> userList = new ArrayList<User>();
    int indx = 0;

    Group(String name, User user) {
        this.name = name;
        this.userList.add(user);
    }

    public void getGroupInfo() {
        System.out.println("Name " + name);
        // user.getUserName()
        System.out.println("Username :  " + userList.get(indx++).getUserName());
    }
}

class SocialMedia {

    private String name;
    private ArrayList<User> userList = new ArrayList<User>();
    private ArrayList<Group> groupList = new ArrayList<Group>();

    public SocialMedia(String name) {
        this.name = name;
    }

    public void launchApplication() {
        System.out.println("WELCOME " + this.name);
    }

    public void addUser(User newUser) {
        userList.add(newUser);
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void addGroup(ArrayList<User> userList, String groupName) {
        for (User user : userList) {
            groupList.add(new Group(groupName, user));
        }
    }

    public ArrayList<Group> getGroupList() {
        return groupList;
    }

}

public class SocialDriver {

    public static void main(String[] args) {
        SocialMedia app = new SocialMedia("INSTAGRAM");
        app.launchApplication();

        Profile profile1
                = new Profile("ramesh.jpg", "JAVA", "MA KA LADLA");
        User user1 = new User("Ramesh kumar", 987654321L, "ramesh@gmail.com", profile1);
        app.addUser(user1);

        Profile profile2
                = new Profile("suresh.jpg", "python", "self lover");
        User user2 = new User("suresh kumar", 987654321L, "suresh@gmail.com", profile2);
        app.addUser(user2);

        Profile profile3
                = new Profile("sSAKSHI.jpg", "python", "self lover");
        User user3 = new User("sSAKSHI kumar", 987654321L, "SAKSHIh@gmail.com", profile3);
        app.addUser(user3);

        ArrayList<User> userList = app.getUserList();
        System.out.println("--------user list -----------");
        for (User element : userList) {
            element.getUserInfo();
            element.getProfile().getProfileInfo();
            System.out.println("--------------------");
        }
        System.out.println("--------user post ----");

        //ramesh post
        Post post1
                = new Post("abc.mps", "Reel", "lonavala", "nothning");

        user1.addPost(post1);

        Post post2
                = new Post("abc.mps", "Reel", "lonavala", "nothning");

        user2.addPost(post2);

        Post post3
                = new Post("abc.mps", "Reel", "lonavala", "nothning");

        user3.addPost(post3);





        ArrayList<User> userlist1 = app.getUserList();
        for (User user : userlist1) {
            user.getUserInfo();
            user.getProfile().getProfileInfo();
            ArrayList<Post> posts = user.getPostList();

            for (Post post : posts) {
                post.GetPostInfo();
            }
            System.out.println(" -----------NEXT USER INFO ----------------");
        }

        System.out.println("--------------AFTER ADDING AN COMMENT ------------------");
        ArrayList<Post> postListSakshi = user3.getPostList();
        Post sakshiPost1 = postListSakshi.get(0);
        sakshiPost1.addComment(new Comment("nice one ", user1));

        sakshiPost1.GetPostInfo();

        ArrayList<User> groupList = new ArrayList<User>();
        groupList.add(user1);
        groupList.add(user2);
        groupList.add(user3);
        app.addGroup(groupList, "THREE IDIOTS");

        System.out.println("gROUP LIST");
        ArrayList<Group> groupList1 = app.getGroupList();

        for (Group group : groupList1) {
            group.getGroupInfo();
        }
    }

}
