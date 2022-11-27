import java.util.ArrayList;

public class Junior extends Competitors {
    public Junior(String name ){
        super(name);
    }
    public Junior(){
        super();
    }

    public void printJunior(ArrayList<Competitors> lavedListee){

        TheCompetitors.listeOprettelse(lavedListee);
        for (Competitors f :lavedListee)
            System.out.printf("%-12s%-30s%-10s%n",f.placeList(),f.generateOprettelsesår(), f.getName());
    }


}
