package Exercise2;
public class PdfDocumentFactory extends DocumentFactory{
  public PdfDocument createDocument(){
    return new PdfDocument();
  }
}
