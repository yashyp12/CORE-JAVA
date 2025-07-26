package Labels;

public class WhileLabel {
    

    public static void main(String[] args) {
        
        // labels in while loop

        
        // int i=1;
        // outerLoop:
        // when we are using labels without block we need to declare it
        // before the condition or add an block outerLoop{}


    //    while(i<=10){
    //     System.out.println(i);
    //     i++;
    //    }
        

    //    break outerLoop;



    // do while for label
    int num = 1;
    dowhileLoop:
    do { 
        System.out.println("hey i am do");
         if(num ==3){
            System.out.println("its an num3");
         }
         num ++;
    } while (num<=4);
    
    }
}
