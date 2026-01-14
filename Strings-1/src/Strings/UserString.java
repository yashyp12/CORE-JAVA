package Strings;

class MyStringIndexOutOfBoundsException extends RuntimeException {
    public MyStringIndexOutOfBoundsException(String desc) {
        super(desc);
    }
};

public final class UserString {
    private char[] arr;
    private int index;

    public UserString() {
        arr = new char[0];
    }

    public UserString(StringBuilder sb) {
        this(sb.toString());
    }

    public UserString(StringBuffer sb) {
        this(sb.toString());
    }

    public UserString(String str) {
        arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[index++] = str.charAt(i);
        }
    }

    public UserString(int[] arr, int offset, int count) {

        if (arr == null) {
            throw new NullPointerException("array is null");
        }

        if ((offset + count) > arr.length) {
            throw new MyStringIndexOutOfBoundsException("int array index of bounds");
        }
        this.arr = new char[count];
         for(int i =0; i<count;i++){
             this.arr[i] = (char) arr[offset+i];
         }
    }

    public UserString(byte[] arr) {
        this(arr, 0, arr.length);
    }

    public UserString(byte[] arr, int offset, int count) {
        if ((offset + count) > arr.length) {
            throw new MyStringIndexOutOfBoundsException("index out of bounds");
        }
        this.arr = new char[count];

        for (int i = offset, j = 0; i < (offset + count); i++) {
            this.arr[j++] = (char) arr[i];
        }
    }

    public UserString(char[] arr, int offset, int count) {
        if ((offset + count) > arr.length) {
            throw new MyStringIndexOutOfBoundsException("index of bounds");
        }
        this.arr = new char[count];
        for (int i = offset, j = 0; i < (offset + count); i++) {
            this.arr[j++] = arr[i];
        }
    }

    public UserString(char[] arr) {
        this(arr, 0, arr.length);
    }

    public int length() {
        return arr.length;
    }

    @Override
    public String toString() {
        if (arr.length == 0) return "";
        String output = "";
        for (char ele : arr) {
            output += ele;
        }
        return output;
    }

    public char charAt(int index) {
        if (index < 0 || index > arr.length - 1) throw new MyStringIndexOutOfBoundsException("index out of bounds");

        return this.arr[index];
    }

    public UserString concat(UserString str) {
        char[] newArr = new char[this.arr.length + str.length()];
        int indx = 0;
        for (char ele : this.arr) {
            newArr[indx++] = ele;
        }
        for (int i = 0; i < str.length(); i++) {
            newArr[indx++] = str.charAt(i);
        }
        return new UserString(newArr);
    }


    public UserString toUpperCase(){
        UserString newstr = new UserString();
        char[] newArr = new char[this.arr.length];
        int indx = 0;
        for(char ele:this.arr){
            newArr[indx++] = ele;
        }

        int indx1 = 0;
        for(char ele: newArr){
            // pending implementation
        }
        return newstr;
    }

}
