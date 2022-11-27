import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public abstract class Competitors {

    private String name;
    static private int places;

    Scanner sc= new Scanner(System.in);

    public Competitors(String name){
        generateOprettelsesår();
        this.name=name;
    }

    public Competitors() {
    }

    //........................................getter................
    public String getName(){
        return name;
    }

    //..........................competition information-.........................

    public String events(ArrayList<Competitors> lavedListe){
        System.out.println("the name of the location ");
        String name= sc.nextLine();
        //TODO hent svømme disciplinerne

        Senior mdo = new Senior(name);
        lavedListe.add(mdo);
        //System.out.println("oprettelses dagen er: " + LocalDate.now());
        return name;
    }

   // ...................place............................................

    public int placeList(){
    places = places+1;
        return places;
    }

//----------------------time registration------------------------------------
    public LocalTime generateOprettelsesår() {

       LocalTime lt= LocalTime.of(1,9,1);
        long secound = ChronoUnit.MINUTES.between(lt,LocalTime.now().minusHours(1));
        LocalTime tid= lt.plusMinutes(new Random().nextInt((int) secound + 1));

    return tid;
    }


}
