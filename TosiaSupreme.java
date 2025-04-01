import java.util.*;
public class TosiaSupreme extends Menu{
    private String description;
    private double price;
    private ArrayList<TosiaSupreme> food = new ArrayList <TosiaSupreme>();
    public TosiaSupreme(){
        super();
        description = null;
        price = 0.0;
    }
    public TosiaSupreme(String l, boolean s, double r, String n, String p, String sp, String d, double pr){
        super(l, s, r, n, p, sp);
        description = d;
        price = pr;
    }
    public String getDesc(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double p){
        price = p;
    }
    public void addSupreme(TosiaSupreme p){
        food.add(p);
    }
    public void listSupremes(){
        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
    }
    public String toString(){
        return super.toString() + " One popular menu item is the Tosia Supreme. " + description + " It costs " + price + "dollars.";
    }
    public boolean equals(TosiaSupreme t){
        if(this == t){
            return true;
        }
        if(!super.equals(t)){
            return false;
        }
        if(getClass() != t.getClass()){
            return false;
        }
        TosiaSupreme ts = (TosiaSupreme) t;
        return Double.compare(ts.price, price) == 0 && description.equals(ts.description);
    }
    public String storeInfo(){
        return super.storeInfo() + "\nTosia Supreme: " + description + "\n\t" + price;
    }
    public double totalPrice(){
        int p = 0;
        for(int i = 0; i < food.size(); i++){
            p += food.get(i).getPrice();
        }
        return p;
    }
    public double totalCalories(){
        double c = 0.0;
        int s = food.size();
        c = 150 * s;
        return c;
    }
}
