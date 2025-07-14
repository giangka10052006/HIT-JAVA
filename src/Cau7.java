import java.util.Scanner;

class Student{
    String id;
    String name;
    int age;
    double gpa;
// constructor : Tạo đối tượng
    public Student() {}
// Nhập thông tin
    public void input(Scanner sc)
    {
        System.out.print("Nhập mã sinh viên: ");
        id = sc.nextLine();
        System.out.print("Nhập họ và tên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        // Đọc 1 dòng từ bàn phím(kiểu string) sau đó chuyển nó thành int và gán vào biến age
        System.out.print("Nhập GPA: ");
        gpa = Double.parseDouble(sc.nextLine());
    }
// Hiển thị thông tin
    public void disPlay(){
        System.out.printf("Mã: %s - Tên: %s - Age: %d - GPA: %.2f\n", id, name, age, gpa);
    }
}

public class Cau7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = Integer.parseInt(sc.nextLine());
        Student[] list = new Student[n];

        // Nhập danh sách
        for(int i = 0; i < n;i++)
        {
            System.out.println("Sinh viên thứ: " + (i + 1));
            list[i] = new Student();//Mỗi phần tử list là 1 đối tượng Student
            list[i].input(sc);
        }
        // Danh sách sinh viên
        System.out.println("Danh sách sinh viên: ");
        for(Student s : list)
        {
            s.disPlay();
        }
        // Tìm sinh viên có GPA cao nhất
        Student topStudent = list[0];
        for(int i = 1; i < n;i++)
        {
            if(list[i].gpa > topStudent.gpa)
            {
                topStudent = list[i];
            }
        }

        System.out.println("Sinh viên có GPA cao nhất: ");
        topStudent.disPlay();
    }
}