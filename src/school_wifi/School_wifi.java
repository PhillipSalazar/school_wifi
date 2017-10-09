/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_wifi;

/**
 *
 * @author phillip
 */
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
  import javax.swing.*;
public class School_wifi extends JFrame{

    /**
     * @param args the command line arguments
     */
    
    JFrame frame = new JFrame("TCC wifi");
    JPanel panel = new JPanel();
    JLabel text = new JLabel();
    JButton button = new JButton();
    
    public static void main(String[] args) {
        // TODO code application logic here
        School_wifi wifi = new School_wifi();
        wifi.gui();
    }
    
    public void gui() {
       /* JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel text = new JLabel();
        JButton button = new JButton();
*/
        frame.setLocation (50,50);
        frame.setSize(200,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        frame.add(panel);
        
        text.setSize(100,25);
        text.setText("To Tcc Login");
        text.setLocation(25,25);
        
        button.setSize(150,25);
        button.setLocation(25,50);
        button.setText("OK");
        
        
        panel.setSize(200,150);
        panel.setLayout(null);
        panel.add(text);
        panel.add(button);
        
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet."); 
                text.setText("success");
                School_wifi wifi = new School_wifi();
                wifi.urlz();
            
            }
        });
        
        
    }
    
        public void urlz() {
        String url = "http://64.28.249.230/fs/customwebauth/login.html?switch_url=http://64.28.249.230/login.html&ap_mac=00:f6:63:70:11:80&client_mac=ac:e0:10:ed:e4:80&wlan=TCCD-PUBLIC&redirect=go.microsoft.com/fwlink/?LinkID=219472&clcid=0x409";

        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else{
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("xdg-open " + url);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        frame.dispose();
    }
    
    
    
}
