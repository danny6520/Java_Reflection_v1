package javaReflectionPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import javaReflectionPackage.GetPackageInfo;

public class UItoGetPackageInfo {

	public static void main(String[] args) {
        JFrame frame = new JFrame("Java Reflection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        JLabel label1 = new JLabel("Enter the package name");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Submit");
        
        panel.add(label1);
        panel.add(textField);
        panel.add(button);
        
        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText(); // Get the text from the text field
                System.out.println("You have entered the package name as: " + text);
                
                String passingText = GetPackageInfo.processPackageInfo(text);
                
                
               // AnotherClass anotherClass = new AnotherClass(); // Create an instance of AnotherClass
                //anotherClass.storeText(text); // Call the storeText method of AnotherClass and pass the text
            }
        });
        
        frame.add(panel);
        frame.setVisible(true);
    }
}

/*
class AnotherClass {
    private String myString; // Declare a private string variable
    //javaReflectionPackage.UItoGetPackageInfo obj = new javaReflectionPackage.UItoGetPackageInfo();
    public void storeText(String text) {
        myString = text; // Store the text in the private string variable
        System.out.println("The text entered in the text field is: " + myString); // Print the string to the console
        
     
        
    }
*/
    
    /*
    public String getMyString() {
        return myString;
    	
    }
    */
    
    
    
    
    
    
    

//}


