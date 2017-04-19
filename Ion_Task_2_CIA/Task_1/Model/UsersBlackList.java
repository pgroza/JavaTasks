package Ion_Task_2_CIA.Task_1.Model;

import java.util.ArrayList;

/**
 * Created by pgroza on 3/20/2017.
 */
public class UsersBlackList {

    private ArrayList<String> userName;

    UsersBlackList() {
        this.userName.add(new String("Sevastian"));
        this.userName.add(new String("Alexei"));
        this.userName.add(new String("Alexandru"));
        this.userName.add(new String("Stas"));
        this.userName.add(new String("Victoria"));
        this.userName.add(new String("Ion"));
        this.userName.add(new String("Petru"));
        this.userName.add(new String("Mila"));
        this.userName.add(new String("Iunona"));
        this.userName.add(new String("Alex"));
    }

    public void setUserName(ArrayList<String> userName) {
        this.userName = userName;
    }
    public ArrayList<String> getUserName(){
        return userName;
    }
}
