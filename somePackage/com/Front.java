package somePackage.com;



import javax.swing.JButton;
import javax.swing.JFrame;

public class Front extends JFrame {
	
	JButton button = new JButton("Button");
	JButton button2 = new JButton("Don't press it");
	
	public Front(){
		
		button.addActionListener(e -> {
			System.out.println("U pressed the button");
			System.out.println("Next");
			});
		button.setBounds(100, 100, 200, 100);
		
		button2.addActionListener(e -> System.out.println("U'r dead"));
		button2.setBounds(100, 200, 200, 100);
		this.add(button);
		this.add(button2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.setVisible(true);
	}

}
