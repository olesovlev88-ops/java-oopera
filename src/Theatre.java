import java.util.Scanner;
import java.util.ArrayList;

public class Theatre {

    public static void main (String[] args) {

     Actor actor1 = new Actor("Забек ", "Спортсменов ", 160.0);
     Actor actor2 = new Actor("Антон ", "Шмурдяк ", 150.0);
     Actor actor3 = new Actor("Ушат ", "Памоев ", 155.0);

     Director director1 = new Director("Хуан", "Педро", 14);
     Director director2 = new Director("Ногивру", "Ки", 88);

     Show show = new Show(director1, "Дон Жуан", 140);
     Opera opera = new Opera(director2, "Мусорского", 20, "Валерий Жмышенко",
             "Бла бла бла", 3);
     Ballet ballet = new Ballet(director1, "Голубиное озеро", 50,
             "Александр Шляпик", "Бе бе бе", "Денис Сухачёв");

        Scanner scanner = new Scanner(System.in);
        int cmd;

        while (true) {
            System.out.println("Выберите опцию:");
            System.out.println("1. Распределить актёров по спектаклям");
            System.out.println("2. Вывести список актёров для каждого спектакля");
            System.out.println("3. Заменить актёра в одном из спектаклей");
            System.out.println("5. Вывести текст либретто для оперного и балетного спектакля");
            System.out.println("6. Выход");

            cmd = scanner.nextInt();

            switch (cmd) {
                case 1:
                    System.out.println("Выберите спектакль: Обычный, Балет или Опера:");
                    scanner.nextLine();
                    String typeOfShow = scanner.nextLine();
                    if (typeOfShow.equals("Обычный")) {
                        show.addNewActor();
                    } else if (typeOfShow.equals("Балет")) {
                        ballet.addNewActor();
                    } else if (typeOfShow.equals("Опера")) {
                        opera.addNewActor();
                    }
                    else {System.out.println("Такого варианта нет");}
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
                        String surname = scanner.next();
                        System.out.println("Введите имя, фамилию и рост нового актёра:");
                        String name = scanner.next();
                        String otherSurname = scanner.next();
                        double height = scanner.nextDouble();
                        Actor newActor = new Actor(name, otherSurname, height);
                        try {
                            show.changeActor(surname, newActor);
                        } catch (Exception e) {
                            System.out.println("Ошибка: актёр не найден.");
                        }
                    } else if (typeOfShow1.equals("Балет")) {
                        System.out.println("Введите фамилию заменяемого актёра:");
                        String surname = scanner.next();
                        System.out.println("Введите имя, фамилию и рост нового актёра:");
                        String name = scanner.next();
                        String otherSurname = scanner.next();
                        double height = scanner.nextDouble();
                        Actor newActor = new Actor(name, otherSurname, height);
                        try {
                            ballet.changeActor(surname, newActor);
                        } catch (Exception e) {
                            System.out.println("Ошибка: актёр не найден.");
                        }
                    } else if (typeOfShow1.equals("Опера")) {
                        System.out.println("Введите фамилию заменяемого актёра:");
                        String surname = scanner.next();
                        System.out.println("Введите имя, фамилию и рост нового актёра:");
                        String name = scanner.next();
                        String otherSurname = scanner.next();
                        double height = scanner.nextDouble();
                        Actor newActor = new Actor(name, otherSurname, height);
                        try {
                            opera.changeActor(surname, newActor);
                        } catch (Exception e) {
                            System.out.println("Ошибка: актёр не найден.");
                        }
                    } else {
                        System.out.println("Такого варианта нет");
                    }
                    break;
                case 5:
                    opera.printLibrettoText();
                    ballet.printLibrettoText();
                    break;
                case 6:
                    System.out.println("До свидания!");
                    return; // Выход из программы
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }

    }
}
