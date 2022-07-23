package schoolManagementSystem;

import java.util.List;

/**
 * Many teachers, many Students.
 * Implement Teachers and Students using ArrayList.
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static double totalMoneyEarned;
    private static double totalMoneySpent;

    /**
     *new school object is created.
     * @param teachers list of teachers in the school
     * @param students list of the students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in a school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher the teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school.
     * @param student the student to be added.
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school.
     */
    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * adds the total money earned by the school.
     * @param moneyEarned money that's to be added.
     */
    public static void updateTotalMoneyEarned(double moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return the total money spent by the school.
     */
    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *update the money spent by the school which
     * is the salary given by the school to its teachers.
     * @param moneySpent the money spent by the school.
     */
    public static void updateTotalMoneySpent(double moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
