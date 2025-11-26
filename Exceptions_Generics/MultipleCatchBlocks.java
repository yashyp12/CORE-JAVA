package Exceptions_Generics;

public class MultipleCatchBlocks {

    static void main(String[] args) {
        System.out.println("main starts");

        try{
            System.out.println("try");


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("catch 1 index out of bound exceptib");

        }catch(RuntimeException e){
            System.out.println("array  e handled");
        }catch (Exception e){
            System.out.println("excetpion ");
        }

    }
}
