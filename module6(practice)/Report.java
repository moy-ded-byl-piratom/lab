import java.util.ArrayList;
import java.util.List;
public class Report {
    private String header;
    private String content;
    private String footer;
    private ReportStyle style;
    private List<Section> sections = new ArrayList<>();

    public void setHeader(String header) {
        this.header = header;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public void addSection(String sectionName, String sectionContent) {
        sections.add(new Section(sectionName, sectionContent));
    }

    public void setStyle(ReportStyle style) {
        this.style = style;
    }

    public String getHeader() {
        return header;
    }

    public String getContent() {
        return content;
    }

    public String getFooter() {
        return footer;
    }

    public List<Section> getSections() {
        return sections;
    }

    public ReportStyle getStyle() {
        return style;
    }

    public static class Section {
        private String sectionName;
        private String sectionContent;

        public Section(String sectionName, String sectionContent) {
            this.sectionName = sectionName;
            this.sectionContent = sectionContent;
        }

        public String getSectionName() {
            return sectionName;
        }

        public String getSectionContent() {
            return sectionContent;
        }
    }
}
