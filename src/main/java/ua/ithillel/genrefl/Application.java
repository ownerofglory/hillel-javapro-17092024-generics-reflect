package ua.ithillel.genrefl;


import ua.ithillel.genrefl.model.container.Container;
import ua.ithillel.genrefl.exporter.DataExporter;
import ua.ithillel.genrefl.exporter.ExcelExporter;
import ua.ithillel.genrefl.model.person.Person;
import ua.ithillel.genrefl.model.product.Book;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Month;

public class Application {
    public static void main(String[] args) {
//        List<?> wildList = new ArrayList<>();
//
//        wildList.add(null);
//        Object o1 = wildList.get(0);
//
//        List<Transaction> transactions = new ArrayList<>();
//        transactions.add(new Deposit());
//        transactions.add(new Deposit());
//        transactions.add(new Deposit());
//        transactions.add(new Withdrawal());
//
//        Account account = new Account();
//
//        List<Deposit> deposits = new ArrayList<>();
//
//        account.execDeposit(transactions);
//        account.execDeposit(deposits);
//
//        List<Object> objdeposits = new ArrayList<>();
//        account.execDeposit(objdeposits);
//
//
//        account.execWithdrawal(transactions);
//
//
//        List<PaymentMethod> paymentMethods = new ArrayList<>();
//        paymentMethods.add(new CreditCardPayment());
//        paymentMethods.add(new DebitCardPayment());
//
//        PaymentProcessor.processPayments(paymentMethods);
//
//        List<CreditCardPayment> creditCardPayments = List.<CreditCardPayment>of(new CreditCardPayment(), new CreditCardPayment());
//        PaymentProcessor.processPayments(creditCardPayments);
//
//        List<DebitCardPayment> debitCardPayments = List.<DebitCardPayment>of(new DebitCardPayment(), new DebitCardPayment());
//        PaymentProcessor.processPayments(debitCardPayments);
//
//        PaymentProcessor.processPayments(List.<PaymentMethod>of(new CreditCardPayment(), new DebitCardPayment()));
//
//        List<? extends PaymentMethod> paymentMethods2 = List.of(new CreditCardPayment(), new DebitCardPayment());
//        PaymentMethod paymentMethod = paymentMethods2.get(0);
//
//
//
//        NumberContainer<Number> numberContainer = new NumberContainer<>(23);
//
//        NumberContainer<Double> numberContainer2 = new NumberContainer<>(23.0);
//
//        NumberContainer<Integer> numberContainer3 = new NumberContainer<>(23);
//
//
//        Integer i = 12; // int  Integer.valueOf(12);
////        Integer.valueOf(12);
//        i = null;
//        Double d = 12.0;
//        Float f = 23f;
//        Boolean b = true;
//        Character c = 'A';
//
//        List<Integer> integers = new ArrayList<>();
//        integers.add(1);
//        integers.add(2);
//
//        Integer i1 = integers.get(0);
//
//
//        Printer printer = new Printer();
//        printer.print("Hi everyone");
//
//        printer.print(new Person("", "", LocalDateTime.now()));
//
//        String sample = printer.<String>getSample();
//
//        Pair<String, Person> personPair = new Pair<>("Jane",
//                new Person("jane", "doe", LocalDateTime.now()));
//
//
//        Container strContainer = new Container("Hello");
//
//        Container<String> realStringContainer = new Container<>("World");
//        String value1 = realStringContainer.getValue();
//
//
//        Person john = new Person("john", "doe", LocalDateTime.now());
//
//        System.out.println(john instanceof Person);
//        System.out.println(john instanceof Object);
//
//
//        Container johnContainer = new Container(john);
//
//        Container<Person> personContainer = new Container<>(john);
//        Person value2 = personContainer.getValue();
//
//        String value = (String) strContainer.getValue();
//        String upperCase = value.toUpperCase();
//
//        Object objJohn = johnContainer.getValue();
//
//
//        System.out.println(johnContainer instanceof Container);
//
//
//
//        List rawList = new ArrayList();
//        rawList.add("Hello");
//
//        Object o = rawList.get(0);


        Person person1 = new Person("John", "Doe", LocalDateTime.of(1990, Month.JANUARY, 15, 10, 0));
        Person person2 = new Person("Jane", "Smith", LocalDateTime.of(1985, Month.FEBRUARY, 20, 12, 30));
        Person person3 = new Person("Alice", "Johnson", LocalDateTime.of(1992, Month.MARCH, 5, 9, 15));
        Person person4 = new Person("Bob", "Williams", LocalDateTime.of(1988, Month.APRIL, 25, 11, 45));
        Person person5 = new Person("Charlie", "Brown", LocalDateTime.of(1995, Month.MAY, 17, 14, 10));
        Person person6 = new Person("David", "Clark", LocalDateTime.of(1983, Month.JUNE, 30, 16, 0));
        Person person7 = new Person("Eve", "Miller", LocalDateTime.of(1991, Month.JULY, 8, 8, 20));
        Person person8 = new Person("Frank", "Davis", LocalDateTime.of(1989, Month.AUGUST, 12, 10, 30));
        Person person9 = new Person("Grace", "Wilson", LocalDateTime.of(1993, Month.SEPTEMBER, 23, 13, 50));
        Person person10 = new Person("Henry", "Moore", LocalDateTime.of(1996, Month.OCTOBER, 10, 15, 5));

        Person[] people = new Person[] {
                person1, person2, person3, person4, person5, person6, person7, person8, person9, person10
        };

        Book book1 = Book.builder().id("1").name("Effective Java")
                .description("A comprehensive guide to best practices in Java")
                .author("Joshua Bloch").publisher("Addison-Wesley")
                .category("Programming").type("Book").build();

        Book book2 = Book.builder().id("2").name("Clean Code")
                .description("A Handbook of Agile Software Craftsmanship")
                .author("Robert C. Martin").publisher("Prentice Hall")
                .category("Programming").type("Book").build();

        Book book3 = Book.builder().id("3").name("The Pragmatic Programmer")
                .description("Your Journey to Mastery")
                .author("Andrew Hunt, David Thomas").publisher("Addison-Wesley")
                .category("Programming").type("Book").build();

        Book book4 = Book.builder().id("4").name("Introduction to Algorithms")
                .description("The standard book for algorithms")
                .author("Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein")
                .publisher("MIT Press").category("Algorithms").type("Book").build();

        Book book5 = Book.builder().id("5").name("Design Patterns")
                .description("Elements of Reusable Object-Oriented Software")
                .author("Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides")
                .publisher("Addison-Wesley").category("Software Design").type("Book").build();

        Book book6 = Book.builder().id("6").name("Java Concurrency in Practice")
                .description("A practical guide to concurrency in Java")
                .author("Brian Goetz").publisher("Addison-Wesley")
                .category("Programming").type("Book").build();

        Book book7 = Book.builder().id("7").name("Refactoring")
                .description("Improving the Design of Existing Code")
                .author("Martin Fowler").publisher("Addison-Wesley")
                .category("Programming").type("Book").build();

        Book book8 = Book.builder().id("8").name("The Mythical Man-Month")
                .description("Essays on Software Engineering")
                .author("Frederick P. Brooks Jr.").publisher("Addison-Wesley")
                .category("Software Engineering").type("Book").build();

        Book book9 = Book.builder().id("9").name("Structure and Interpretation of Computer Programs")
                .description("The foundational book on computer science")
                .author("Harold Abelson, Gerald Jay Sussman").publisher("MIT Press")
                .category("Computer Science").type("Book").build();

        Book book10 = Book.builder().id("10").name("Artificial Intelligence: A Modern Approach")
                .description("The leading textbook on AI")
                .author("Stuart Russell, Peter Norvig").publisher("Pearson")
                .category("Artificial Intelligence").type("Book").build();


        Book[] books = new Book[] {
                book1, book2, book3, book4, book5, book6, book7, book8, book9, book10
        };

//        try {
//            Class<?> aClass1 = Class.forName("ua.ithillel.genrefl.model.product.Book");
//
//            Class<Book> bookClass = Book.class;
//
//            Class<? extends Book> aClass = book1.getClass();
//            String name = aClass.getName();
//            String simpleName = aClass.getSimpleName();
//
//            Field[] fields = aClass.getFields();
//            for (Field field : fields) {
//                String fieldName = field.getName();
//                Class<?> type = field.getType();
//                int modifiers = field.getModifiers();
//
//                System.out.println("Private" + Modifier.isPrivate(modifiers));
//                System.out.println("protected" + Modifier.isProtected(modifiers));
//
//                // public 1 final 10
//                // 0000 0111 - 11
//
//                System.out.println(type.getSimpleName() + " " + fieldName + " " + modifiers);
//            }
//
//            Field[] declaredFields = aClass.getDeclaredFields();
//            for (Field field : declaredFields) {
//                String fieldName = field.getName();
//                Class<?> type = field.getType();
//                int modifiers = field.getModifiers();
//                System.out.println(type.getSimpleName() + " " + fieldName + " " + modifiers);
//            }
//
//            Method[] declaredMethods = aClass.getDeclaredMethods();
//            for (Method method : declaredMethods) {
//                String methodName = method.getName();
//                Class<?> type = method.getReturnType();
//                int modifiers = method.getModifiers();
//                System.out.println(type.getSimpleName() + " " + methodName + " " + modifiers);
//            }
//
//            Method declaredMethod = aClass.getDeclaredMethod("getName");
//
//            Constructor<?>[] constructors = aClass.getConstructors();
//
//            Constructor<? extends Book> defaultConstr = aClass.getConstructor();
//            Book book = defaultConstr.newInstance();
//
//            declaredMethod.invoke(book);
//
//            Method setNameMethod = aClass.getDeclaredMethod("setName", String.class);
//            setNameMethod.invoke(book, "Some book");
//
//
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        } catch (InvocationTargetException e) {
//            throw new RuntimeException(e);
//        } catch (InstantiationException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }


        try (
                FileOutputStream peopleFos = new FileOutputStream("./people.xlsx");
                FileOutputStream booksFos = new FileOutputStream("./books.xlsx");
        ) {
           DataExporter excelExporter = new ExcelExporter();

           excelExporter.export(people, peopleFos);

           excelExporter.export(books, booksFos);

//           excelExporter.export(books, fileOutputStream);

       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }


//        Workbook personWorkbook = new XSSFWorkbook();
//        Sheet personSheet = personWorkbook.createSheet("Person");
//
//
//        Row header = personSheet.createRow(0);
//        header.createCell(0).setCellValue("First Name");
//        header.createCell(1).setCellValue("Last Name");
//        header.createCell(2).setCellValue("Date of birth");
//
//        for (int i = 0; i < people.length; i++) {
//            Row row = personSheet.createRow(i + 1);
//
//            row.createCell(0).setCellValue(people[i].getFirstName());
//            row.createCell(1).setCellValue(people[i].getLastName());
//            row.createCell(2).setCellValue(people[i].getDateOfBirth());
//
//        }
//
//        try(
//                personWorkbook;
//                FileOutputStream fos = new FileOutputStream("persons.xlsx");
//        ) {
//            personWorkbook.write(fos);
//
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }



//        Address address1 = Address.builder()
//                .street("Main St")
//                .number("123")
//                .city("New York")
//                .state("NY")
//                .zip("10001")
//                .country("USA")
//                .build();
//
//        Address address2 = Address.builder()
//                .street("Oak Avenue")
//                .number("456")
//                .city("Los Angeles")
//                .state("CA")
//                .zip("90001")
//                .country("USA")
//                .build();
//
//        Address address3 = Address.builder()
//                .street("Pine Road")
//                .number("789")
//                .city("Chicago")
//                .state("IL")
//                .zip("60601")
//                .country("USA")
//                .build();
//
//        Address address4 = Address.builder()
//                .street("Maple Blvd")
//                .number("101")
//                .city("Houston")
//                .state("TX")
//                .zip("77001")
//                .country("USA")
//                .build();
//
//        Address address5 = Address.builder()
//                .street("Cedar Street")
//                .number("202")
//                .city("Phoenix")
//                .state("AZ")
//                .zip("85001")
//                .country("USA")
//                .build();
//
//        Address address6 = Address.builder()
//                .street("Birch Lane")
//                .number("303")
//                .city("Philadelphia")
//                .state("PA")
//                .zip("19101")
//                .country("USA")
//                .build();
//
//        Address address7 = Address.builder()
//                .street("Elm Street")
//                .number("404")
//                .city("San Antonio")
//                .state("TX")
//                .zip("78201")
//                .country("USA")
//                .build();
//
//        Address address8 = Address.builder()
//                .street("Spruce Avenue")
//                .number("505")
//                .city("San Diego")
//                .state("CA")
//                .zip("92101")
//                .country("USA")
//                .build();
//
//        Address address9 = Address.builder()
//                .street("Willow Drive")
//                .number("606")
//                .city("Dallas")
//                .state("TX")
//                .zip("75201")
//                .country("USA")
//                .build();
//
//        Address address10 = Address.builder()
//                .street("Fir Street")
//                .number("707")
//                .city("San Jose")
//                .state("CA")
//                .zip("95101")
//                .country("USA")
//                .build();
//
//        Address[] addresses = new Address[] {
//                address1, address2, address3, address4, address5, address6, address7, address8, address9, address10
//        };
    }

    private static void processPersonContainer(Container<Person> container) {
        Person value = container.getValue();
    }
}
