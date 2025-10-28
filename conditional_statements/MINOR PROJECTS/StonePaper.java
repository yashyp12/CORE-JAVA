////wjp for stone paper scissor which uses math.random method for
//// generating dynamic options
//
//import java.util.*;
//
//class StonePaper {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        //taking input from the user , STONE PAPER SCISSOR
//        // Input stores in string or in loop
//        for (;;) {
//            System.out.println("Welcome to the Game");
//            System.out.println("Select option No 1.Stone 2.Paper 3.Scissor");
//            int userResp = sc.nextInt();
//            String Responce1 = "";
//
//            if (userResp == 1) {
//                Responce1 = "STONE";
//            } else if (userResp == 2) {
//                Responce1 = "PAPER";
//
//            } else if (userResp == 3) {
//                Responce1 = "SCISSOR";
//            } else {
//                System.out.println("invalid response entered");
//                return;
//            }
//
//            //Taking input from the bot
//            int botResp = 0;
//
//            for (;;) {
//                botResp = (int) (Math.random() * 10);
//                if (botResp >= 1 && botResp <= 3) {
//                    break;
//                }
//            }
//
//            String Responce2 = "";
//
//            if (botResp == 1) {
//                Responce2 = "STONE";
//            } else if (botResp == 2) {
//                Responce2 = "PAPER";
//            } else if (botResp == 3) {
//                Responce2 = "SCISSOR";
//            }
//
//            System.out.println("USER          BOT");
//            System.out.println("    " + Responce1 + "  " + Responce2);
//
//            //calculate winner
//            if ((Responce1.equals("PAPER")) && (Responce2.equals("STONE"))
//                    || (Responce1.equals("STONE")) && (Responce2.equals("SCISSOR"))
//                    || (Responce1.equals("SCISSOR")) && (Responce2.equals("PAPER"))) {
//                System.out.println("USER WON");
//
//            } else if ((Responce2.equals("PAPER")) && (Responce1.equals("STONE"))
//                    || (Responce2.equals("STONE")) && (Responce1.equals("SCISSOR"))
//                    || (Responce2.equals("SCISSOR")) && (Responce1.equals("PAPER"))
//                    ) {
//                System.out.println("BOT WON");
//            } else {
//                System.out.println("DRAW MATCH");
//
//            }
//
//        }
//
//    }
//}
