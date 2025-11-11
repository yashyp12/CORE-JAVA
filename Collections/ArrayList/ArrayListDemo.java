package Collections.ArrayList;
import java.util.ArrayList;


public class ArrayListDemo {

   public static void main(String[] args) {

       ArrayList<Integer> list = new ArrayList<Integer>();

       list.add(23);
       list.add(25);
       list.add(26);
       list.add(31);
       System.out.println(list);

       System.out.println(list.get(2));

       for(int i =0; i<list.size(); i++){
           System.out.println(list.get(i));
       }

//       for(int i : list){
//           System.out.println(i);
//       }





    }
}
