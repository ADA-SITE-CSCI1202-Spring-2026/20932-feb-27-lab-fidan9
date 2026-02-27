public class Teacher extends Person {
    private String department;
    private String[] courses;

    // Constructor
    public Teacher(String firstName, String lastName, String gender,
                   String department, String[] courses){
        super(firstName, lastName, gender); // calls Person constructor
        this.department = department;
        this.courses = courses;
    }

    // Getter and Setter methods
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String[] getCourses() { return courses; }
    public void setCourses(String[] courses) { this.courses = courses; }

    // toString method
    public String toString(){
        String courseList = String.join(", ", courses);
        return "Teacher [firstName=" + getFirstName() + ", lastName=" + getLastName() +
               ", gender=" + getGender() + ", department=" + department +
               ", courses=" + courseList + "]";
    }

    // equals method
    public boolean equals(Teacher t){
        if(t == null) return false;
        if(!super.equals(t)) return false; // checks Person attributes
        if(!this.department.equals(t.department)) return false;
        if(this.courses.length != t.courses.length) return false;
        for(int i = 0; i < courses.length; i++){
            if(!this.courses[i].equals(t.courses[i])) return false;
        }
        return true;
    }
    public class MainTeacher {
    public static void main(String[] args){
        // Create a Teacher object
        String[] courses = {"Math", "Physics", "Chemistry"};
        Teacher t1 = new Teacher("Ali", "Huseyn", "Male", "Science", courses);
        System.out.println(t1.toString());

        // Test getter methods
        System.out.println("Department: " + t1.getDepartment());
        System.out.println("Courses: " + String.join(", ", t1.getCourses()));

        // Test setter methods
        t1.setDepartment("Mathematics");
        t1.setCourses(new String[]{"Algebra", "Geometry"});
        System.out.println("After updating: " + t1.toString());

        // Test equals method
        Teacher t2 = new Teacher("Ali", "Huseyn", "Male", "Mathematics", new String[]{"Algebra", "Geometry"});
        System.out.println("t1 equals t2? " + t1.equals(t2));
    }
}
}