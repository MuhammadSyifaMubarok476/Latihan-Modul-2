import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> Hewan = new LinkedList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Unta");
        Hewan.add("Domba");
        System.out.println("Hewan: " + Hewan);
        LinkedList<String> DeleteHewan = new LinkedList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");
        System.out.println("Hewan yang dihapus: " + DeleteHewan);

        Hewan.removeAll(DeleteHewan);
        System.out.println("Output Hewan : " + Hewan);
    }
}