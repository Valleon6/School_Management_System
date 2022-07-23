package schoolManagementSystem;


/**
 * This class is responsible for keeping track
 * of teacher's name, id, and salary.
 */
public class Teacher {
    private int id;
    private String name;
    private double salary;
    private double salaryEarned;

    /**
     *
     * @param id id for the teacher;
     * @param name name of the teacher.
     * @param salary salary of the teacher;
     */
    public Teacher(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    // returns the teacher's id.
    public int getId(){
        return this.id;
    }

    // returns the teacher's name.
    public String getName(){
        return this.name;
    }

    // returns the teacher's salary.
    public double getSalary(){
        return this.salary;
    }

    /**
     * set the salary.
     * @param salary
     */
    public void setSalary(double salary){
        this.salary = salary;
    }

    /**
     * Add to salary earned
     * Removes from the total money earned in Benbee.
     * @param salary
     */
    public void receiveSalary(double salary){
salaryEarned += salary;
School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", salaryEarned=" + salaryEarned +
                '}';
    }
}
