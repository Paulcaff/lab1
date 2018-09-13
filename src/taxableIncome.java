import javax.swing.*;

public class taxableIncome {

    public static void main(String[] args) {
        details();
    }

        private static void details(){
            String name;
            float income;

            name= JOptionPane.showInputDialog(null,"Please enter your name: ");
            income=Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter your Taxable Income"));

            JOptionPane.showMessageDialog(null,"Your name is: "+name+ "The amount of Tax to be paid is"+ taxation(income));
        }

        private static float taxation(float income){

            float tax;
            final float RATE1 = 0.2f, RATE2 = 0.41f;

            if(income <= 20000){
                tax = 0;
            }
            else if (income >= 36000){

                tax = (income - 20000) * RATE1;
            }

            else{
                tax = ((36000 - 20000) * 0.2f) + ((income - 36000) * RATE2);
            }

            return tax;
        }

    }

