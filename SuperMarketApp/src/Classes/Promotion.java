package Classes;

// Класс, содержащий в себе количество участников акции

public class Promotion {
    private static int countIdPromo1 = 10;

    public int getCountIdPromo() {
        return countIdPromo1;
    }

    @Override
    public String toString() {
        return "Promotion [countIdPromo=" + countIdPromo1 + "]";
    }
}
