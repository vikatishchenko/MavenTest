import java.util.Scanner;

public class Student {

    private String lastName;
    private String firstName;
    private int rating;
    //Constructor
    public int getRating()
    {
        return this.rating;
    }
    public void setRating(int rating)
    {
        this.rating=rating;
    }
    public Student(String name, String lastName, int rating){
        this.firstName = name;
        this.lastName = lastName;
        this.rating = rating;
    }
    public void print(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(rating);
    }
    public void changeRating()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Change rating " + firstName + " " + lastName + ":");
        int newrating = scanner.nextInt();
        rating = newrating;
    }
    public boolean betterStudent(Student studentVasya, Student studentPetya)
    {
        boolean betterStudent = studentVasya.getRating()>studentPetya.getRating();
        return betterStudent;
    }
    public int averageRating(Student studentVasya, Student studentPetya, Student studentAlisa)
    {
        int averageRating = (studentVasya.getRating()+studentPetya.getRating()+studentAlisa.getRating())/3;
        return averageRating;
    }
}
