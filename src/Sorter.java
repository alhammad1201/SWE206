import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorter {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Scanner sc =new Scanner(new File("Student List.txt"));
            while(sc.hasNextLine()){
                list.add(sc.nextLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        sort(list);
    }

    public static void sort(ArrayList<String> students){
        for (int i = 1; i < students.size(); i++) {
            String key = students.get(i);
            int j = i - 1;
            while (j >= 0 && students.get(j).compareTo(key) > 0) {
                students.set(j + 1, students.get(j));
                j = j - 1;
            }
            students.set(j + 1, key);
        }
        System.out.println("Insertion Sorted List:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}