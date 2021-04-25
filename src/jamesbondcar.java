package src;

public class jamesbondcar extends car {
   public String drive(int howlong) {
      String distance;
      howlong = howlong * 180;
      distance = "автомобиль проехал " + howlong;
      return distance;
   }
}
