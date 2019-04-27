package View;

import javax.swing.*;
import java.awt.event.*;


public class viewDonatur extends JFrame{

    private JLabel lId = new JLabel("ID Donatur");
    private JLabel lNama = new JLabel("Nama");
    private JLabel lAlamat = new JLabel("Alamat");
    private JLabel lNoHp = new JLabel("No Hp");
    
    private JTextField tfId = new JTextField();
    private JTextField tfNama = new JTextField();
    private JTextField tfAlamat = new JTextField();
    private JTextField tfNoHp = new JTextField();
    
    private JButton btnDaftar = new JButton("Daftar");
    private JButton btnBatal = new JButton("Batal");
    
    public viewDonatur(){
        setLocationRelativeTo(null);
        setTitle("Donatur");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 300);
        
        setLayout(null);
        add(lId);
        add(tfId);
        add(lNama);
        add(tfNama);
        add(lAlamat);
        add(tfAlamat);
        add(lNoHp);
        add(tfNoHp);
        add(btnDaftar);
        add(btnBatal);
        
        lId.setBounds(20, 20, 80, 20);
        tfId.setBounds(130, 20, 150, 20);
        
        lNama.setBounds(20, 60, 80, 20);
        tfNama.setBounds(130, 60, 150, 20);
        
        lAlamat.setBounds(20, 100, 80, 20);
        tfAlamat.setBounds(130, 100, 150, 20);
        
        lNoHp.setBounds(20, 140, 80, 20);
        tfNoHp.setBounds(130, 140, 150, 20);
        
        btnDaftar.setBounds(70, 200, 80, 30);
        btnBatal.setBounds(190, 200, 80, 30);
        
        setVisible(true);
    }
    
    public String getId(){
        return tfId.getText();
    }
    
    public String getNama(){
        return tfNama.getText();
    }
    
    public String getAlamat(){
        return tfAlamat.getText();
    }
    
    public String getNoHp(){
        return tfNoHp.getText();
    }

    public void addDaftarListener(ActionListener btnMasukListener){
        btnDaftar.addActionListener(btnMasukListener);
    }
    
    public void addBatalListener(ActionListener btnBatalListener){
        btnBatal.addActionListener(btnBatalListener);
    }
}
