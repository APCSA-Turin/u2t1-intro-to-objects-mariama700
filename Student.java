public class Student {
    private String name;
    private double grade;
    private int years;


    public Student(String studentName, double studentGrade, int studentAge) {
        name = studentName;
        grade = studentGrade;
        years = studentAge;
    }

    public void introduce(){
        System.out.println("Hello, I'm " + name + ", I have a grade of " + grade + " and am " + years + " years old");
        }

    public void failing() {
        if (grade < 65) {
            System.out.println("This student is failing.");
        } else {
            System.out.println("This student is passing.");
        }
    }
}
