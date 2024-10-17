public class ReportDirector {
    public void ConstructReport(IReportBuilder builder, ReportStyle style) {
        builder.SetStyle(style);
        builder.SetHeader("Annual Report");
        builder.SetContent("This is the content of the annual report.");
        builder.AddSection("Introduction", "This section introduces the report.");
        builder.AddSection("Conclusion", "This section concludes the report.");
        builder.SetFooter("Report Footer");
    }
}
