import javax.swing.*;

public class Calculation {


    public static void main(String[] args) {
    details();

    }

    private static void details(){
        String name, classname;
        int snacks ;

        name= JOptionPane.showInputDialog(null,"Please enter your name here: ");
        classname= JOptionPane.showInputDialog(null,"Please enter your classname here: ");
        snacks= Integer.parseInt(JOptionPane.showInputDialog(null,"How many snacks would you like: "));

        JOptionPane.showMessageDialog(null,"Name:"+name+"\nClass: "+classname+"\nThe number of snack you want is: "+snacks+
                                                                    "\nThe final price is: "+PriceCalculation(snacks));
    }

    private static int PriceCalculation(int snacks){

       int finalprice = snacks * 2;

        return finalprice;

    }


}
