import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class project {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Калькулятор");
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    frame.add(panel);

    JTextField textField = new JTextField();

    JButton btnClear = new JButton();
    JButton btnAllClear = new JButton();
    JButton btnComa = new JButton();

    btnClear.setText("<-");
    btnAllClear.setText("C");
    btnComa.setText(",");

    // Арифметичні операції
    JButton btnPlus = new JButton();
    JButton btnMinus = new JButton();
    JButton btnMultiply = new JButton();
    JButton btnDivision = new JButton();
    JButton btnInterest = new JButton();
    JButton btnEquals = new JButton();

    btnPlus.setText("+");
    btnMinus.setText("-");
    btnMultiply.setText("*");
    btnDivision.setText("/");
    btnInterest.setText("%");
    btnEquals.setText("=");

    // Числа
    JButton btnZero = new JButton();
    JButton btnOne = new JButton();
    JButton btnTwo = new JButton();
    JButton btnThree = new JButton();
    JButton btnFour = new JButton();
    JButton btnFive = new JButton();
    JButton btnSix = new JButton();
    JButton btnSeven = new JButton();
    JButton btnEight = new JButton();
    JButton btnNine = new JButton();

    btnZero.setText("0");
    btnOne.setText("1");
    btnTwo.setText("2");
    btnThree.setText("3");
    btnFour.setText("4");
    btnFive.setText("5");
    btnSix.setText("6");
    btnSeven.setText("7");
    btnEight.setText("8");
    btnNine.setText("9");

    panel.add(btnClear);
    panel.add(btnAllClear);
    panel.add(btnComa);

    panel.add(textField);
    panel.add(btnZero);
    panel.add(btnOne);
    panel.add(btnTwo);
    panel.add(btnThree);
    panel.add(btnFour);
    panel.add(btnFive);
    panel.add(btnSix);
    panel.add(btnSeven);
    panel.add(btnEight);
    panel.add(btnNine);

    panel.add(btnPlus);
    panel.add(btnMinus);
    panel.add(btnMultiply);
    panel.add(btnDivision);
    panel.add(btnInterest);
    panel.add(btnEquals);

    panel.setLayout(null);

    textField.setBounds (0, 0, 200,100);

    btnAllClear.setBounds (0,   100, 50, 50);
    btnClear.setBounds    (50,  100, 50, 50);
    btnInterest.setBounds (100, 100, 50, 50);
    btnDivision.setBounds (150, 100, 50, 50);

    btnSeven.setBounds    (0,   150, 50, 50);
    btnEight.setBounds    (50,  150, 50, 50);
    btnNine.setBounds     (100, 150, 50, 50);
    btnMultiply.setBounds (150, 150, 50, 50);

    btnFour.setBounds     (0,   200, 50, 50);
    btnFive.setBounds     (50,  200, 50, 50);
    btnSix.setBounds      (100, 200, 50, 50);
    btnMinus.setBounds    (150, 200, 50, 50);

    btnOne.setBounds      (0,   250, 50, 50);
    btnTwo.setBounds      (50,  250, 50, 50);
    btnThree.setBounds    (100, 250, 50, 50);
    btnPlus.setBounds     (150, 250, 50, 50);

    btnComa.setBounds     (0,   300, 50, 50);
    btnZero.setBounds     (50,  300, 50, 50);
    btnEquals.setBounds   (100, 300, 100, 50);


    frame.setBounds(50, 50, 200, 385);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
