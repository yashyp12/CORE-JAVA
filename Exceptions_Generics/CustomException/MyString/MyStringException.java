package Exceptions_Generics.CustomException.MyString;

class MyStringIndexOutOfBoundsException extends IndexOutOfBoundsException{
    MyStringIndexOutOfBoundsException(String message){
        super(message);
    }
}

class MyNullPointerException extends RuntimeException{
    MyNullPointerException(String message){
        super(message);
    }
}

class MyString{
    char []arr ;

    MyString(String str){
        arr = new char[str.length()];
        for(int i =0; i<str.length();i++){
            arr[i] = str.charAt(i);
        }
    }
    @Override
    public String toString(){
        return new String(arr);
    }

    public char charAt(int index){
        if(arr == null){
            throw new MyNullPointerException("ref is null");
        }
        if(index<0 || index>=arr.length)
            throw new MyStringIndexOutOfBoundsException("INDEX OUT OF BOUND ");
        return arr[index];
    }
}


public class MyStringException {

    static void main(String[] args) {
         String obj = new String("hi");
    MyString str = new MyString(obj);
        System.out.println(str);
        System.out.println(str.charAt(1));
        str = null;
        if(str == null){
            throw new MyNullPointerException("REF IS NULL");
        }
        System.out.println(str.charAt(1));


    }


}
