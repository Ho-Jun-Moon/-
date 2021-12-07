package edu.pnu.admin;
import edu.pnu.collection.GenericList;
import edu.pnu.admin.Student;

public class School {
    private String name;
    private int limit;

    private GenericList<Student> students = new GenericList<Student>();
    private int studentCount;

    public String toString() {
        System.out.print("\n");
        String msg = "School Name: " + this.name + " Student Count: " + studentCount +"\n";
        for (int i = 0; i < studentCount; i++){
            msg += "\t" + students.get(i) + "\n";
        }
        return msg;
    }
    public School(String name, int limit){
        this.name = name; this.limit = limit; this.students = new GenericList<Student>(limit); this.studentCount=0;
    }
    public void addStudent(Student student){
        this.students.add(student);
        System.out.print("\n");
        studentCount +=1;
    }
    public void removeAllStudent(){
        System.out.print("\n");
        this.studentCount = 0;
    }
    public Student findStudent(String name, int SchoolYear){
        System.out.print("\n");
        for ( int i = 0; i <studentCount; i++){
            Student tmp = new Student(name, SchoolYear);
            if(this.students.get(i).equals(tmp)) return students.get(i);
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
