
public class factora {

    public static void main(String[] args) {
        int num = 3;
        int fact = findFact(num, 1);
        System.out.println(num + ":" + fact);

    }

    public static int findFact(int num, int fact) {

        System.out.println("before : num - " + num + "fact ; - " + fact);
        fact *= num;
        if (num == 0) {
            return fact;
        }
        findFact(num - 1, fact);
        System.out.println("after : num - " + num + "fact - " + fact);
        return fact;
    }
}


/*before num - 4 and fact = 1
*/
