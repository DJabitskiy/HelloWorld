package src;

public class CarOwner {
   public static void main(String[] args) {
      String distantresponse;
      int time = 123;
      car mycar = new car();
      mycar.start();
      distantresponse = mycar.drive(time);
      System.out.println(distantresponse);
      mycar.stop();
      jamesbondcar jamescar = new jamesbondcar();
      jamescar.start();
      distantresponse = jamescar.drive(time);
      System.out.println(distantresponse);
      jamescar.stop();
   }
}