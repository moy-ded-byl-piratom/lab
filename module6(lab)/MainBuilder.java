public class MainBuilder {
    public static void main(String[] args) {
        IComputerBuilder officeBuilder = new OfficeComputerBuilder();
        Director director = new Director(officeBuilder);
        director.ConstructPc();
        Computer  officeComputer = director.BuildPc();
        System.out.println(officeComputer);

        IComputerBuilder gamingBuilder = new GamingComputerBuilder();
        director = new Director(gamingBuilder);
        director.ConstructPc();
        Computer  gamingComputer = director.BuildPc();
        System.out.println(gamingComputer);
    }
}
