import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип документа (Report-1, Resume-2, Letter-3, Invoice-4)");
        int documentType = scanner.nextInt();

        DocumentCreator creator = getDocumentCreator(documentType);
        Document document = creator.CreateDocument();
        document.Open();
    }

    private static DocumentCreator getDocumentCreator(int type) {
        switch (type) {
            case 1:
                return new ReportCreator();
            case 2:
                return new ResumeCreator();
            case 3:
                return new LetterCreator();
            case 4:
                return new InvoiceCreator();
            default:
                return null;
        }
    }
}
