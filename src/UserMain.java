import java.util.Scanner;

public class UserMain {

    //static String password ="";
    //static String userName ="";
    static Scanner scan = new Scanner(System.in);
    static int id =-1;
    static int counter =0;
    public static void main(String[] args) {

        // kullanıcı ismini ve passwordu alıp




        kullaniciKayit();




    }

    private static void kullaniciKayit() {
        String userName ="";
        String password ="";

        System.out.println("Lütfen Kullanıcı Adı giriniz");
        userName = scan.next();

        do {
            System.out.println("Lütfen en az 6 haneli bir şifre giriniz");
            password = scan.next();

        }while (password.length() <6);

        listeEkle(userName,password);
    }

    private static void listeEkle(String userName, String password) {


        User obj1 = new User(userName,password,true,false);



      String secim ="";
        do {
            System.out.println("Baska kullanıcı eklemek istermisiniz? E/H");
            secim = scan.next();
            if(secim.equalsIgnoreCase("e")){
                kullaniciKayit();
                break;
            }else if(secim.equalsIgnoreCase("h")) break;
        }while (!secim.equalsIgnoreCase("e") && !secim.equalsIgnoreCase("h"));



        counter++;

        if (counter==1) obj1.kullaniciListesiYazdir();

    }
}
