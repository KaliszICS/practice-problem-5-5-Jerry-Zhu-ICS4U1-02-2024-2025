class Student implements Comparable<Student>{
    private String studentNumber;
    private String name;
    private int age;

    public Student(String name, int age, String studentNumber){
        this.name = name; 
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber(){
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

@Override
public String toString(){
    return "N:" + this.name + ", A:" + this.age + ", SN:" + this.studentNumber; 
}

@Override
public int compareTo(Student student){
return this.studentNumber.compareTo(student.getStudentNumber());
}
    
    }
