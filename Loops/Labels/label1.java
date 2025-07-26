package Labels;

public class label1 {
    
    
    public static void main(String[] args) {
        
        int num =1;

        // we cannot use break statement in the if else anywhere outside
        // except - we only use in the label asssociated 
        // evenOdd:
        // if(num%2 == 0){
        //     System.out.println("num is even");
        //     break evenOdd;
        // }

        outerLoop:
        for(int i =1;i<=10;i++){
            innerLoop:
            for(int j =1;j<=5;j++){
                if(i==j) continue outerLoop;
                System.out.println(i);
           
        }
        System.out.println("running outer lop");

    }
}
}