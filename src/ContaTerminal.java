import java.util.Scanner;

public class ContaTerminal {
    public void openAccount() {
        Scanner write = new Scanner(System.in);

        System.out.println("""
               ||====================================================================||
                                       PRESS ENTER TO CONTINUE
               ||====================================================================||
                """);
        write.nextLine();
        write.close();


    }
}
