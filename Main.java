public class Main {
    public static void main(String[] args) {

        // Создаем виды спорта
        Sport football = new Sport("Football", 5);
        Sport boxing = new Sport("Boxing", 8);

        // Создаем клуб
        SportsClub club = new SportsClub("Olympus", "Almaty");

        // Создаем атлетов
        Athlete a1 = new Athlete("Malbandrod Nurzhanovich", 18, football);
        Athlete a2 = new Athlete("Aidos Serikov", 20, boxing);

        // Вывод объектов
        System.out.println(club);
        System.out.println(a1);
        System.out.println(a2);

        // Сравнение объектов (пример)
        System.out.println("Is difficulty equal? " +
                (football.getDifficultyLevel() == boxing.getDifficultyLevel()));
    }
}
