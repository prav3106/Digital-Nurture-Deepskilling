package Exercise1;
public class Main {
  public static void main(String args[]){
    Logger logger1 = Logger.getInstance();
    Logger logger2 = Logger.getInstance();
    logger1.log("Gommakoodhi");
    System.out.println(logger1 == logger2);
  }
}
