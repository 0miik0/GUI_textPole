import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class demoPole extends JFrame{
    private JTextField txtCislo;
    private JButton button;
    private JTextArea textArea;
    private JButton kopiruj;
    private JPanel panelMain;

    public demoPole(){
        Random generator = new Random();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nahodne = generator.nextInt(100);
                txtCislo.setText("" + nahodne);
            }
        });

        kopiruj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String output = txtCislo.getText();
                textArea.append(output + "\n");
            }
        });
    }

    public static void main(String[] args) {
        demoPole demo = new demoPole();
        demo.setContentPane(demo.panelMain);
        demo.setVisible(true);
        demo.setSize(400, 300);
        demo.setTitle("Test práce s tlačítky");
        demo.textArea.setEditable(false);
    }
}
