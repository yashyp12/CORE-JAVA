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
        for (int i = 0; i < count; i++) {
            this.arr[i] = (char) arr[offset + i];
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

    public UserString toUpperCase() {
        UserString newstr = new UserString();
        char[] newArr = new char[this.arr.length];
        // copying the orignasl character s to the new char array
        int indx = 0;
        for (char ele : this.arr) {
            newArr[indx++] = ele;
        }

        //comversion logic is here
        int indx1 = 0;
        for (char ele : newArr) {
            // pending implementation
            //checks whether teh characters is lowercase or not
            if (ele >= 97 && ele <= 122) {
                newArr[indx1] = (char) (ele - 32);
            }
            indx1++;
        }
        return new UserString(newArr);
    }


    public UserString toLowerCase() {
        UserString newStr = new UserString();
        char[] newArr = new char[this.arr.length];

        int indx = 0;
        for (char ele : this.arr) {
            newArr[indx++] = ele;
        }

        int indx1 = 0;
        for (char ele : newArr) {
            if (ele >= 65 && ele <= 90) {
                newArr[indx1++] = (char) (ele + 32);
            }
            indx1++;
        }
        return new UserString(newArr);
    }

    public int codePointAt(int indx) {
        if (indx < 0 || indx > arr.length - 1)
            throw new MyStringIndexOutOfBoundsException("invalid index");

        //basically this methods returns the asci value
        return this.arr[indx];
    }

    public int codePointBefore(int indx) {
        if (indx <= 0 || indx > arr.length) {
            throw new MyStringIndexOutOfBoundsException("invalid index");
        }
        return this.arr[indx - 1] + 0;
    }

    public boolean isEmpty() {
        return this.arr.length == 0;
    }

    public char[] toCharArray() {
        char[] newArr = new char[this.arr.length];
        int indx = 0;
        for (char ele : this.arr) {
            newArr[indx++] = ele;
        }
        return newArr;
    }

    public boolean equals(Object obj) {
        UserString str = (UserString) obj;
        if (str.length() != this.length()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (this.charAt(i) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean equalsIgnoreCase(UserString comp) {
        return comp.toUpperCase().equals(this.toUpperCase());
    }


    public int indexOf(char ch) {

        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(char ch, int fromIndex) {

        if (fromIndex < 0) {
            fromIndex = 0;
        }

        //CHECK IF THE POINTING INDEX IS OUTSIDE THE ARRAY
        if (fromIndex >= this.arr.length) {
            return -1;
        }

        for (int i = fromIndex; i < this.arr.length; i++) {
            if (this.arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public UserString substring(int indx) {
        return substring(indx, arr.length);
    }

    public UserString substring(int start, int end) {
        if (start < 0 || start > arr.length - 1 || start > end) {
            throw new MyStringIndexOutOfBoundsException("Invalid index");
        }

        UserString str = new UserString();
        for (int i = start; i < end; i++) {
            char ch = this.arr[i];
            str = str.concat(new UserString(ch + " "));
        }
        return str;
    }

    public UserString replace(char oldChar, char newChar) {
        char[] newArr = new char[this.arr.length];

        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == oldChar) {
                newArr[i] = newChar;
            } else {
                newArr[i] = this.arr[i];
            }
        }

        return new UserString(newArr);
    }

    //    CONVERTS THE primitves to String
    public static UserString valueOf(int num) {

        //handle 0 case
        if (num == 0) {
            return new UserString("0");
        }

        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }

        char[] temp = new char[20];
        int index = 0;

        while (num > 0) {
            int digit = num % 10;
            temp[index++] = (char) ('0' + digit);
            num = num / 10;
        }

        if (isNegative) {
            temp[index++] = '-';
        }


//        reverse array
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[index - 1 - i];
        }

        return new UserString(result);
    }


    public boolean contentEquals(StringBuffer sb) {
        if (sb.length() != this.arr.length) {
            return false;
        }
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] != sb.charAt(i)) {
                return false;
            }
        }
        return true;
    }


    public UserString trim() {
        UserString str = new UserString();

        int i = 0;
//        trim string from hthe starts
        for (; i < this.arr.length; i++) {
            if (arr[i] != ' ') {
                break;
            }
        }
        str = substring(i);
        int j = str.length() - 1;
        for (; j >= 0; j--) {
            if (str.charAt(j) != ' ') {
                break;
            }
        }
        str = str.substring(0, j + 1);
        return str;
    }

    public boolean startsWith(UserString str) {
        return startsWith(str, 0);
    }

    public boolean startsWith(UserString str, int indx) {
        if (str.length() > this.arr.length) return false;


        for (int i = 0, j = indx; i < str.length(); i++, j++) {
            if (this.arr[j] != str.charAt(i)) return false;
        }

        return true;
    }


    public boolean endsWith(UserString str) {
        if (str.length() > this.arr.length)
            return false;

        for (int i = str.length() - 1, j = j = this.arr.length - 1; i >= 0; i--, j--) {
            if (this.arr[j] != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public UserString[] split(String str) {
        int cnt = 1;
        for (char ele : this.arr) {
            if (ele == ' ') cnt++;
        }

        UserString[] arr1 = new UserString[cnt];
        int indx = 0;
        UserString str1 = new UserString();

        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] != ' ') {
                str1 = str1.concat(new UserString(this.arr[i] + ""));

            } else {
                arr1[indx++] = str1;

            }
        }

        arr1[indx] = str1;
        return arr1;
    }


}
