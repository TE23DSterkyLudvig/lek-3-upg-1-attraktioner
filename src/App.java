import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     Scanner tb = new Scanner(System.in); 
     int val = 0;
     int kuponger  = 10;
     int längd = 0;
     int ålder = 0;


     System.out.println("Välkommen, välj attraktion!");
     System.out.println("1.Cirkuskarusellen");
     System.out.println("2:Flygande mattan");
     System.out.println("3.Pumpen");
     System.out.println("4:Gå hem");

     while(true){
     try{
        System.out.print("Ange val:");
        val = tb.nextInt();
        if (val < 1 || val > 4){
            System.out.println("Inte större än 4 eller mindre än 1-");
            continue;
        }
        break;
     }
     catch(Exception e){
        System.out.println("inga bokstäver.");
        continue;
     }

    }

    if (val == 1){
        if (kuponger < 1){
            System.out.println("Du har inte råd att åka cirkuskarusellen.");
        }
        else if(kuponger >= 1){
            System.out.println("Du spenderar en biljett på cikrusekarusellen.");
            kuponger --;
            System.out.println("Du har skoj i karusellen");
        }
    }

    if (val == 2){

        while(true){

        try{
        System.out.print("Ange längd:");
        längd = tb.nextInt();
        break;
        }
        catch(Exception e)
        {
        System.out.println("Inga bokstäver");
        continue;
        }

        }

        if(längd < 140){
            System.out.println("Du är för kort.");
        }


        if (kuponger < 2){
            System.out.println("Du har inte råd att åka flygande mattan.");
        }
        else if(kuponger >= 2){
            System.out.println("Du spenderar 2 kuponger på flygande mattan..");
            kuponger -= 2;
            System.out.println("Du har skoj i flygande mattan");
        }
    }
    if (val == 3){
        if (kuponger < 1){
            System.out.println("Du har inte råd att åka cirkuskarusellen.");
        }
        else if(kuponger >= 1){
            System.out.println("Du spenderar en biljett på cikrusekarusellen.");
            kuponger --;
            System.out.println("Du har skoj i karusellen");
        }
    }
    if (val == 4){
        if (kuponger < 1){
            System.out.println("Du har inte råd att åka cirkuskarusellen.");
        }
        else if(kuponger >= 1){
            System.out.println("Du spenderar en biljett på cikrusekarusellen.");
            kuponger --;
            System.out.println("Du har skoj i karusellen");
        }
    }

    }
}
