package Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

     public Window(){
        setVisible(true);
        setLocation(800,400);
        setSize(400,200);
        setTitle("Окно кнопок");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1,2));

        JButton btn1 = new JButton("Свернуть");
        JButton btn2 = new JButton("Выход");

        btn1.setBackground(Color.green);
        btn2.setBackground(Color.CYAN);

        panel.add(btn1);
        panel.add(btn2);

        add(panel, BorderLayout.SOUTH);

        ActionListener closeActionListener = new CloseActionListener();

        //Не смог придумать как в отдельный класс запихнуть действие сворачивания окна по кнопке, не уткнувщись в статик контекст...
        ActionListener hideActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               setState(Frame.ICONIFIED);
            }
        };

        btn1.addActionListener(hideActionListener);
        btn2.addActionListener(closeActionListener);

    }
}
