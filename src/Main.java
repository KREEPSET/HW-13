public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Дэн", "Абнетт");
        Author author2 = new Author("Грэм", "Макнилл");
        Book book1 = new Book("Возвышение Хоруса", author1, 2006);
        Book book2 = new Book("Лживые боги", author2, 2007);
        book1.setYear(2008);
        System.out.println("book1.getYear() = " + book1.getYear());
    }
}

