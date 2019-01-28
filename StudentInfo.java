package act3studentinfo;
public class StudentInfo {
    //fields
    private String idNumber, firstName, lastName, course, major;
    public String college, term, year;
    //constructor
    public StudentInfo(String college, String term, String year){
        this.college = college;
        this.term = term;
        this.year = year;
    }
    //accessors and mutators
    public String getIdNumber(){
        return idNumber;
    }
    public void setIdNumber(String idNumber){
        this.idNumber = idNumber;
    }
    public String getfirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    //print
    public void print(){
        System.out.println("\nUniversity of the Cordilleras");
        System.out.println(college);
        System.out.println(term+", "+year);
        System.out.println("Student Info:");
        System.out.println("ID Number: " + idNumber);
        System.out.println("Name: "+ lastName+", "+firstName);
        System.out.println("Academic Program: " + course+" - "+major+" Track");
    }
}
