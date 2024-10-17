public class Director {
    private IComputerBuilder pc;

    public Director(IComputerBuilder pc) {
        this.pc = pc;
    }

    public void ConstructPc() {
        pc.SetCPU();
        pc.SetRAM();
        pc.SetSSD();
        pc.SetGPU();
        pc.SetOS();
    }

    public Computer BuildPc() {
        return pc.GetComputer();
    }
}