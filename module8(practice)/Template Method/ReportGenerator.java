public abstract class ReportGenerator {

    public final void generateReport() {
        prepareData();
        formatReport();
        if (customerWantsSave()) {
            saveReport();
        } else {
            sendReportByEmail();
        }
    }

    protected abstract void prepareData();

    protected abstract void formatReport();

    protected void saveReport() {
        System.out.println("Saved");
    }
    protected void sendReportByEmail() {
        System.out.println("Sent");
    }

    protected boolean customerWantsSave() {
        return getUserInput().equalsIgnoreCase("save");
    }

    private String getUserInput() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = "";
        while (!input.equalsIgnoreCase("save") && !input.equalsIgnoreCase("email")) {
            System.out.println("сохранить отчет или отправить по email? ");
            input = scanner.nextLine();
        }
        return input;
    }
}
