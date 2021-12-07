public class School {
    private String name;
    private int limit;

    private Student[] students;
    private int studentCount;

    public String toString() {
        String msg = "School Name: " + this.name + " StudentCount: " + studentCount +"\n";
        for (int i = 0; i < studentCount; i++){
            msg += "\t" + students[i] + "\n";
        }
        return msg;
    }
    public School(String name, int limit){
        this.name = name; this.limit = limit; this.students = new Student[limit]; this.studentCount=0;
    }
    public void addStudent(Student student){
        this.students[studentCount] = student;
        studentCount +=1;
    }
    public void removeAllStudent(){
        this.studentCount = 0;
    }
    public Student findStudent(String name, int SchoolYear){
        for ( int i = 0; i <studentCount; i++){
            if(this.students[i].getName().equals(name)&&this.Student.getYear()==SchoolYear) return students[i];
        }
        return null;
    }
    public boolean equals(Object o) {
                if (this ==  o) return true;
                if (!(o instanceof School)) return false;
                if (getClass() != o.getClass()) return false;
                School e = (School) o;
                return name.equals(e.name)&&this.limit==e.limit&&this.studentCount==e.studentCount&&this.students.equals(e.students);
        }
        public int hashCode() {
                int result = 1;
                result = 31 * result + this.name.hashCode();
                result = 31 * result + Integer.valueOf(this.limit).hashCode();
                result = 31 * result + Integer.valueOf(this.studentCount).hashCode();
                result = 31 * result + this.students.hashCode();

                return result;
    }

}
