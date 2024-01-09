package subtask2;

public class Main {
    public static void main(String[] args) {
        Ultrabook ultrabook = new Ultrabook("intel cora2duba", "2gb", "uhd graphics",
                "500gb", "win7", "fullhd", 2000, 1.35);
        System.out.println(ultrabook.showInfo());

        Workstation workstation = new Workstation("intel core2quad", "4gb", "geforce 9800gtx",
                "1tb", "win7", "fullhd", 6000, 5.35);
        System.out.println(workstation.showInfo());
    }
}
