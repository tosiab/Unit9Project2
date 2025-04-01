import java.util.*;
public class Dunkin{
    private String location;
    private boolean staffed;
    private double rating;
    private String name;
    private String phoneNumber;
    private ArrayList<Double> ratings = new ArrayList<Double>();
    public Dunkin(){
        location = null;
        staffed = false;
        rating = 0.0;
        name  = null;
        phoneNumber = null;
    }
    public Dunkin(String l, boolean s, double r, String n, String p){
        location = l;
        staffed = s;
        rating = r; 
        name = n;
        phoneNumber = p;
    }
    public String getLocation(){
        return location;
    }
    public boolean getStaffed(){
        return staffed;
    }
    public double getRating(){
        return rating;
    }
    public String getName(){
        return name;
    }
    public String getNumber(){
        return phoneNumber;
    }
    public void staffStore(){
        staffed = true;
    }
    public void changeRating(double r){
        rating = r;
    }
    public String toString(){
        return "Dunkin "+ name + ", is a Dunkin Donuts located in "+ location + ". The store has a rating of "+ rating + ". You can reach them at " + phoneNumber + ".";  
    }
    public boolean equals(Dunkin d){
        if(this == d){
            return true;
        }
        if(d == null || getClass() != d.getClass()){
            return false;
        }
        Dunkin dunkin = (Dunkin) d;
        return Double.compare(dunkin.rating, rating) == 0 && staffed == dunkin.staffed && location.equals(dunkin.location) && name.equals(dunkin.name) && phoneNumber.equals(dunkin.phoneNumber);
    }
    public String storeInfo(){
        return "Store Name: "+ name + "\nLocation: "+ location + "\nPhone Number: "+ phoneNumber;
    }
    public void rateStore(double r){
        ratings.add(r);
    }
    public double averageRating(){
        double ave = 0;
        for(double r: ratings){
            ave += r;
        }
        ave = ave/ ratings.size();
        return ave;
    }
}