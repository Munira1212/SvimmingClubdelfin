import javax.print.attribute.standard.PagesPerMinute;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public abstract class Svimmingdiciplin {

    private String name;
    private String placering;
    private int time;
    private String diciplin;
    private  int secounds;
    private  int minutes;


    public Svimmingdiciplin(String name,String placering, int time, String diciplin ){
        this.name=name;
        this.placering=placering;
        this.time=time;
        this.diciplin=diciplin;
    }


    public int getTime() {
        return time;
    }

    public String getDiciplin() {
        return diciplin;
    }

    public String getPlacering() {
        return placering;
    }

    public void activ(){

    }
    public int time(){
        return time;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecounds() {
        return secounds;
    }

//En random tid og dato bliver indsat til hver spiller....
    public LocalDate generateOprettelsesår() {

        LocalDate ld = LocalDate.of(2002, Month.JANUARY, 1);
        long days = ChronoUnit.DAYS.between(ld, LocalDate.now());

        LocalDate dato= ld.plusDays(new Random().nextInt((int) days + 1));

        secounds = (int)(Math.random() * 59 + 1);

        minutes = (int)(Math.random() * 59+ 1);

        LocalDateTime lt = dato.atTime(0,getMinutes(),getSecounds());
        System.out.println(lt);





        //System.out.println("you start your subscibtion " +  dato.getDayOfWeek());
        // System.out.println("the " + dato);
        return dato;

    }








}
