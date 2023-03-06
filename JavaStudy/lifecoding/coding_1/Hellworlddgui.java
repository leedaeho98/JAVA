package coding_1;
import javax.swing.*;   
import java.awt.Dimension;
import java.awt.Toolkit;

public class Hellworlddgui {
	public static void main(String[] args) {
		        javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		                JFrame frame = new JFrame("HelloWorld GUI");
		                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                frame.setPreferredSize(new Dimension(800, 600)); //창의 x축(800) , y축(600)
		                JLabel label = new JLabel("Hello World!!", SwingConstants.CENTER); //Hello World의 글자와 글자 위치
		                frame.getContentPane().add(label);
		                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		                frame.setLocation(dim.width/2-500/2, dim.height/2-1500/2); // 창이 뜨는 처음 위치 지정

		                frame.pack();
		                frame.setVisible(true);
		            }
		        });
		    }
	}
