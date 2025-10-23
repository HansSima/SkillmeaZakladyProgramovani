import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        // Zaklady
        String pozdrav = "Ahoj svete";
        String jmeno = "preje Honza";
        jmeno = pozdrav;

        //Toto je pro vypsani do konzole
        System.out.println(pozdrav + " " + jmeno);
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        */

        //Kalkulacka
        /*double prvniCislo = 5;
        final double druheCislo = 10;
        druheCislo = 40;

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);

        boolean pravdaNepravda = false;*/

        /*float prvniDesCislo = 0.1f;
        String druheDesCislo = "2";
        System.out.println(prvniDesCislo + druheDesCislo);*/

        /*System.out.println("Ahoj, zadej jmeno:");

        Scanner mujScanner = new Scanner(System.in);
        String jmeno = mujScanner.nextLine();

        System.out.println("Preji pekny den " + jmeno);*/

        //Vylepsena kalkulacka
        /*Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej prvni cislo:");
        int prvniCislo = mujScanner.nextInt();
        System.out.println("Zadej druhe cislo:");
        int druheCislo = mujScanner.nextInt();

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);
        //System.out.println(prvniCislo % druheCislo);*/

        //String metody
        /*Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej svuj text:");
        String mujText = mujScanner.nextLine();

        System.out.println(mujText.length());*/

        /*String textCislo = "55";
        int prevedeneCislo = Integer.parseInt(textCislo);
        System.out.println(prevedeneCislo + 5);*/

        /*int x = 10;
        int y = 9;
        int z = 12;

        System.out.println(!(x > y || z < x) && y > z);*/

        //Podminky
        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej vek:");
        int vek = mujScanner.nextInt();

        if(vek >= 18) {
            System.out.println("Uzivatel je dospely");
        }
        else if(vek < 18 && vek >= 0){
            System.out.println("Uzivatel je dite");
        }
        else {
            System.out.println("Nelze zadat zaporny vek");
        }



    }
}