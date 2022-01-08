package lambda;

public class CheckOverGrade implements StudentChecks{
    @Override
    public boolean check(Student s) {
        return s.getAvgGrade() > 8;
    }
}
