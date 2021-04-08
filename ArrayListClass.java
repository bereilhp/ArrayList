import java.util.ArrayList;

public class ArrayListClass {

  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add("Ferrari");
    cars.add("Mini");
    cars.add("Bugatti");
    cars.add("Audi");
    //cars.add("");
    System.out.println(cars);
    cars.remove(0);
    System.out.println(cars);
  
  }
}
