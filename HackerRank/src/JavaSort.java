import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class Checker2 implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        Double cgpaO1 = o1.getCgpa();
        Double cgpaO2 = o2.getCgpa();
        int result = cgpaO2.compareTo(cgpaO1);
        if(result == 0)
            return o1.getFname().compareTo(o2.getFname());

        return result;
    }
}

//Complete the code
public class JavaSort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, new Checker2());

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
