package Strings;

public class BuilderString1 {

    public static void main(String[] args) {
        StringBuilder storyBuilder = new StringBuilder("Once upon a  time.");

        System.out.println("Original: " + storyBuilder);

//        appending
        storyBuilder.append("The end");
        System.out.println("Append : " + storyBuilder);

        storyBuilder.insert(12,"sad");
        System.out.println("Insert " + storyBuilder);

        storyBuilder.replace(12,15,"Happy");
        System.out.println("Replace " + storyBuilder);

//        converting it to string
        String finalStory = storyBuilder.toString();

    }
}
