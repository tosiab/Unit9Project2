import java.util.*;
public class Menu extends Dunkin{
    private ArrayList <String> items = new ArrayList <String>();
    private String special;
    public Menu(){
        super();
        special = null;
    }
    public Menu(String l, boolean s, double r, String n, String p, String sp){
        super(l, s, r, n, p);
        special = sp;
    }
    public String getSpecial(){
        return special;
    }
    public void setSpecial(String s){
        special = s;
    }
    public void addItem(String i){
        items.add(i);
    }
    public void listItems(){
        for(int i  = 0; i < items.size(); i++){
            System.out.println(items.get(i));
        }
    }
    public int getMenuSize(){
        return items.size();
    }
    public boolean available(String t){
        boolean b = false;
        for(int i = 0; i < items.size(); i++){
            if(t.equals(items.get(i))){
                b = true;
            }
        }
        return b;
    }
    public String storeInfo(){
        return super.storeInfo() + "\nMenu Items: " + items;
    }
    public String toString(){
        return super.toString() + " Dunkin also serves a variety of menu items. Today's special is "+ special + ".";
    }
    public boolean equals(Menu m){
        if(!super.equals(m)){
            return false;
        }
        if(this == m){
            return true;
        }
        if(m == null || getClass() != m.getClass()){
            return false;
        }
        Menu menu = (Menu) m;
        return Objects.equals(items, menu.items) && Objects.equals(special, menu.special);
    }

    
}
