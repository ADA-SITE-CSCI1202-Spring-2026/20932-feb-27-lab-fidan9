public class Person {
    private String firstName;
    private String lastName;
    private String gender;

    // Constructor
    public Person(String firstName, String lastName, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    // Getter and Setter methods
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    // toString method
    public String toString(){
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
    }

    // equals method
    public boolean equals(Person p){
        if(p == null) return false;
        return this.firstName.equals(p.firstName) &&
               this.lastName.equals(p.lastName) &&
               this.gender.equals(p.gender);
    }
    public class MainPerson {
    public static void main(String[] args){
        // Create a Person object
        Person p1 = new Person("Fidan", "Akhundlu", "Female");
        System.out.println(p1.toString());

        // Test getter methods
        System.out.println("First Name: " + p1.getFirstName());
        System.out.println("Last Name: " + p1.getLastName());
        System.out.println("Gender: " + p1.getGender());

        // Test setter methods
        p1.setFirstName("Leyla");
        p1.setLastName("Mammadova");
        p1.setGender("Female");
        System.out.println("After updating: " + p1.toString());

        // Test equals method
        Person p2 = new Person("Leyla", "Mammadova", "Female");
        System.out.println("p1 equals p2? " + p1.equals(p2));
    }
}
}