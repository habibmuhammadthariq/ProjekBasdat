package View;

import javax.swing.*;
import java.awt.event.*;

public class viewJadwal extends JFrame{

    private JLabel lId = new JLabel("ID Jadwal");
    private JLabel lIdPenceramah = new JLabel("Id Penceramah");
    private JLabel lHariKe = new JLabel("Hari Ke");
    private JLabel lKodeWaktu = new JLabel("Kode Waktu");
    private JLabel lTema = new JLabel("Tema");
    
    private JTextField tfId = new JTextField();
    private JTextField tfIdPenceramah = new JTextField();
    private JTextField tfHariKe = new JTextField();
    private JTextField tfKodeWaktu = new JTextField();
    private JTextField tfTema = new JTextField();
    
    private JButton btnMasuk = new JButton("Masukkan");
    private JButton btnBatal = new JButton("Batal");
    
    public viewJadwal(){
        setLocationRelativeTo(null);
        setTitle("Jadwal Ceramah");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 300);
        
        setLayout(null);
        add(lId);
        add(tfId);
        add(lIdPenceramah);
        add(tfIdPenceramah);
        add(lHariKe);
        add(tfHariKe);
        add(lKodeWaktu);
        add(tfKodeWaktu);
        add(lTema);
        add(tfTema);
        add(btnMasuk);
        add(btnBatal);
        
        lId.setBounds(20, 20, 80, 20);
        tfId.setBounds(150, 20, 150, 20);
        
        lIdPenceramah.setBounds(20, 60, 120, 20);
        tfIdPenceramah.setBounds(150, 60, 150, 20);
        
        lHariKe.setBounds(20, 100, 80, 20);
        tfHariKe.setBounds(150, 100, 150, 20);
        
        lKodeWaktu.setBounds(20, 140, 120, 20);
        tfKodeWaktu.setBounds(150, 140, 150, 20);
        
        lTema.setBounds(20, 180, 150, 20);
        tfTema.setBounds(150, 180, 150, 20);
        
        btnMasuk.setBounds(70, 230, 140, 30);
        btnBatal.setBounds(190, 230, 80, 30);
        
        setVisible(true);
    }
    
    public String getId(){
        return tfId.getText();
    }
    
    public String getIdPenceramah(){
        return tfIdPenceramah.getText();
    }
    
    public String getHariKe(){
        return tfHariKe.getText();
    }
    
    public String getKodeWaktu(){
        return tfKodeWaktu.getText();
    }
    
    public String getTema(){
        return tfTema.getText();
    }
    
    public void addMasukListener(ActionListener btnMasukListener){
        btnMasuk.addActionListener(btnMasukListener);
    }
    
    public void addBatalListener(ActionListener btnBatalListener){
        btnBatal.addActionListener(btnBatalListener);
    }
}
