package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class viewMenu extends JFrame{
    
    private JButton btnDonatur =  new JButton("Donatur");
    private JButton btnPenceramah =  new JButton("Penceramah");
    private JButton btnDonasi =  new JButton("Donasi");
    private JButton btnJadwal =  new JButton("Jadwal Ceramah");
    
    public viewMenu(){
        setLocationRelativeTo(null);
        setTitle("Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(370, 280);
        
        setLayout(null);
        add(btnDonatur);
        add(btnPenceramah);
        add(btnDonasi);
        add(btnJadwal);
        
        btnDonatur.setBounds(30, 50, 100, 40);
        btnPenceramah.setBounds(200, 50, 130, 40);
        btnDonasi.setBounds(30, 180, 100, 40);
        btnJadwal.setBounds(200, 180, 150, 40);
        
        setVisible(true);
    }
    
    public void btnDonaturListener(ActionListener btnDonaturListener){
        btnDonatur.addActionListener(btnDonaturListener);
    }
    
    public void btnPenceramahListener(ActionListener btnPenceramahListener){
        btnPenceramah.addActionListener(btnPenceramahListener);
    }
    
    public void btnDonasiListener(ActionListener btnDonasiListener){
        btnDonasi.addActionListener(btnDonasiListener);
    }
    
    public void btnJadwalListener(ActionListener btnJadwalListener){
        btnJadwal.addActionListener(btnJadwalListener);
    }
    
    public static void main(String[] args) {
        viewMenu view = new viewMenu();
    }
}
