public class Main {
    public static void main(String[] args)
    {
        Student studentVasya = new Student( "Vasya", "Pupkin", 54);
        Student studentPetya = new Student( "Petya", "Ivanov", 88);
        Student studentAlisa = new Student("Alisa", "Seleznyova", 99);

        studentVasya.print();
        studentPetya.print();
        studentAlisa.print();
        System.out.println("Average Rating: " + studentVasya.averageRating(studentVasya,studentPetya,studentAlisa));
        studentVasya.changeRating();
        System.out.println("New average Rating: " + studentVasya.averageRating(studentVasya,studentPetya,studentAlisa));
    }

}
