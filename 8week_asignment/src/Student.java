package edu.pnu.admin;

public class Student {
    private String name;
    private int year;

    public Student(String name, int grade){
        this.name = name; this.year = grade;
    }

    public String toString(){
        return String.format("[%s, %d학년]", this.name, this.year);
    }
    public boolean equals(Object o) {
            if (this ==  o) return true;
            if (!(o instanceof Student)) return false;
            if (getClass() != o.getClass()) return false;
            Student e = (Student) o;
            return name.equals(e.getName())&&this.year==e.getYear();
    }
    public int hashCode() {
            int result = 1;
            result = 31 * result + this.name.hashCode();
            result = 31 * result + Integer.valueOf(this.year).hashCode();
            return result;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
}