import java.util.ArrayList;
import java.util.List;
public class DocumentPrototype implements IPrototype{
    private String title;
    private String content;
    private List<Section> sections = new ArrayList<>();
    public List<Image> images = new ArrayList<>();

    public DocumentPrototype(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public void addImage(Image image) {
        images.add(image);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public IPrototype Clone() {
        DocumentPrototype clonedDocument = new DocumentPrototype(this.title, this.content);
        for (Section section : sections) {
            clonedDocument.addSection((Section) section.Clone());
        }
        for (Image image : images) {
            clonedDocument.addImage((Image) image.Clone());
        }
        return clonedDocument;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Document Title: " + title + "\nContent: " + content + "\n");
        for (Section section : sections) {
            sb.append(section.toString()).append("\n");
        }
        for (Image image : images) {
            sb.append(image.toString()).append("\n");
        }
        return sb.toString();
    }


}
