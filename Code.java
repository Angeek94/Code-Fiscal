import java.text.ParseException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.*;
public class Code {
    private String name;
    private String surname;
    private String dateofbirth;
    public Code(String name, String surname, String dateofbirth){
        this.name=name;
        this.surname=surname;
        this.dateofbirth=dateofbirth;


    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public String dateOfbirth2( String dateofbirth){

        Date d = null;



        try{
            DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
            //imposta che i calcoli di conversione della data siano rigorosi
            formatoData.setLenient(false);
            d = formatoData.parse(dateofbirth);
        } catch (ParseException e) {
            System.out.println("Formato data non valido.");
        }

        return dateofbirth;
    }

    public String calculation(String name3,String surname3,String dateofbirth2){




        return  name3.substring(0,3)+surname3.substring(0,3)+dateofbirth2.substring(8,10);
    }

}
