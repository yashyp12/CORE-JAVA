

public class ReverseNum {
    //  reverse all the no from 100 to 200

public static void main(String[] args) {
    int start =100;
    int end = 200;

while(start<=end)
{
    int temp = start;
    int rev = 0;

    
    while(start!=0){
        rev *=10+(start%10);
        start /=10;

    }
    System.err.println(rev);
    start++;
}
}
}
