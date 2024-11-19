import java.util.ArrayList;

public class Set {
    public ArrayList<String> SetAndGet(String MChoice, Integer CChoice) {
        ArrayList<String> choice = new ArrayList<>();
        Me me = new Me();
        Com com = new Com();

        me.setMe(MChoice);
        com.setCom(CChoice);

        choice.add(me.getMe());
        choice.add(String.valueOf(com.getCom()));

        return choice;
    }
}
