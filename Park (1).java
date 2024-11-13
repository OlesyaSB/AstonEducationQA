
public class Park   { 
    private Attraction[] attractionArray;
    private int numAttraction;
    
    public Park(int num) {
        attractionArray = new Attraction[num];
        numAttraction = 0;
    }
    public void plusAttraction(Attraction attraction) {
        if (numAttraction < attractionArray.length) {
            attractionArray[numAttraction] = attraction;
            numAttraction ++;
        }
    }
    public void infoAttraction() {
        for (Attraction attraction:  attractionArray) {
            if (attraction != null) {
                attraction.info();
            }
        }
    }
    public static class Attraction {
        private String name;
        private String duringWork;
        private double price;    
     
        public Attraction (String _name,  String _duringWork,  double _price) {
          name = _name;
          duringWork = _duringWork;
          price = _price;
        }
    
        public void info() {
          System.out.println("Name:  " + name);
          System.out.println("DuringWork:  " + duringWork);
          System.out.println("Price:  " + price);
        }
    
    }
public static void main(String args[]) {
    Park park = new Park(10);
    Park.Attraction attraction_1 = new Park.Attraction("Камикадзе",  "с 10-00 до 23-00",  100);
    park.plusAttraction(attraction_1);
    Park.Attraction attraction_2 = new Park.Attraction("Орбита",  "с 10-00 до 23-00",  100);
    park.plusAttraction(attraction_2);
    
    park.infoAttraction();
    
}    
 
}
