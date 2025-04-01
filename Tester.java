import java.util.*;
public class Tester {
    public static void main(String[]args){
        ArrayList<Dunkin> DunkinDonuts = new ArrayList<Dunkin>();
        Dunkin d1 = new Dunkin();
        //Dunkin d2 = new Menu();
        Dunkin d2 = new TosiaSupreme();
        Dunkin d3 = new Dunkin("Blauvelt", true, 5.0, "Donuts", "1-845-845-8455");
        Dunkin d4 = new Menu("Blauvelt", true, 5.0, "Donuts", "1-845-845-8455", "Bacon");
        Dunkin d5 = new TosiaSupreme("Blauvelt", true, 5.0, "Donuts", "1-845-845-8455", "Bacon", "The supreme is a flavorful combo.", 25.0);
        //Dunkin d7 = new Dunkin("Nanuet", false, 4.6, "LocoDonuts", "1-917-917-9177");
        //Dunkin d8 = new Menu("Nanuet", false, 4.6, "LocoDonuts", "1-917-917-9177", "Banana Bread");
        //Dunkin d9 = new TosiaSupreme("Nanuet", false, 4.6, "LocoDonuts", "1-917-917-9177", "Banana Bread", "The supreme is the best food ever.", 19.99);
        Dunkin d6 = d1;
        Dunkin d7 = d2;
        Dunkin d8 = d3; 
        Dunkin d9 = d4;
        Dunkin d10 = d5;
        DunkinDonuts.add(d1);
        DunkinDonuts.add(d2);
        DunkinDonuts.add(d3);
        DunkinDonuts.add(d4);
        DunkinDonuts.add(d5);
        DunkinDonuts.add(d6);
        DunkinDonuts.add(d7);
        DunkinDonuts.add(d8);
        DunkinDonuts.add(d9);
        DunkinDonuts.add(d10);
        d3.staffStore();
        d3.getRating();
        d4.storeInfo();

    }
}
