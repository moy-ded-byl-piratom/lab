public class OfficeComputerBuilder implements IComputerBuilder{

    private Computer hp = new Computer();
    @Override
    public void SetCPU() {
        hp.CPU = "intel i3";
    }

    @Override
    public void SetRAM() {
        hp.RAM=8;
    }
    public void SetSSD() {
        hp.SSD=256;
    }
    public void SetGPU() {
        hp.GPU = "Integrated";
    }
    public void SetOS() {
        hp.OS = "Windows 10";
    }

    @Override
    public Computer GetComputer() {
        return hp;
    }
}
