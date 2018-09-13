import javax.swing.*;

public class SponsoredCycle {

    public static void main(String[] args) {

        details();


    }


    private static void details() {
        String firstname, initial, surname;
        float kilometres ;

        firstname = JOptionPane.showInputDialog(null, "Please enter your firstname here: ");
        initial = JOptionPane.showInputDialog(null, "Please enter your initial here: ");
        surname = JOptionPane.showInputDialog(null, "Please enter your surname here: ");
        kilometres= Float.parseFloat(JOptionPane.showInputDialog(null,"How many kilometres did you cycle: "));

        JOptionPane.showMessageDialog(null,"First Name:"+firstname+"\nInitial: "+initial+"\nSurname:"+surname+"\nThe amount raised is: "+priceCalculation(kilometres));

    }
    private static float priceCalculation(float kilometres){

        float donation ;

        if(kilometres <= 10 && kilometres>0) {
            donation = kilometres * 0.07f;
        }
            else  {
            donation = ((kilometres - 10) * 0.1f) + 0.7f;
        }


        return donation;

    }

}