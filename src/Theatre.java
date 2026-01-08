import java.util.Scanner;
import java.util.ArrayList;

public class Theatre {

    public static void main (String[] args) {

     Actor actor1 = new Actor("Забек", "Спортсменов", 160.0, Gender.MALE);
     Actor actor2 = new Actor("Антон", "Шмурдяк", 150.0, Gender.MALE);
     Actor actor3 = new Actor("Ушат", "Памоев", 155.0, Gender.MALE);

     Director director1 = new Director("Хуан", "Педро", 14, Gender.MALE);
     Director director2 = new Director("Ногивру", "Ки", 88, Gender.MALE);

     Show show = new Show(director1, "Дон Жуан", 140);
        Person musicAuthor = new Person("Александр", "Шляпик", Gender.MALE);
        Opera opera = new Opera(director2, "Мусорского", 20, musicAuthor, "Бла бла бла", 3);
        Person choreographer = new Person("Денис", "Сухачёв", Gender.MALE);
        Ballet ballet = new Ballet(director1, "Голубиное озеро", 50, musicAuthor, "Бе бе бе", choreographer);

        Scanner scanner = new Scanner(System.in);
        int cmd;

        while (true) {
            System.out.println("Выберите опцию:");
            System.out.println("1. Распределить актёров по спектаклям");
            System.out.println("2. Вывести список актёров для каждого спектакля");
            System.out.println("3. Заменить актёра в одном из спектаклей");
            System.out.println("4. Вывести текст либретто для оперного и балетного спектакля");
            System.out.println("5. Выход");

            cmd = scanner.nextInt();

            switch (cmd) {
                case 1:
                    System.out.println("Выберите спектакль: Обычный, Балет или Опера:");
                    scanner.nextLine();
                    String typeOfShow = scanner.nextLine();

                    System.out.println("Введите имя актёра:");
                    String name = scanner.nextLine();
                    System.out.println("Введите фамилию актёра:");
                    String surname = scanner.nextLine();
                    System.out.println("Введите рост актёра:");
                    double height = scanner.nextDouble();
                    Gender gender = Gender.MALE;

                    Actor newActor = new Actor(name, surname, height, gender);

                    if (typeOfShow.equals("Обычный")) {
                        show.addNewActor(newActor);
                    } else if (typeOfShow.equals("Балет")) {
                        ballet.addNewActor(newActor);
                    } else if (typeOfShow.equals("Опера")) {
                        opera.addNewActor(newActor);
                    } else {
                        System.out.println("Такого варианта нет");
                    }
                    break;
                case 2:
                    System.out.println("Актёры в спектакле 'Дон Жуан':");
                    show.printActorsInfo();
                    System.out.println("Актёры в опере 'Мусорского':");
                    opera.printActorsInfo();
                    System.out.println("Актёры в балете 'Голубиное озеро':");
                    ballet.printActorsInfo();
                    break;
                case 3:
                    System.out.println("Выберите спектакль: Обычный, Балет или Опера:");
                    scanner.nextLine();
                    String typeOfShow1 = scanner.nextLine();

                    if (typeOfShow1.equals("Обычный")) {
                        System.out.println("Введите фамилию заменяемого актёра:");
                        surname = scanner.nextLine();
                        newActor = createNewActor(scanner);
                        try {
                            show.changeActor(surname, newActor);
                        } catch (Exception e) {
                            System.out.println("Ошибка: актёр не найден.");
                        }
                    } else if (typeOfShow1.equals("Балет")) {
                        System.out.println("Введите фамилию заменяемого актёра:");
                        surname = scanner.nextLine();
                        newActor = createNewActor(scanner);
                        try {
                            ballet.changeActor(surname, newActor);
                        } catch (Exception e) {
                            System.out.println("Ошибка: актёр не найден.");
                        }
                    } else if (typeOfShow1.equals("Опера")) {
                        System.out.println("Введите фамилию заменяемого актёра:");
                        surname = scanner.nextLine();
                        newActor = createNewActor(scanner);
                        try {
                            opera.changeActor(surname, newActor);
                        } catch (Exception e) {
                            System.out.println("Ошибка: актёр не найден.");
                        }
                    } else {
                        System.out.println("Такого варианта нет");
                    }
                    break;
                case 4:
                    opera.printLibrettoText();
                    ballet.printLibrettoText();
                    break;
                case 5:
                    System.out.println("До свидания!");
                    return; // Выход из программы
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }

    }
    private static Actor createNewActor(Scanner scanner) {
        System.out.println("Введите имя нового актёра:");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию нового актёра:");
        String surname = scanner.nextLine();
        System.out.println("Введите рост нового актёра:");
        double height = scanner.nextDouble();
        scanner.nextLine();
        Gender gender = Gender.MALE;

        return new Actor(name, surname, height, gender);
    }
}
