// Given array of marks of students is marks is less them 35 then print the roll no of student
// {56 , 78 , 45 , 23 , 45 ,76 ,23 , 32, 12 , 54 , 23 , 33}
public class test {
    public static void main(String[] args) {

        int[] marks = { 56, 78, 45, 23, 45, 76, 23, 32, 12, 54, 23, 33 };
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35)
                System.out.println(i + " ");

        }
    }
}
