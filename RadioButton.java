import javax.swing.*;
import java.awt.event.*;    
import java.awt.*;

class RadioButton extends JFrame implements ActionListener{    
JRadioButton rb1,rb2, rb3, rb11, rb22, rb33;    
JButton button, button2;
JFrame frame;
JTextField text, text2;
JLabel label;
double number, k, f, c;

RadioButton(){      
rb1 = new JRadioButton("Celcius");    
rb1.setBounds(100,50,100,30);      
rb2 = new JRadioButton("Fehranite");    
rb2.setBounds(100,100,100,30);         
rb3 = new JRadioButton("Kelvin");    
rb3.setBounds(100,150,100,30);

rb11 = new JRadioButton("Celcius");    
rb11.setBounds(350,50,100,30);      
rb22 = new JRadioButton("Fehranite");    
rb22.setBounds(350,100,100,30);         
rb33 = new JRadioButton("Kelvin");    
rb33.setBounds(350,150,100,30);

rb1.setFont(new Font("Roman",Font.BOLD,15));
rb2.setFont(new Font("Roman",Font.BOLD,15));
rb3.setFont(new Font("Roman",Font.BOLD,15));
rb11.setFont(new Font("Roman",Font.BOLD,15));
rb22.setFont(new Font("Roman",Font.BOLD,15));
rb33.setFont(new Font("Roman",Font.BOLD,15));

label = new JLabel("Temperature Convertor");
label.setBounds(180,10,200,30);
label.setFont(new Font("Roman",Font.BOLD,15));
frame = new JFrame();
text = new JTextField();
text2 = new JTextField(); 
text.setBounds(210,70,100,30);
text2.setBounds(210,140,100,30); 
text2.setEnabled(false);
text.setFont(new Font("Roman",Font.BOLD,20));
text2.setFont(new Font("Roman",Font.BOLD,20));

button = new JButton("Convert");    
button.setBounds(170,200,80,30);    
button.addActionListener(this);
button.setBackground(Color.BLACK);
button.setForeground(Color.WHITE);

button2 = new JButton("Clear");    
button2.setBounds(260,200,80,30);    
button2.addActionListener(this);
button2.setBackground(Color.BLACK);
button2.setForeground(Color.WHITE);

frame.add(rb1);
frame.add(rb2);
frame.add(rb3);
frame.add(rb11);
frame.add(rb22);
frame.add(rb33);
frame.add(text);
frame.add(text2);
frame.add(button);    
frame.add(button2);    
frame.add(label);
//frame.setSize(300,300);
frame.setBounds(200,100,600,500);//x,y,width,length;   
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
frame.setLayout(null);    
frame.setVisible(true);    
}   

public void actionPerformed(ActionEvent e){  

try {
number = Double.parseDouble(text.getText());

if(e.getSource() == button) {
if((rb1.isSelected() && rb2.isSelected()) || (rb2.isSelected() && rb3.isSelected()) || (rb1.isSelected() && rb3.isSelected())  || (rb1.isSelected() && rb2.isSelected() && rb3.isSelected()) ) { 
JOptionPane.showMessageDialog(this, "Select any one input");    
}    
else if( (rb11.isSelected() && rb22.isSelected()) || (rb22.isSelected() && rb33.isSelected()) || (rb11.isSelected() && rb22.isSelected() && rb33.isSelected()) ||  (rb11.isSelected() && rb33.isSelected()) ){    
JOptionPane.showMessageDialog(this, "Select any one output");   
}
else if(rb1.isSelected() && rb22.isSelected()){    

f = ((number * (9.0/5.0)) + 32);

String result = String.format("%.2f", f);
text2.setText(result);

}    

else if(rb1.isSelected() && rb33.isSelected()) {

k = number + 273.15;

String result = String.format("%.2f", k);
text2.setText(result);


}
else if(rb2.isSelected() && rb11.isSelected()) {

c = ((number - 32)*(5.0/9.0));

String result = String.format("%.2f", c);
text2.setText(result);

}
else if(rb2.isSelected() && rb33.isSelected()) {

k = (((number - 32)*(5.0/9.0)) + 273.15);

String result = String.format("%.2f", k);
text2.setText(result);

}
else if(rb3.isSelected() && rb11.isSelected()) {

c = number - 273.15;

String result = String.format("%.2f", c);
text2.setText(result);

}
else if(rb3.isSelected() && rb22.isSelected()) {

f = (number - 273.15 - 32)*(5.0/9.0);                  

String result = String.format("%.2f", f);
text2.setText(result);
}
}
else if(e.getSource() == button2) {

clear();
}

}catch(NumberFormatException ex) {

JOptionPane.showMessageDialog(this, ex);    
clear();
}
}    

void clear() {

text.setText("");
text2.setText("");
}

public static void main(String args[]){    

new RadioButton();    
}
}