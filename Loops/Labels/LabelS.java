package Labels;

public class LabelS {

    public static void main(String[] args) {

        System.out.println("Execution started");
        Oddeven:
        {

            if (4 % 2 == 0) {
                System.out.println("its an even num");
                break Oddeven;
            } else {

                System.out.println("Odd cond");
            }

            System.out.println("odd even ends");
        }
        System.out.println("Execution ENDS");

    }
}
