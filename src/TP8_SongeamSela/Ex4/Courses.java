package TP8_SongeamSela.Ex4;

public class Courses {
    String course_name;
    String course_teacher;

    public Courses(){}

    public Courses(String course_name, String course_teacher) {
        this.course_name = course_name;
        this.course_teacher = course_teacher;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_teacher() {
        return course_teacher;
    }

    public void setCourse_teacher(String course_teacher) {
        this.course_teacher = course_teacher;
    }
}
