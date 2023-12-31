package SerratedDisc;
public class SerratedDisc{
    /* Attributes */
    private int size;
    private int numberOfPins;
    private static String Company;

    /* Constructors */
    public SerratedDisc(){
        size = 10;
        numberOfPins = 8;
    }
    public SerratedDisc(int size, int numberOfPins){
        this.size = 10;
        this.numberOfPins = 8;
    }


    /* Methods: Setters */
    public static void setCompany(String name){
        Company = name;
    }
    
    public void setSize(int s){
        this.size = s;
    }

    public void setNumberOfPins(int n){
        this.numberOfPins = n;
    }

    /* Methods: Getters */
    public static String getCompany() {
        return Company;
    }

    public int getSize(){
        return size;
    }

    public int getNumberOfPins(){
        return numberOfPins;
    }

    /* Other Methods */
    public void spin(){
        System.out.println("The disc is spinning now.");
        System.out.print("size equal:");
        System.out.println(size);
        System.out.print("pins equal:");
        System.out.println(numberOfPins);
        System.out.print("Company:");
        System.out.println(getCompany());
    }
}