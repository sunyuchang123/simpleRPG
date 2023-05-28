/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2.simplerpg;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author yucha
 */
public class NameDialog extends JDialog{
    private String name = " ";
    
    public NameDialog(JFrame jFrame){
        Container container = getContentPane();
        JLabel jlabel = new JLabel("Please enter your name");
        container.add(jlabel, BorderLayout.CENTER);

        JTextField nameField = new JTextField();
        container.add(nameField, BorderLayout.CENTER);

        JButton confirmButton = new JButton("Confirm");
        // Close value when click
        confirmButton.addActionListener(e -> {
            JButton jButton = (JButton) e.getSource();
            JDialog jdialog = (JDialog) jButton.getRootPane().getParent();
            name = nameField.getText();
            jdialog.dispose();
        });
        container.add(confirmButton, BorderLayout.CENTER);

        setBounds(400, 300, 350, 200);
    
    }
    
    public String getName(){
    return name;
    }
    
}
