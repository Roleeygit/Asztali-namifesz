import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Készitette: Juhász Roland Szoft II N 2022-10-24");
        getNames getNames = new getNames();
        ArrayList<String> nameList = getNames.getNames();
        for (String name: nameList) {
            System.out.println(name);
        }
    }
}
