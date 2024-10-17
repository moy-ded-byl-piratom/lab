public class Computer {
    public String CPU;
    public int RAM;
    public int SSD;
    public String GPU;
    public String OS;
    public String Storage;
    @Override
    public String toString() {
        return String.format("Компьютер: CPU - %s, RAM - %s, Накопитель - %s, GPU - %s, ОС - %s",
                CPU, RAM, Storage, GPU, OS);
    }

}
