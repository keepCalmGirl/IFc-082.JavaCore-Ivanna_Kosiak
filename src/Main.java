import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String country;
        System.out.println("Введіть країну");
        Scanner sc = new Scanner(System.in);
        country = sc.next();
        Continents continent = Continents.NEVERLAND; //знаю що так не можна але по іншому не компілюється
        switch (country){
            case "Ukraine" : case "Poland" : case "Germany" : case "Great Britan" :
                continent = Continents.EUROPE; break;
            case "Peru" : case "Brasilia" : case "Argentina" :
                continent = Continents.SOUTH_AMERICA; break;
            case "USA" : case "Canada" : case "Mexico" :
                continent = Continents.NORTH_AMERICA; break;
            case "Kenya" : case "Libya" : case "Cameroon" :
                continent = Continents.AFRICA; break;
            case "Australia" : case "Fiji" : case "Samoa" : case "New Zeland" :
                continent = Continents.AUSTRALIA_AND_OCEANIA; break;
            case "China" : case "Korea" : case "Japan" : case "Thailand" :
                continent = Continents.ASIA; break;
            default:
                System.out.println("Даної країни немає в базі даних або не існує");
        }

        System.out.println(country + " is in " + continent);
    }
}
