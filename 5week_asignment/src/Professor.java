class Professor extends Person {
    private String school;
    private String major;

    public Professor(String name, int age, String address, String school, String major){
        super(name, age, address);
        this.school = school;
        this.major = major;
    }
    @Override
    public String toString(){
        return String.format("%s, %d, %s, %s, %s", getName(), getAge(), getAddress(), this.school, this.major);
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String getMajor(){
        return this.major;
    }
    @Override
        public boolean equals(Object o){
            if (this ==  o) return true;
            if (!(o instanceof Professor)) return false;
            if (getClass() != o.getClass()) return false;



            Professor xe = (Professor) o;
            return major.equals(xe.getMajor());
        }
        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + super.hashCode();
            result = 31 * result + major.hashCode();
            return result;
        }
}
