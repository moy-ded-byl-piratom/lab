public class Image implements IPrototype{
    private String url;
    public Image(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public IPrototype Clone() {
        return new Image(this.url);
    }

    @Override
    public String toString() {
        return "Image URL: " + url;
    }
}
