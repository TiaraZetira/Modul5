import comuniversitymodel.Student;

public class Main {
    public static void main(String[] args) {
        
        Student[] students = {
            new Student("105223041", "Tiara", 20, 3.6),
            new Student("105223040", "Nisrina", 19, 3.8),
            new Student("105223027", "Rippun", 18, 3.4)
        };

       
        System.out.println("---Data Mahasiswa---");
        for (Student student : students) {
            student.dataMahasiswa();
        }
    }
}

