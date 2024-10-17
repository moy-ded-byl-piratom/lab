public interface IComputerBuilder {
    void SetCPU();

    void SetRAM();

    void SetSSD();
    void SetGPU();
    void SetOS();

    Computer GetComputer();
}