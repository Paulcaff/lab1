import javax.swing.*;

public class numberCount {

    public static void main(String[] args) {
    entries();
    }

    private static void entries(){

          int entry, counter=0, total=0;
        String input;

        input= JOptionPane.showInputDialog(null,"please enter a number (positive or negative) or q to quit: ");

        while(!input.equals("q")){

            entry = Integer.parseInt(input);

            total = total + entry;

           counter ++;

            input= JOptionPane.showInputDialog(null,"please enter a number (positive or negative) or q to quit: ");

        }

            JOptionPane.showMessageDialog(null, "the results were as follows...\n"+"end total: "+total+"\nThe number of entries: "+counter);

    }
}
