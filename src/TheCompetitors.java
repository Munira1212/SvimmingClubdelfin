import java.util.ArrayList;

public abstract class TheCompetitors {

    public static void listeOprettelse(ArrayList<Competitors> lavedListe) {

        lavedListe.add(new Senior("Canada"));
        lavedListe.add(new Senior("Somali"));
        lavedListe.add(new Senior("USA"));
        lavedListe.add(new Senior("DK"));

        lavedListe.add(new Junior("Turkey"));
        lavedListe.add(new Junior("Mexico"));
        lavedListe.add(new Junior("Somali"));
        lavedListe.add(new Junior("Kenya"));


    }

}
