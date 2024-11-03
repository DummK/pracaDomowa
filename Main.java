import java.util.Scanner;

class Person {
    String name;
    String surname;
    int age;

    public void showInf() {
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + surname);
        System.out.println("Wiek: " + age);
    }
}



class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person p1 = new Person();

        System.out.println("Podaj imię osoby: ");
        p1.name = scan.nextLine();
        
        System.out.println("Podaj nazwisko osoby: ");
        p1.surname = scan.nextLine();

        System.out.println("Podaj wiek osoby: ");
        p1.age = scan.nextInt();
        
        p1.showInf();
    }
}