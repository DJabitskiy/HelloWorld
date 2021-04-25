package src;

public class car {
   String color;
   float weight, carlong, height;

   public void start() {
      System.out.println("Мотор завелся!");
   }

   public void stop() {
      System.out.println("Мотор остановлен!");
   }

   public String drive(int howlong) {
      String distance;
      howlong = howlong * 60;
      distance = "автомобиль проехал " + howlong;
      return distance;
   }

}
