package day2;

public class ExampleTwo {
    public static void main(String[] args) {
        int x = 4, y = 7;
        double a = 6.4, b = 7.9;
        double c = 1.0;
        
        int sum = x = y; //sum is assigned x + y
                            // = is the assignmeny operator
        
        int p = y % 2;   // remainder (modulus)
        int p = y/2;     // division

        double mult = a*b; // double * double = double 

        int sub = x - 1;   // subtracts 1 from x and assigns it back to x
        int numStudents = 14;


        numStudents = numStudents + 1;
        numStudents++;                   // same as numstudents = numstudents + 1
        numStudents--;              // same as numstudents = numstudents - 1

        numStudents += 3;
        numStudents -= 2;

        double temperature = 12.9;

        temperature *= 2;

        temperature /= 2;

        x%=2;
    }

}
