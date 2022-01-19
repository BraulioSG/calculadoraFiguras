import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame implements ActionListener{

    public Frame(int width, int height){
	setSize(width, height);
	setResizable(false);
	pack()
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private initComponents(){
    }

    @Override
    public void actionPerformed(ActionEvent e){
    }
}
