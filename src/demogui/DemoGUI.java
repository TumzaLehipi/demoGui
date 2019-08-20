    
package demogui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSplitPane;
import java.awt.*;
import javax.swing.ImageIcon;


public class DemoGUI extends JFrame{

    public DemoGUI()  {
        
        
        this.setTitle("Demo GUI 1");
        this.setSize(600,400);
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4,8));
        
        
        final JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");
        JMenu windowMenu = new JMenu("Window");
        
        menuBar.add(fileMenu);
        splitPane.setTopComponent(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(windowMenu);
        
        JMenuItem openMenuItem = new JMenuItem("Open");
        fileMenu.add(openMenuItem);
        
        JPanel myPanel  = new JPanel();
 
        JButton exitButton = new JButton("Exit");
        JButton okButton = new JButton("Ok");
        JButton closeButton = new JButton("Close");
        JButton javaButton = new JButton("Java");
        
        myPanel.add(exitButton);
        myPanel.add(okButton);
        myPanel.add(closeButton);
        myPanel.add(javaButton,BorderLayout.NORTH);
        
        
        
        this.add(myPanel);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        exitButton.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent event){
            System.exit(0);
        }    
    });

        
    }

    public static void main(String[] args) {
   
        new  DemoGUI();
        
        
        
    }
    
}
