package hotel.management.systems;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public  class HotelManagementSystems extends JFrame implements ActionListener {
    HotelManagementSystems(){
        //setSize(1366,565);
        //setLocation(100,100);
        setBounds(100, 100, 1366, 565);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        JLabel image = new JLabel(i1); 
        image.setBounds(0, 0, 1366, 565);
        add(image);
        
        JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
        text.setBounds(20, 430, 1000, 50);
        text.setForeground(Color.red);
        text.setFont(new Font("serif", Font.PLAIN, 50));
        image.add(text);
        
        JButton next = new JButton("Next");
        next.setBounds(1150, 450, 150,50);
        next.setBackground(Color.red);
        next.addActionListener(this);
        image.add(next);

        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new HotelManagementSystems();
    }
    
}
