public class Main {
    public static void main(String[] args) {
        Code codefiscal=new Code("Mario","Rossi", "01/01/2001");
        System.out.println(codefiscal.getName());
        System.out.println(codefiscal.getSurname());
        System.out.println(codefiscal.dateOfbirth2("01/01/2001"));
        System.out.println("Il codice fiscale semplificato è:\n"+codefiscal.calculation("Mario","Rossi", "01//01/2001"));

    }
}
