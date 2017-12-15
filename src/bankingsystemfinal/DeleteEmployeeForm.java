/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystemfinal;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author seifelmosalamy
 */
public class DeleteEmployeeForm extends JFrame {

    public DeleteEmployeeForm()  {
        JPanel panel = new JPanel();
        setLayout(null);
        panel.setBounds(500, 0, 500, 500);
        panel.setBackground(new Color(36, 45, 67));
        add(panel);
            setSize(1000,500);
    }
    
    
}
