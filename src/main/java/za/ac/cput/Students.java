package za.ac.cput;

public class Students
{
    private String studentName, studentLastname;
    private int studentNumber;
    private Double mark;

    public Students(String studentName, String studentLastname, int studentNumber, Double mark)
    {
        this.studentName = studentName;
        this.studentLastname = studentLastname;
        this.studentNumber = studentNumber;
        this.mark = mark;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastname() {
        return studentLastname;
    }

    public void setStudentLastname(String studentLastname) {
        this.studentLastname = studentLastname;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentName='" + studentName + '\'' +
                ", studentLastname='" + studentLastname + '\'' +
                ", studentNumber=" + studentNumber +
                ", mark=" + mark +
                '}';
    }
}
