package project;

import javax.swing.JPanel;

import java.awt.Button;
import java.awt.TextArea;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InteractiveAuditorApplet extends JApplet{
	public InteractiveAuditorApplet() {
	}
	private Button okButton; 

    private TextArea nameField; 

    private JEditorPane editorPane;
    private TextParser textparse;

    public void init() 
    { 
    
 // Tell the applet not to use a layout manager. 
 //****************************************************************************
 //Begin user interface
 //****************************************************************************
   	
    	getContentPane().setLayout(null); 
     
     JPanel panel = new JPanel();
     panel.setBounds(0, 0, 383, 208);
     getContentPane().add(panel);
           panel.setLayout(null);
     // initialze the button and give it a text. 
           okButton = new Button("Submit");
           
          
           okButton.setBounds(10, 147, 46, 22);
           panel.add(okButton);
                        // text and length of the field 
                              nameField = new TextArea();
                              nameField.setBounds(10, 34, 363, 101);
                              panel.add(nameField);
                              
                              JLabel lblEnterYourUrl = new JLabel("Enter your url here");
                              lblEnterYourUrl.setBounds(10, 11, 91, 14);
                              panel.add(lblEnterYourUrl);
                              
                              JPanel panel_1 = new JPanel();
                              panel_1.setBounds(410, 15, 480, 574);
                              getContentPane().add(panel_1);
                              panel_1.setLayout(null);
                              
                              editorPane = new JEditorPane();
                              editorPane.setBounds(10, 11, 460, 552);
                              panel_1.add(editorPane);
     
     this.setSize(900, 600);
     
//****************************************************************************
//end  user interface
//Start action listener prototype
//****************************************************************************
     okButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//to do
        		//request document
        		//return list of parsed down document to maybe a string yo
        	}
        });
    }
    
    
    
    
    public void start(){
    	//not used yet
    	
    }
    public void stop(){
    	//not used yet
    	
    }
   }


