import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);

        System.out.println("""
                                     _ _.-'`-._ _                \s
                                    ;.'___$$___'.;               \s
                         _________n.[____________].n_________    \s
                        |""_""_""_""||==||==||==||""_""_""_""]   \s
                        |""\"""\"""\"""||..||..||..||""\"""\"""\"""|   \s
                        |LI LI LI LI||LI||LI||LI||LI LI LI LI|   \s
                        |.. .. .. ..||..||..||..||.. .. .. ..|   \s
                        |LI LI LI LI||LI||LI||LI||LI LI LI LI|   \s
                     ,,;;,;;;,;;;,;;;,;;;,;;;,;;;,;;,;;;,;;;,;;,,\s
                    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
                
                  Greetings, I am Oracle, your personal banking assistant.
                I'm here to assist you every step to create your bank account.
                """);

        System.out.println("""
                ||====================================================================||
                                        PRESS ENTER TO CONTINUE
                ||====================================================================||
                """);
        write.nextLine();

        ContaTerminal terminal = new ContaTerminal();

        terminal.setClientName();
        terminal.setAccountNumber();
        terminal.setBankBranchId();
        terminal.setOperationBank();
        terminal.setBalanceValue();


        System.out.println("""
                    ||====================================================================||
                                           Account Summary
                    ||====================================================================||
                           Name: %s
                           Account Number: %d
                           Branch ID: %d-%d
                           Balance: %.2f
                    ||====================================================================||
                    """.formatted(terminal.getClientName(), terminal.getAccountNumber(), terminal.getBankBranchId(),
                terminal.getBankOperation(), terminal.getBalanceValue()));

    }
}