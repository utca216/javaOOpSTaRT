// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Computer myComputer = new Computer();
        myComputer.brand="Fuji";
        myComputer.displayInfo();
        myComputer.changePassword("abobus", "bobus");

        Computer FeruzComputer = new Computer("MSI", 22, 1024, "sosososos");

        Computer EmirComputer = new Computer();
        EmirComputer.brand="macBoook";
        EmirComputer.HDD=10;
        EmirComputer.RAM=10;
        EmirComputer.password="12345678";


        myComputer.displayInfo();
        FeruzComputer.displayInfo();
        EmirComputer.displayInfo();
        }

    }