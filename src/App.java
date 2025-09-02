import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    int kuponger  = 10;
    Scanner tb = new Scanner(System.in); 
     int val = 0;
     int längd = 0;
     int alder = 0;
     boolean vuxen;
     int mVuxen[] = {95,4};
     int uVuxen[] = {120,6};
while(kuponger > 0){

     System.out.println("Välkommen, välj attraktion!");
    System.out.println("Du har " + kuponger +" kuponger kvar");
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
        Thread.sleep(3000);
    }

    else if (val == 2){

        System.out.println(

        """
            Längdkrav: 140cm
            Ålderskrav: 8 år    
                """
        );
        while(true){

        try{
        System.out.print("Ange längd:");
        längd = tb.nextInt();
        break;
        }
        catch(Exception e)
        {
        System.out.println("Inga bokstäver");
        tb.nextLine();
        continue;
        }

        }

        if(längd < 140){
            System.out.println("Du är för kort.");
            return;
        }
        else{
            System.out.println("Tillräcklig längd");
        }

        while (true) {
            
        
        try{
            System.out.print("Ange ålder:");
            alder = tb.nextInt();
            break;
            }
            catch(Exception e)
            {
            System.out.println("Inga bokstäver");
            tb.nextLine();
            continue;
            }
    
        }
    
            if(alder < 8){
                System.out.println("Du är för ung.");
                return;
            }
            else{
                System.out.println("Tillräcklig ålder");
                
            }


        
    


        if (kuponger < 2){
            System.out.println("Du har inte råd att åka flygande mattan.");
        }
        else if(kuponger >= 2){
            System.out.println("Du spenderar 2 kuponger på flygande mattan..");
            kuponger -= 2;
            System.out.println("Du har skoj i flygande mattan");
        }

        Thread.sleep(3000);
    }
    
    else if (val == 3){
        int aldergräns = 0;
        int längdgräns = 0;
        while(true){
            System.out.println("""
                    
            Längd med vuxen:95cm    Ålder med vuxen: 4 år
            Längd utan vuxen: 120cm     ålder utan vuxen:6 år
                    """);

            while(true){
            System.out.println("Åker du med vuxen? :");
            tb.nextLine();
            String svar = tb.nextLine();

                if (svar.equalsIgnoreCase("ja")){
                    vuxen = true;
                    break;
                }
                else if(svar.equalsIgnoreCase("nej")){
                    vuxen = false;
                    break;
                }
                else{
                    System.out.println("Du har gjort fel");
                }

            }


            if(vuxen == true){
               aldergräns = mVuxen[1];
               längdgräns = mVuxen[0];
            }
            else if(vuxen == false){
                aldergräns = uVuxen[1];
                längdgräns = uVuxen[0];
            }


            try{
            System.out.print("Ange längd:");
            längd = tb.nextInt();
            break;
            }
            catch(Exception e)
            {
            System.out.println("Inga bokstäver");
            tb.nextLine();
            continue;
            }
    
            }
    
            if(längd < längdgräns){
                System.out.println("Du är för kort.");
                return;
            }
            else{
                System.out.println("Tillräcklig längd");
            }
    
            while (true) {
                
            
            try{
                System.out.print("Ange ålder:");
                alder = tb.nextInt();
                break;
                }
                catch(Exception e)
                {
                System.out.println("Inga bokstäver");
                tb.nextLine();
                continue;
                }
        
            }
        
                if(alder < aldergräns){
                    System.out.println("Du är för ung.");
                    return;
                }
                else{
                    System.out.println("Tillräcklig ålder");
                }
    
    
            
        
    
    
            if (kuponger < 3){
                System.out.println("Du har inte råd att åka pumpen.");
            }
            else if(kuponger >= 3){
                System.out.println("Du spenderar 3 kuponger på pumpen..");
                kuponger -= 3;
                System.out.println("Du har skoj i pumpen");
            }
            Thread.sleep(3000);
        }
    
   else if (val == 4){
    System.out.println("Du valde att gå hem och var tråkig och dyster medans dina vänner har kul på tivoli!");
    Thread.sleep(5000);
    tb.close();
    System.exit(0);

    }

    }
   if(kuponger <= 0) {
    System.out.println("Bye Bye");
    System.exit(0);
    tb.close();
   }
}
}