package oop.src.chap01;

public class Student {
    private String studentId;
    private String name;
    private String major;

    // 기본 생성자
    public Student() {

    }

    // 사용자 정의 생성자
    public Student(String studentId, String name, String major) {
        this.studentId = studentId;
        this.major = major;
        this.name = name;
    }

    // getter
    // 변수 접근제어자가 private이므로 외부에서 접근하기 위해 값을 리턴함
    public String getStudentId() {
        return this.studentId;
    }

    public String getName() {
        return this.name;
    }

    public String getMajor() {
        return this.major;
    }

    // setter
    // 변수값 변경
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}