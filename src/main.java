import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
      ArrayList<Competitors> lavedListee = new ArrayList<>();

        Senior ss= new Senior();
        ss.events(lavedListee);
        //ss.printSenior(lavedListee);
        Junior jj = new Junior();
        jj.events(lavedListee);
        jj.printJunior(lavedListee);
    }

}
