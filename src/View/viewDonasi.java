package View;

import javax.swing.*;
import java.awt.event.*;

public class viewDonasi extends JFrame{

    private JLabel lId = new JLabel("ID Donasi");
    private JLabel lIdDonatur = new JLabel("Id Donatur");
    private JLabel lHariKe = new JLabel("Hari Ke");
    private JLabel lBentukDonasi = new JLabel("Bentuk Donasi");
    
    private JTextField tfId = new JTextField();
    private JTextField tfIdDonatur = new JTextField();
    private JTextField tfHariKe = new JTextField();
    private JTextField tfBentukDonasi = new JTextField();
    
    private JButton btnMasuk = new JButton("Masukkan");
    private JButton btnBatal = new JButton("Batal");
    
    public viewDonasi(){
        setLocationRelativeTo(null);
        setTitle("Donasi");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 300);
        
        setLayout(null);
        add(lId);
        add(tfId);
        add(lIdDonatur);
        add(tfIdDonatur);
        add(lHariKe);
        add(tfHariKe);
        add(lBentukDonasi);
        add(tfBentukDonasi);
        add(btnMasuk);
        add(btnBatal);
        
        lId.setBounds(20, 20, 80, 20);
        tfId.setBounds(150, 20, 150, 20);
        
        lIdDonatur.setBounds(20, 60, 80, 20);
        tfIdDonatur.setBounds(150, 60, 150, 20);
        
        lHariKe.setBounds(20, 100, 80, 20);
        tfHariKe.setBounds(150, 100, 150, 20);
        
        lBentukDonasi.setBounds(20, 140, 120, 20);
        tfBentukDonasi.setBounds(150, 140, 150, 20);
        
        btnMasuk.setBounds(70, 200, 80, 30);
        btnBatal.setBounds(190, 200, 80, 30);
        
        setVisible(true);
    }
    
    public String getId(){
        return tfId.getText();
    }
    
    public String getIdDonatur(){
        return tfIdDonatur.getText();
    }
    
    public String getHariKe(){
        return tfHariKe.getText();
    }
    
    public String getBentukDonasi(){
        return tfBentukDonasi.getText();
    }
    
        
    public static void main(String[] args) {
        viewDonasi view = new viewDonasi();
    }
}
