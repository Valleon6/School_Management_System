package schoolManagementSystem;

//This class is responsible for keeping
//track of students, fees, names and fees paid.

public class Student {
    private int id;
    private String name;
    private int grade;
    private double feesPaid;
    private double feesTotal;

    /**
     * Fees for every student is $30,000.
     * Fees pais initially is 0;
     *
     * @param id    id for the student is unique.
     * @param name  name of the student.
     * @param grade grade of the student.
     */

    // The role of the constructor is to initialize a new object;
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Not going alter student name, student's id.

    /**
     * Used to update the students grade.
     *
     * @param grade new grade of the student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding fees to the fees paid.
     * add the fees to the fess paid.
     * The school is going to recive the funds
     *
     * @param fees The fees that the student pays.
     */
    public void payFees(double fees) {
        feesPaid += fees;
    School.updateTotalMoneyEarned(feesPaid);
    }

    // returns id of the student
    public int getId() {
        return id;
    }

    // returns name of student
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    /**
     * @return the total fees of the student.
     */
    public double getFeesTotal() {
        return feesTotal;
    }

    /**
     * * @return the remiaining fee left to be paid.
     */
    public double getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                '}';
    }
}
