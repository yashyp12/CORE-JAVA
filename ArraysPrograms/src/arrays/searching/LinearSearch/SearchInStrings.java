package arrays.searching.LinearSearch;

public class SearchInStrings {

    static void main(String[] args) {
        String name = "Yash";
        char target = 'y';

        System.out.println( searchStr(name,target));

    }

    static boolean searchStr(String str,char target){

        if(str.length()==0)return false;

        for(int i = 0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
