import javax.swing.JFrame;

public class Frame extends JFrame{

    public Frame(int width, int height){
	setSize(width, height);
	setResizable(false);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
