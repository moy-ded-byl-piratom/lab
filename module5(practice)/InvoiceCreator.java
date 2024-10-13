public class InvoiceCreator implements DocumentCreator{
    @Override
    public Document CreateDocument() {
        return new Invoice();
    }
}
