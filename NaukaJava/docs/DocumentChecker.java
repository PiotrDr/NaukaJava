package docs;

public class DocumentChecker {
    public static void main(String[] args) {
        Document pdfDocument = new PdfDocument();
        Document excelDocument = new ExcelDocument();

        pdfDocument.getDescription();
        excelDocument.getDescription();
    }
}
