import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.lang.Math;
class CurrencyFrame extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField tf1,tf2;
	JButton b1,b2,b3;
	String cur[]={"Rupee","US Dollar","Euro","British Pound","Omani Rial"}; 
	JComboBox cb1, cb2;
                 String con, to;
                 double value;     
	
	CurrencyFrame(){
		
		this.setTitle("Currency Conversion");
		this.setBounds(200,100,600,500);
                                   cb1 = new JComboBox(cur);
	                 cb2=new JComboBox(cur);  
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setResizable(false);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.WHITE);

		l1=new JLabel("Currency Conversion");
		l1.setFont(new Font("Osward",Font.BOLD,28));

		l2=new JLabel("Convert:");
		l2.setFont(new Font("Raleway",Font.BOLD,20));

		l3=new JLabel("To:");
		l3.setFont(new Font("Raleway",Font.BOLD,20));

		cb1.setFont(new Font("Raleway",Font.BOLD,15));
		//cb1.setBackground(Color.decode("#708090"));
		cb1.setBackground(Color.BLACK);
		cb1.setForeground(Color.WHITE);
		cb2.setFont(new Font("Raleway",Font.BOLD,15));
		cb2.setBackground(Color.BLACK);
		cb2.setForeground(Color.WHITE);

		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf2.setEnabled(false);

		b1 = new JButton("Convert");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
	
		b2 = new JButton("Clear");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);

		b3 = new JButton("Back");
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.addActionListener(this);

		setLayout(null);
		
		l1.setBounds(100,100,500,50);//x,y,width,length
		this.add(l1);

		l2.setBounds(160,170,100,30);
		this.add(l2);

		l3.setBounds(410,170,100,30);
		this.add(l3);

		cb1.setBounds(50,200,100,30);
		this.add(cb1);
		
		tf1.setBounds(160,200,100,30);
		this.add(tf1);

		cb2.setBounds(300,200,100,30);
		this.add(cb2);
		
		tf2.setBounds(410,200,100,30);
		this.add(tf2);

		b1.setBounds(100,300,100,30);
		this.add(b1);

		b2.setBounds(300,300,100,30);
		this.add(b2);

		//b3.setBounds(25,25,75,30);
		//this.add(b3);

	}
	
    	public void actionPerformed(ActionEvent e) {

                                  try {
                                 double value=Double.parseDouble(tf1.getText()); 
		if(e.getSource()==b1){
			System.out.println("convert button clicked");
			convert(value);
		}
		if(e.getSource()==b2){
			System.out.println("clear button clicked");
			clear();
		}
		/*if(e.getSource()==b3){
			System.out.println("clear button clicked");
			HomeFrame h1=new HomeFrame();
			this.setVisible(false);
		}*/
                                }catch(NumberFormatException ex) {

                                JOptionPane.showMessageDialog(this, ex);    
                                 clear();
                                  } 

    	}
	
	void convert(double value){
                                  try {
		con= ""+cb1.getItemAt(cb1.getSelectedIndex());
		System.out.println(con);

		to= ""+cb2.getItemAt(cb2.getSelectedIndex());
		System.out.println(to);
		
		
		//"Rupee","US Dollar","Euro","British Pound","Omani Rial"
		switch(con){
			case "Rupee" : value=value*1;
			break;

			case "US Dollar" :value=value*74.23;
			break;


			case "Euro" :value=value*87.30;
			break;


			case "British Pound" :value=value*103.00;
			break;


			case "Omani Rial" :value=value*196.95;
			break;
		}
		System.out.println(value);
		switch(to){
			case "Rupee" : value=value/1;
			break;

			case "US Dollar" :value=value/74.23;
			break;


			case "Euro" :value=value/87.30;
			break;


			case "British Pound" :value=value/103.00;
			break;


			case "Omani Rial" :value=value/196.95;
			break;
		}
		System.out.println("converted="+value);
		tf2.setText(String.format("%.2f", value));
                                }catch(NumberFormatException ex) {

                                JOptionPane.showMessageDialog(this, ex);    
                                 clear();
                                  }
		 
	}

	void clear(){
		tf1.setText("");
		tf2.setText("");
	}
}

public class WeightConv2 {
	public static void main(String args[]){
		System.out.println("at start");
		new CurrencyFrame();
	}
}
