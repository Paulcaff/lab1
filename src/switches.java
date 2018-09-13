import javax.swing.*;

public class switches {

    public static void main(String[] args) {
         float results= doCalc();

         JOptionPane.showMessageDialog(null, results);

    }
      private static float  doCalc(){

        char choice ;
        float num1, num2;

        choice = JOptionPane.showInputDialog(null, "Please enter your choice of addition  subtraction \nmultiplication or division by entering A S M or D \nas well as the numbers" ).charAt(0);
        num1 =Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter the first number"));
        num2 =Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter the second number"));

        switch(choice){

            case 'A':
               return num1 + num2;


            case 'S':
                return  num1 - num2;

            case 'M':
                return  num1 * num2;

            case 'D':
                return num1 / num2;

            default:
                return 0;

        }

    }
}
