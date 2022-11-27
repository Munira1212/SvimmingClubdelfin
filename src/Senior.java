import java.util.ArrayList;

public class Senior extends  Competitors  {

    public Senior(String name){
        super(name);
    }
    public Senior(){
        super();
    }

    public void printSenior(ArrayList<Competitors> lavedListee){

            TheCompetitors.listeOprettelse(lavedListee);
        for (Competitors f :lavedListee)
            System.out.printf("%-12s%-30s%-10s%n",f.placeList(),f.generateOprettelsesår(), f.getName());
    }


}



