import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

class HomeFrame extends JFrame implements ActionListener{
	JLabel l1;
	JButton b1,b2,b3,b4; 
	
	public HomeFrame(){
		this.setTitle("Convertor");
		this.setBounds(200,100,600,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setResizable(false);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.WHITE);

		l1=new JLabel("Convertor");
		l1.setFont(new Font("Osward",Font.BOLD,28));
		
		b1 = new JButton("Weight Conversion");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);

		b2 = new JButton("Currency Conversion");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);

		b3 = new JButton("Lenght Conversion");
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.addActionListener(this);

		b4 = new JButton("Temperature Conversion");
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);
		b4.addActionListener(this);	

		l1.setBounds(200,100,200,30);
		this.add(l1);

		b1.setBounds(50,150,200,40);
		this.add(b1);

		b2.setBounds(275,150,200,40);
		this.add(b2);	

		b3.setBounds(50,250,200,40);
		this.add(b3);

		b4.setBounds(275,250,200,40);
		this.add(b4);
		
	}

    	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
			System.out.println("Weight Conversion button clicked");
			WeightFrame f1=new WeightFrame();
			//this.setVisible(false);
		}
		if(e.getSource()==b2){
			System.out.println("Currency Conversion button clicked");
			CurrencyFrame c1=new CurrencyFrame();
		}
		if(e.getSource()==b3){
			System.out.println("Lenght Conversion button clicked");
			RadioButton2 rb1=new RadioButton2();
		}
		if(e.getSource()==b4){
			System.out.println("Temperature Conversion button clicked");
			RadioButton rb2=new RadioButton();
			//this.setVisible(false);
		}
    	}
}

class Home{
	public static void main(String args[]){
		new HomeFrame();
	}
}