import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dostępne kierunki: ");
        for (Directions kier : Directions.values()) {
            System.out.println(kier.getDescription());
        }
        System.out.println("POdaj wybrany kierunek geograficzny: ");
        Directions kierunek = Directions.valueOf(scanner.nextLine());
        System.out.println("Idziemy w kierunku " + kierunek.getDescription());
        Directions dir = kierunek.convert(4);
        System.out.println(dir.getDescription());

    }
}
