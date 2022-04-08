import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
    private static List<List<String>> allUsers = new ArrayList<>();

    static int id =-1;
    private String userName ="";
    private String password ="";
    private boolean active = true;
    private boolean signedIn = false;

    //String s1=Boolean.toString(b1);       //b1 is boolean
    //boolean b1=Boolean.parseBoolean(s1);  //s1 is string
    //int num =String.valueOf(int1)
    //Integer.valueOf() and Integer.parseInt()


    public User() {
    }

    public User(String userName, String password, boolean active, boolean signedIn) {
        id++;
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.signedIn = signedIn;
        //this.id++;

        List<String> user = new ArrayList<>(Arrays.asList(String.valueOf(id),userName,password,Boolean.toString(active),Boolean.toString(signedIn)));
        System.out.println(user);

        allUsers.add(user);
        //System.out.println(allUsers);


    }



    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    public void kullaniciListesiYazdir() {
        System.out.println(allUsers);
    }


}
