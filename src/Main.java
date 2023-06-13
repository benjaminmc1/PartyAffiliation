import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your party affiliation (Democrat, Republican, Independent, or Other): ");
        String partyAffiliation = in.nextLine();

        if (Objects.equals(partyAffiliation, "Democrat")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (Objects.equals(partyAffiliation, "Republican")) {
            System.out.println("You get a Republican Elephant.");
        } else if (Objects.equals(partyAffiliation, "Independent")) {
            System.out.println("You get a Independent Person.");
        } else if (Objects.equals(partyAffiliation, "Other")) {
            System.out.println("You get other.");
        } else {
            System.out.println("Invalid party.");
        }
    }
}