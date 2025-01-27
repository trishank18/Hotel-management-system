package hotel.management.systems;
import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    
     Dashboard(){
         setBounds(0, 0, 1550, 1000);
         
         setLayout(null);
         
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
         Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT); 
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(0, 0, 1550, 1000);
         add(image);
         
         JLabel text = new JLabel("THE UTR GROUP WELCOMES YOU");
         text.setBounds(400, 80, 1000, 50);
         text.setFont(new Font("Tahoma", Font.PLAIN, 30));
         image.add(text);
         
         JMenuBar mb = new JMenuBar();
         mb.setBounds(0, 0, 1550, 30);
         image.add(mb);
         
         JMenu hotel = new JMenu("HOTEL MANAGEMENT");
         hotel.setForeground(Color.red);
         mb.add(hotel);
         
         JMenu reception = new JMenu("RECEPTION");
         hotel.add(reception);
         
         JMenu admin = new JMenu("ADMIN");
         hotel.setForeground(Color.BLUE);
         mb.add(admin);
         
         JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE DETAILS");
         admin.add(addemployee);
         
         JMenuItem addrooms = new JMenuItem("ADD ROOMS");
         admin.add(addrooms);
         JMenuItem customer = new JMenuItem("CUSTOMERS ENTRY");
         admin.add(customer);
         
         JMenuItem adddriver = new JMenuItem("ADD DRIVER DEDAILS");
         admin.add(adddriver);
         
         
         setVisible(true);
          
     }    
     
     public static void main(String[] args) {
         
         new Dashboard();
         
     }
}