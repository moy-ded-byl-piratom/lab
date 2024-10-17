import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class PdfReportBuilder implements IReportBuilder {
    private Report report = new Report();

    @Override
    public void SetHeader(String header) {
        report.setHeader(header);
    }

    @Override
    public void SetContent(String content) {
        report.setContent(content);
    }

    @Override
    public void SetFooter(String footer) {
        report.setFooter(footer);
    }

    @Override
    public void AddSection(String sectionName, String sectionContent) {
        report.addSection(sectionName, sectionContent);
    }

    @Override
    public void SetStyle(ReportStyle style) {
        report.setStyle(style);
    }

    @Override
    public Report GetReport() {
        return report;
    }

    public void ExportToPDF(String filePath) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            document.add(new Paragraph(report.getHeader()));
            document.add(new Paragraph(report.getContent()));

            for (Report.Section section : report.getSections()) {
                document.add(new Paragraph(section.getSectionName()));
                document.add(new Paragraph(section.getSectionContent()));
            }

            document.add(new Paragraph(report.getFooter()));
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
