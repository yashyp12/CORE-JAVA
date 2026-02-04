package List.VectorStack;

public class Driver {

    static void main(String[] args) {

        UserStack<Integer> stack1 = new UserStack<>();


        System.out.println(stack1);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);

        stack1.pop();
        System.out.println(stack1.peek());

        System.out.println(stack1.search(30));
    }
}
