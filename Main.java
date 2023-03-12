public class Main {
    public static void main(String[] args) {
        Book b1 =new Book();
        Book b2 =new Book(111,"JAVA",87.32);
        Book b4 =new Book(222,"BLUEJ",94.54);
        Book b5 =new Book(333,"HTML",76.45);
        System.out.println("Number"+"|"+"Name"+"|"+"Prize");
        System.out.println(b2);
        System.out.println(b4);
        System.out.println(b5);
    }  
}