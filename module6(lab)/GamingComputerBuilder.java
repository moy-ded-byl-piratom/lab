public class GamingComputerBuilder implements IComputerBuilder{
    private Computer asus = new Computer();
    @Override
    public void SetCPU() {
       asus.CPU="intel i9";
    }

    @Override
    public void SetRAM() {
        asus.RAM=32;
    }

    @Override
    public void SetSSD() {
        asus.SSD=1024;
    }

    @Override
    public void SetGPU() {
        asus.GPU="NVIDIA RTX 3090";
    }

    @Override
    public void SetOS() {
        asus.OS="Windows 11";
    }

    @Override
    public Computer GetComputer() {
        return asus;
    }
}
