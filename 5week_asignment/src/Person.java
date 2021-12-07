class Person {
    private String name ;
    private int age ;
    private String address ;
    public Person(String name, int age, String address) {
    this.name = name ; this.age = age ; this.address = address ;
    }
    public String getName() { return name ; }
    public void rename(String name) { this.name = name ; }
    public int getAge() { return age ; }
    public void increaseAge() { age ++ ; }
    public String getAddress() { return address ; }
    public void moveTo(String address) { this.address = address ; }
    @Override
    public String toString() {
        return String.format("%s, %d, %s", name, age, address) ;
    }
    @Override
    public boolean equals(Object o){
        if (this ==  o) return true;
        if (!(o instanceof Person)) return false;
        if (getClass() != o.getClass()) return false;
        Person e = (Person) o;
        return name.equals(e.name)&&this.age==e.getAge()&&address.equals(e.getAddress());
    }
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + Integer.valueOf(this.age).hashCode();
        result = 31 * result + this.address.hashCode();

        return result;
    }
}
