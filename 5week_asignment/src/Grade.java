enum Enum {FRESH, SOPHOMORE, JUNIOR, SENIOR};
public class Grade {

    private Enum grade;
    public Grade() { this.grade = Enum.FRESH ; }
    public int getGrade() { return grade ; };
    @Override
    public boolean equals(Object o){
            if (this ==  o) return true
            if (!(o instanceof Grade)) return false;
            if (getClass() != o.getClass()) return false;
            Grade e = (Grade) o;
            return this.grade == e.getGrade();
    }
    @Override
    public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.valueOf(grade).hashCode()
            return result;
    }
}