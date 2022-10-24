import java.util.ArrayList;
import java.util.Arrays;

public class getNames implements Name{

    @Override
    public ArrayList<String> getNames() {
        String[] names = {"Bela", "Geza"};
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        return nameList;
    }
    
}
