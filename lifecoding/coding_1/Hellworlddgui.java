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
		                frame.setPreferredSize(new Dimension(800, 600)); //â�� x��(800) , y��(600)
		                JLabel label = new JLabel("Hello World!!", SwingConstants.CENTER); //Hello World�� ���ڿ� ���� ��ġ
		                frame.getContentPane().add(label);
		                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		                frame.setLocation(dim.width/2-500/2, dim.height/2-1500/2); // â�� �ߴ� ó�� ��ġ ����

		                frame.pack();
		                frame.setVisible(true);
		            }
		        });
		    }
	}
