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
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (students.get(j).compareTo(students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            String temp = students.get(minIndex);
            students.set(minIndex, students.get(i));
            students.set(i, temp);
        }
        System.out.println("Selection Sorted List:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}