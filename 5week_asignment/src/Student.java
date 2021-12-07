public class Student extends Person {
    private String schoolName ;
    private Grade grade = new Grade();
    public Student(String name, int age, String address, String schoolName) {
    super(name, age, address) ;
    this.schoolName = schoolName ;
    }
    public String getSchoolName() { return schoolName ; }
    public void setSchoolName(String schoolName) {
    this.schoolName = schoolName ;
    }
    public Grade getGrade() { return grade ; }
    public void upGrade() { grade.upGrade() ; }
    @Override
    public String toString() {
    return String.format("%s, %d, %s, %s, %s",
    getName(), getAge(), getAddress(), schoolName, grade) ;
    }
    @Override
            public boolean equals(Object o){
                if (this ==  o) return true;
                if (!(o instanceof Student)) return false;
                if (getClass() != o.getClass()) return false;
                Person tmp = (Person)o;
                if (!(tmp.equals(o)) return false;
                Student e = (Student) o;
                return schoolName.equals(e.getSchoolName());
            }
            @Override
            public int hashCode() {
                int result = 1;
                result = 31 * result + super.hashCode();
                result = 31 * result + schoolName.hashCode();
                return result;
            }
// override hashCode() and equals()
}