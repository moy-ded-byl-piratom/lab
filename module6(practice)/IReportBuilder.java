public interface IReportBuilder {
    void SetHeader(String header);
    void SetContent(String content);
    void SetFooter(String footer);
    void AddSection(String sectionName, String sectionContent);
    void SetStyle(ReportStyle style);
    Report GetReport();
}
