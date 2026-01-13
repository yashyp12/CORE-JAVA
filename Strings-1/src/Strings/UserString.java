package Strings;

class MyArrayIndexOutOfBoundsException extends RuntimeException {
    public MyArrayIndexOutOfBoundsException(String desc) {
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
        if ((offset + count) > arr.length) {
            throw new MyArrayIndexOutOfBoundsException("int array index of bounds");
        }
        this.arr = new char[count];

        for (int i = offset, j = 0; i < arr.length; i++) {
            this.arr[j++] = (char) arr[i];
        }
    }


    public UserString(byte[] arr) {
        this(arr, 0, arr.length);
    }

    public UserString(byte[] arr, int offset, int count) {
        if ((offset + count) > arr.length) {
            throw new MyArrayIndexOutOfBoundsException("index out of bounds");
        }
        this.arr = new char[count];

        for (int i = offset, j = 0; i < (offset + count); i++) {
            this.arr[j++] = (char) arr[i];
        }
    }

    public UserString(char[] arr, int offset, int count) {
        if ((offset + count) > arr.length) {
            throw new MyArrayIndexOutOfBoundsException("index of bounds");
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
}
