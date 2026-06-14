package Exercise2;
public class Main {
  public static void main(String args[]){
    DocumentFactory pdfFactory = new PdfDocumentFactory();
    Document pdfDocument = pdfFactory.createDocument();
    pdfDocument.open();
    pdfDocument.close();
  }
}
