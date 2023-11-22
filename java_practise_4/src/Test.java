
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Test extends JFrame {
    public static int countMilan = 0;
    public static int countMadrid = 0;
    private JButton button = new JButton("AC Milan");
    private JButton button2 = new JButton("Real Madrid");
    private JLabel labelResult = new JLabel("Result: " + countMilan + " X " + countMadrid);
    private JLabel labelScore = new JLabel("Last Scorer: N/A");
    private Label label = new Label("Winner: DRAW");

    Test() {
        super("Example");
        setLayout(null);
        setSize(630, 500);
        labelScore.setBounds(265, 15, 150, 10); // Устанавливаем размер лейбла и его расположение
        labelResult.setBounds(265, 45, 150, 10);
        label.setBounds(265, 75, 150, 10);
        button.setBounds(10, 10, 110, 100); //Ставим кнопку 1 на эти координаты
        button2.setBounds(500, 10, 110, 100); //Ставим кнопку 2 на эти координаты
        add(label);
        add(button);
        add(button2);
        add(labelResult);
        add(labelScore);

        button.addActionListener(new ActionListener() { //Кликер
            public void actionPerformed(ActionEvent e) {
                countMilan++;
                labelScore.setText("Last scorer: AC Milan");
                labelResult.setText("Result: " + countMilan + " X " + countMadrid);
                if(countMadrid>countMilan)  //Cчёт
                    label.setText("Winner: Real Madrid");
                else if (countMilan == countMadrid)
                    label.setText("AC Milan = Real Madrid");
                else {
                    label.setText("Winner: AC Milan");
                    labelScore.setText("Last scorer: AC Milan");
                }
            }
        });
        button2.addActionListener(new ActionListener() { //Кликер 2
            public void actionPerformed(ActionEvent e) {
                countMadrid++;
                labelScore.setText("Last scorer: Real Madrid");
                labelResult.setText("Result: " + countMilan + " X " + countMadrid);
                if(countMadrid>countMilan) //Cчёт
                    label.setText("Winner: Real Madrid");
                else if (countMilan == countMadrid)
                    label.setText("AC Milan = Real Madrid");
                else
                    label.setText("Winner: AC Milan");
            }
        });


        setVisible(true);
    }


    public static void main(String[] args){
        new Test();
    }
}