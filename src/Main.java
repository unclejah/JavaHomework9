public class Main {
    public static void main(String[] args) {

        Author kreig = new Author("Крейг","Уоллс");
        Author shild = new Author("Гербет","Шилд");

        Book jav = new Book("Полное руководство", shild, 2011);
        Book spring = new Book("Spring в действии", kreig, 2005);

        System.out.println(jav.getName()+" "+jav.getAuthor().getSecondName()+" "+jav.getYear());
        System.out.println(spring.getName()+" "+spring.getAuthor().getSecondName()+" "+spring.getYear());

        spring.setYear(2020);

        System.out.println(spring.getName()+" "+spring.getAuthor().getSecondName()+" "+spring.getYear());

    }
}