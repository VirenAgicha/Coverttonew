import javax.swing.*;
import java.awt.event.*;    
import java.awt.*;

class RadioButton2 extends JFrame implements ActionListener{    
JRadioButton rbb1,rbb2, rbb3, rbb11, rbb22, rbb33;    
JButton buttonn, buttonn2;
JFrame frame;
JTextField textt, textt2;
JLabel labell;
double numberr, cen, met, in;

RadioButton2(){      
rbb1 = new JRadioButton("Centimeters");    
rbb1.setBounds(100,50,100,30);      
rbb2 = new JRadioButton("Meters");    
rbb2.setBounds(100,100,100,30);         
rbb3 = new JRadioButton("Inches");    
rbb3.setBounds(100,150,100,30);

rbb11 = new JRadioButton("Centimeters");    
rbb11.setBounds(350,50,100,30);      
rbb22 = new JRadioButton("Meters");    
rbb22.setBounds(350,100,100,30);         
rbb33 = new JRadioButton("Inches");    
rbb33.setBounds(350,150,100,30);

rbb1.setFont(new Font("Roman",Font.BOLD,12));
rbb2.setFont(new Font("Roman",Font.BOLD,12));
rbb3.setFont(new Font("Roman",Font.BOLD,12));
rbb11.setFont(new Font("Roman",Font.BOLD,12));
rbb22.setFont(new Font("Roman",Font.BOLD,12));
rbb33.setFont(new Font("Roman",Font.BOLD,12));

labell = new JLabel("Length Convertor");
labell.setBounds(180,10,200,30);
labell.setFont(new Font("Roman",Font.BOLD,15));
frame = new JFrame();
textt = new JTextField();
textt2 = new JTextField(); 
textt.setBounds(210,70,100,30);
textt2.setBounds(210,140,100,30); 
textt2.setEnabled(false);
textt.setFont(new Font("Roman",Font.BOLD,20));
textt2.setFont(new Font("Roman",Font.BOLD,20));

buttonn = new JButton("Convert");    
buttonn.setBounds(170,200,80,30);    
buttonn.addActionListener(this);
buttonn.setBackground(Color.BLACK);
buttonn.setForeground(Color.WHITE);

buttonn2 = new JButton("Clear");    
buttonn2.setBounds(260,200,80,30);    
buttonn2.addActionListener(this);
buttonn2.setBackground(Color.BLACK);
buttonn2.setForeground(Color.WHITE);

frame.add(rbb1);
frame.add(rbb2);
frame.add(rbb3);
frame.add(rbb11);
frame.add(rbb22);
frame.add(rbb33);
frame.add(textt);
frame.add(textt2);
frame.add(buttonn);    
frame.add(buttonn2);    
frame.add(labell);
//frame.setSize(300,300);
frame.setBounds(200,100,600,500);//x,y,width,length;   
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
frame.setLayout(null);    
frame.setVisible(true);    
}   

public void actionPerformed(ActionEvent e){  

try {
numberr = Double.parseDouble(textt.getText());
if(e.getSource() == buttonn) {
if((rbb1.isSelected() && rbb2.isSelected()) || (rbb2.isSelected() && rbb3.isSelected()) || (rbb1.isSelected() && rbb3.isSelected())  || (rbb1.isSelected() && rbb2.isSelected() && rbb3.isSelected()) ) { 
JOptionPane.showMessageDialog(this, "Select any one input");    
}    
else if( (rbb11.isSelected() && rbb22.isSelected()) || (rbb22.isSelected() && rbb33.isSelected()) || (rbb11.isSelected() && rbb22.isSelected() && rbb33.isSelected()) ||  (rbb11.isSelected() && rbb33.isSelected()) ){    
JOptionPane.showMessageDialog(this, "Select any one output");   
}
else if(rbb1.isSelected() && rbb22.isSelected()){    

met = numberr / 100.0; 
String result = String.format("%.2f", met);
textt2.setText(result);

}    

else if(rbb1.isSelected() && rbb33.isSelected()) {

in = numberr * 0.3937;

String result = String.format("%.2f", in);
textt2.setText(result);


}
else if(rbb2.isSelected() && rbb11.isSelected()) {

cen = numberr * 100.0;

String result = String.format("%.2f", cen);
textt2.setText(result);

}
else if(rbb2.isSelected() && rbb33.isSelected()) {

in = numberr * 100  * 0.3937;

String result = String.format("%.2f", in);
textt2.setText(result);

}
else if(rbb3.isSelected() && rbb11.isSelected()) {

cen = numberr / 0.3937;

String result = String.format("%.2f", cen);
textt2.setText(result);

}
else if(rbb3.isSelected() && rbb22.isSelected()) {

met = numberr * 100 / 0.3937;                  

String result = String.format("%.2f", met);
textt2.setText(result);
}
}
else if(e.getSource() == buttonn2) {

clear();
}

}catch(NumberFormatException ex) {

JOptionPane.showMessageDialog(this, ex);    
clear();
}
}    

void clear() {

textt.setText("");
textt2.setText("");
}

public static void main(String args[]){    

new RadioButton2();    
}
}