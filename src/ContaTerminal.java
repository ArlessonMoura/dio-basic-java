import java.util.Scanner;

public class ContaTerminal {
    private String clientName;
    private int accountNumber;
    private int bankBranchId;
    private int bankOperation;
    private double balanceValue;
    private final Scanner write = new Scanner(System.in);

    public String getClientName() {
        return clientName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBankBranchId() {
        return bankBranchId;
    }

    public int getBankOperation() {
        return bankOperation;
    }

    public double getBalanceValue() {
        return balanceValue;
    }

    public void setClientName() {
        boolean nameVerify = false;

        while (!nameVerify) {
            System.out.println("""
               ||====================================================================||
                                        What is your name?
               ||====================================================================||
               """);

            clientName = write.nextLine();
            if (clientName != null && !clientName.isBlank()) {

                System.out.println("""
               ||====================================================================||
                                %s
                                          beautiful name!
               ||====================================================================||
               """.formatted(clientName));
                nameVerify = true;
            } else {
                System.out.println("""
               ||====================================================================||
                                   You need provide a Valid entry.
               ||====================================================================||
                                                ||
               """);
            }

        }

    }

    public void setAccountNumber() {
        boolean accountVerify = false;


        while (!accountVerify) {
            System.out.println("""
               ||====================================================================||
                                  Choose your account number ID
                                           4 numbers.
               ||====================================================================||
               """);

            try {
                String userEntry = write.nextLine().trim();

                if (userEntry.matches("\\d{4}")) {
                    accountNumber = Integer.parseInt(userEntry);
                    System.out.println("""
                       ||====================================================================||
                                                   You choose: %d
                       ||====================================================================||
                       """.formatted(accountNumber));
                    accountVerify = true;
                } else {
                    System.out.println("""
                       ||====================================================================||
                              Invalid input! Please enter exactly 4 numeric digits only.
                       ||====================================================================||
                                                        ||
                       """);
                }

            } catch (NumberFormatException e) {
                System.out.println("""
                   ||====================================================================||
                               Invalid input! Please enter numeric values only.
                   ||====================================================================||
                                                    ||
                   """);
            }

        }
    }

    public void setBankBranchId() {
        Scanner write = new Scanner(System.in);
        boolean bankBranchVerify = false;

        while (!bankBranchVerify) {
            System.out.println("""
               ||====================================================================||
                                  Choose your bank branch number ID
                                           3 numbers.
               ||====================================================================||
               """);

            try {
                String userEntry = write.nextLine().trim();

                if (userEntry.matches("\\d{3}")) {
                    bankBranchId = Integer.parseInt(userEntry);
                    bankBranchVerify = true;
                } else {
                    System.out.println("""
                       ||====================================================================||
                              Invalid input! Please enter exactly 3 numeric digits only.
                       ||====================================================================||
                                                        ||
                       """);
                }

            } catch (NumberFormatException e) {
                System.out.println("""
                   ||====================================================================||
                               Invalid input! Please enter numeric values only.
                   ||====================================================================||
                                                    ||
                   """);
            }

        }
    }

    public void setOperationBank() {
        Scanner write = new Scanner(System.in);
        boolean bankOperationVerify = false;

        while (!bankOperationVerify) {
            System.out.println("""
               ||====================================================================||
                                  Choose your operation bank number ID
                                         Just only 1 numbers.
               ||====================================================================||
               """);

            try {
                String userEntry = write.nextLine().trim();

                if (userEntry.matches("\\d")) {
                    bankOperation = Integer.parseInt(userEntry);
                    bankOperationVerify = true;
                } else {
                    System.out.println("""
                       ||====================================================================||
                              Invalid input! Please enter exactly 1 numeric digits only.
                       ||====================================================================||
                                                        ||
                       """);
                }

            } catch (NumberFormatException e) {
                System.out.println("""
                   ||====================================================================||
                               Invalid input! Please enter numeric values only.
                   ||====================================================================||
                                                    ||
                   """);
            }

        }

    }

    public void setBalanceValue() {
        Scanner write = new Scanner(System.in);
        boolean balanceVerify = false;

        while (!balanceVerify) {
            System.out.println("""
                ||====================================================================||
                                   Choose your bank balance value
                             (This is a peculiar bank, don't you think?)
                ||====================================================================||
            """);

            try {
                balanceValue = write.nextDouble();

                System.out.println("""
                    ||====================================================================||
                                           Is It your best?
                                Is that the greatest number that you can think?
                                            So much humble.
                    ||====================================================================||
                """);

                balanceVerify = true;

            } catch (Exception e) {
                System.out.println("""
                    ||====================================================================||
                            Invalid input! Please enter a numeric value (e.g., 123.45).
                    ||====================================================================||
                                                    ||
                """);
                write.nextLine();
            }
        }

        write.close();
    }



}
