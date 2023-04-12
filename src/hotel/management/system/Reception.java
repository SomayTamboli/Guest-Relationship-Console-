package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener{
    JButton newcustomer, rooms, department, allEmployee, managerInfo, customerInfo, searchroom, checkout, update, roomupdate, pickup, logout ;
    Reception(){
     
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        newcustomer = new JButton("New Customer Form");
        newcustomer.setBounds(10,30,200,30);
        newcustomer.setBackground(Color.BLACK);
        newcustomer.setForeground(Color.WHITE);
        newcustomer.addActionListener(this);
        add(newcustomer);
        
        rooms = new JButton("Rooms");
        rooms.setBounds(10,70,200,30);
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.WHITE);
        rooms.addActionListener(this);
        add(rooms);
        
        department = new JButton("Department");
        department.setBounds(10,110,200,30);
        department.setBackground(Color.BLACK);
        department.setForeground(Color.WHITE);
        department.addActionListener(this);
        add(department);
        
        allEmployee = new JButton("All Employees");
        allEmployee.setBounds(10,150,200,30);
        allEmployee.setBackground(Color.BLACK);
        allEmployee.setForeground(Color.WHITE);
        allEmployee.addActionListener(this);
        add(allEmployee);
        
        customerInfo = new JButton("Customer Info");
        customerInfo.setBounds(10,190,200,30);
        customerInfo.setBackground(Color.BLACK);
        customerInfo.setForeground(Color.WHITE);
        customerInfo.addActionListener(this);
        add(customerInfo);
        
        managerInfo = new JButton("Manager Info");
        managerInfo.setBounds(10,230,200,30);
        managerInfo.setBackground(Color.BLACK);
        managerInfo.setForeground(Color.WHITE);
        managerInfo.addActionListener(this);
        add(managerInfo);
        
        checkout = new JButton("Checkout");
        checkout.setBounds(10,270,200,30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        checkout.addActionListener(this);
        add(checkout);
        
        update = new JButton("Update Status");
        update.setBounds(10,310,200,30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);
        
        roomupdate = new JButton("Update Room Status");
        roomupdate.setBounds(10,350,200,30);
        roomupdate.setBackground(Color.BLACK);
        roomupdate.setForeground(Color.WHITE);
        roomupdate.addActionListener(this);
        add(roomupdate);
        
        pickup = new JButton("Pickup Service");
        pickup.setBounds(10,390,200,30);
        pickup.setBackground(Color.BLACK);
        pickup.setForeground(Color.WHITE);
        pickup.addActionListener(this);
        add(pickup);
        
        searchroom = new JButton("Search Room");
        searchroom.setBounds(10,430,200,30);
        searchroom.setBackground(Color.BLACK);
        searchroom.setForeground(Color.WHITE);
        searchroom.addActionListener(this);
        add(searchroom);
        
        logout = new JButton("Logout");
        logout.setBounds(10,470,200,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);
        add(logout);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(250,30,500,470);
        add(image);
        
        
        setBounds(350,200,800,570);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == newcustomer){
            setVisible(false);
            new AddCustomer();
        } else if (ae.getSource() == rooms){
            setVisible(false);
            new Room();
        } else if (ae.getSource() == department){
            setVisible(false);
            new Department();
        } else if (ae.getSource() == allEmployee){
            setVisible(false);
            new EmployeeInfo();
        } else if (ae.getSource() == managerInfo){
            setVisible(false);
            new ManagerInfo();
        } else if (ae.getSource() == customerInfo){
            setVisible(false);
            new CustomerInfo();
        } else if (ae.getSource() == searchroom){
            setVisible(false);
            new SearchRoom();
        } else if (ae.getSource() == update){
            setVisible(false);
            new UpdateCheck();
        } else if (ae.getSource() == roomupdate){
            setVisible(false);
            new UpdateRoom();
        } else if (ae.getSource() == pickup){
            setVisible(false);
            new Pickup();
        } else if (ae.getSource() == checkout){
            setVisible(false);
            new CheckOut();
        } else if (ae.getSource() == logout){
            setVisible(false);
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        new Reception();
    }
}
