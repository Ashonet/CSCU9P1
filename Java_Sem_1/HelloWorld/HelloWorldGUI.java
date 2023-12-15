import javax.swing.JOptionPane;
public class HelloWorldGUI
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        String who = JOptionPane.showInputDialog(null, "Hello " +name+ "! Here is a joke! Knock Knock!");
        String cheese = JOptionPane.showInputDialog(null, "Cheese!");
        JOptionPane.showMessageDialog(null, "Cheese a jolly good fellow!");
        
    }
}
