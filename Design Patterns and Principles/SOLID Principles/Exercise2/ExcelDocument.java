package Exercise2;
public class ExcelDocument implements Document {
  public void open(){
    System.out.println("Opening excel document");
  }
  public void close(){
    System.out.println("Closing excel document");
  }
}
