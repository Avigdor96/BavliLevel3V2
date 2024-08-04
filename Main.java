package Level3Version2;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bavli bavli = new Bavli();
        bavli.setPath(Methods.createBavliDirctory());
        Methods.createBookAndNames(bavli);
        boolean flag = true;
        while (flag){
            System.out.println("Press 1 for search page: ");
            System.out.println("Press 2 for exit: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    int bookL = Methods.checkValidBook(bavli);
                    int pageL = Methods.checkValidPage(bavli, bookL);
                    File file = new File(bavli.getBooks()[bookL].getPageFathers()[pageL].getPath());
                    Methods.printPage(file);
                    break;
                case 2:
                    flag = false;
                    break;
            }
        }





    }
}
