import javax.swing.*;

public class SponsoredCycle {

    public static void main(String[] args) {

        details();


    }


    public static void details() {
        String firstname, initial, surname;
        double kilometres = 0;

        firstname = JOptionPane.showInputDialog(null, "Please enter your firstname here: ");
        initial = JOptionPane.showInputDialog(null, "Please enter your initial here: ");
        surname = JOptionPane.showInputDialog(null, "Please enter your surname here: ");
        kilometres= Double.parseDouble(JOptionPane.showInputDialog(null,"How many kilometres did you cycle: "));

        JOptionPane.showMessageDialog(null,"First Name:"+firstname+"\nInitial: "+initial+"\nSurname:"+surname+"\nThe amount raised is: "+String.format("%.2f",priceCalculation(kilometres)));

    }
    public static double priceCalculation(double kilometres){

        double donation = 0;

        if(kilometres <= 10 && kilometres>0) {
            donation = kilometres * 0.07;
        }
            else  {
            donation = ((kilometres - 10) * 0.1) + 0.7;
        }


        return donation;

    }

}