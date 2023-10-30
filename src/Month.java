public class Month {
    public static void main(String[] args) {
        Month m = new Month();
        m.getDaysInMonth(6);
    }

    public void getDaysInMonth(int monthNumber) {
        switch (monthNumber) {
            case 1 -> System.out.println("Январь - 31 день");
            case 2 -> System.out.println("Февраль - 28 дней");
            case 3 -> System.out.println("Март - 31 день");
            case 4 -> System.out.println("Апрель - 30 дней");
            case 5 -> System.out.println("Май - 31 день");
            case 6 -> System.out.println("Июнь - 30 дней");
            case 7 -> System.out.println("Июль - 31 день");
            case 8 -> System.out.println("Август - 31 день");
            case 9 -> System.out.println("Сентябрь - 30 дней");
            case 10 -> System.out.println("Октябрь - 31 день");
            case 11 -> System.out.println("Ноябрь - 30 дней");
            case 12 -> System.out.println("Декабрь - 31 день");
            default -> System.out.println("Некорректный номер месяца");
        }
    }
}