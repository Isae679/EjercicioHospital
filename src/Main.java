import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        //Ciudad
        Ciudad sucre = new Ciudad("MVR34","Sucre");
        Ciudad cochabamba = new Ciudad("AZE45","Cochabamba");
        Ciudad laPaz = new Ciudad("AHYRTO23P","La paz");


        System.out.println(sucre);
        System.out.println(cochabamba);
        System.out.println(laPaz);

        //medico
        Medico gabriel = new Medico("SWWEQRWER","Rene Gagriel","vasquez","peres","1345678", Calendar.getInstance().getTime() );
        System.out.println(gabriel);
    }
}
