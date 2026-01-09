package arrays.arrObject.StudentDriver;

import java.util.Arrays;

public class main {

    static void main(String[] args) {

        Student[] db = new Student[2];
        /*
        in the memory internally the db array is created
        in which db[0] has contains the referncec now
        db[1] contains the references now
         */
        db[0] = new Student("yash", 21, 01, 96, "g H RAISONI ");
        db[1] = new Student("shubham", 21, 02, 97, "g H RAISONI ");

        Student[] db2 = new Student[3];
        db2[0] = new Student("yash", 21, 01, 96, "g H RAISONI ");
        db2[1] = new Student("asd", 21, 01, 96, "g H RAISONI ");
        db2[2] = new Student("sd", 21, 01, 96, "g H RAISONI ");

//internally now for this one this is happening
        /*
        heap area -> db2[null,null,null] -- initially
                      then db2['yash 32 02 96']
                      then db2['yash 32 02 96','asd',-------]
                      then db2['sd 21 01 96','sd',-------]
         */

        showDb(db,db2);
        System.out.println(findTopper(db2));

        Student[]mer = mergedb(db,db2);
        System.out.println(Arrays.toString(mer));

        System.out.println(youngerStudent(mer));

        Student[]ans = removeStudentbyName(mar,"Ganesh");
        System.out.println(Arrays.toString(ans));

        Student[]ans1 = insertStudent(mer,4);
        System.out.println(Arrays.toString(ans1));

    }

    static void showDb(Student[]db1,Student[]db2){
        for (Student student : db1) {
            System.out.println(student);
        }
        for (Student student : db2) {
            System.out.println(student);
        }
    }

    static Student findTopper(Student []arr){

        double max = 0;
        Student ans = arr[0];

        for(int i =0;i<arr.length;i++){
            if(arr[i].per > max){
                max = arr[i].per;
                ans = arr[i];
            }
        }
        return ans;
    }

    static Student[] mergedb(Student[]db1,Student[]db2){

        Student[]ans = new Student[db1.length + db2.length];

        for(int i =0;i<ans.length;i++){
            if(i<db1.length){
                ans[i] = db1[i];
            }else{
                ans[i]=db2[i-db1.length];
            }
        }
        return ans;
    }

    static Student youngerStudent(Student[]mer){
        int minAge = mer[0].age;
        Student ans = mer[0];

        for(int i =0;i<mer.length;i++){
            if(mer[i].age<minAge){
                minAge = mer[i].age;
                ans = mer[i];
            }
        }
        return ans;
    }

    static Student[] removeStudentByName(Student[]mer, String name){
        int nameLen = 0;
        for(int i =0;i<mer.length;i++){
            if(mer[i].name.equals(name)){
                nameLen++;
            }
        }
        Student[]removed = new Student[mer.length - nameLen];
        for(int i =0,j=0;i<mer.length;i++){
            if(!mer[i].name.equals(name)){
                removed[j++] = mer[i];
            }
        }
        return removed;
    }

    static Student[] removeStudentById(Student[]mer, int id){
        int idLen = 0;

        for(int i =0;i<mer.length;i++){
            if(mer[i].id == id){
                idLen++;
            }
        }
        Student[]removedId = new Student[mer.length - idLen];
        for(int i =0,j=0; i<mer.length;i++){
            if(!(mer[i].id==id)){
                removedId[j++] = mer[i];
            }
        }

        return removedId;
    }

}

