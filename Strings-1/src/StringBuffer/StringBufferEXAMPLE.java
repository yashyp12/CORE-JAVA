package StringBuffer;

public class StringBufferEXAMPLE {

    public static void main(String[] args) {
        //String buffer has inital capsity of 16 ,
        //if we create a buffer obj using non arg contsructor

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb = new StringBuffer("Yp"); // 16+2 = 18
        System.out.println(sb.capacity());
        sb = new StringBuffer("Yppppppppyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyp");
        System.out.println(sb.capacity());
        //formula to calculate the capasity = newCapasity = (init capasity +1)*2



    }
}
