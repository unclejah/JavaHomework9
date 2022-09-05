public class Main {
    public static void main(String[] args) {

        Author kreig = new Author("Крейг","Уоллс");
        Author shild = new Author("Гербет","Шилд");

        Book jav = new Book("Полное руководство", shild, 2011);
        Book spring = new Book("Spring в действии", kreig, 2005);

        spring.setYear(2020);

    }
}