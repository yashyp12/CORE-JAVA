
import java.util.Scanner;

public class evm {

    static int bjp, cong, shivsena, noa;
    static int totalVoting;

    public static void main(String[] args) {
        // bjp , congres , shivsena 
        System.out.println("enter your population");
        Scanner scanner = new Scanner(System.in);
        int population = scanner.nextInt();

        for (int i = 1; i <= population; i++) {

            System.out.println("Welcome into EVM VOTING MACHINE ");
            System.out.println("1.bjp,2.Congress , 3.Shivsena , 4.noa ");
            int user = scanner.nextInt();
            if (user < 1 || user > 4) {
                System.out.println("invalid value entered");
                continue;
            }

            switch (user) {

                case 1: {
                    System.out.println("BHAJAP SARKAR");
                    bjp++;
                    totalVoting++;
                    break;
                }

                case 2: {
                    System.out.println("congress sarkar");
                    cong++;
                    totalVoting++;
                    break;
                }

                case 3: {
                    System.out.println("shivsena sarkar");
                    shivsena++;
                    totalVoting++;
                    break;
                }

                case 4: {
                    System.out.println("you are educated ! :)");
                    noa++;
                    totalVoting++;
                    break;
                }

                default: {
                    System.out.println("invalid input entered");
                    i--;
                    continue;
                }
                }
                        }
                    }
                }
  