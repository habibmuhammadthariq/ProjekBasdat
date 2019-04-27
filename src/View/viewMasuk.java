package View;

    import java.awt.event.ActionListener;
    import javax.swing.*;

public class viewMasuk extends JFrame{
    private JLabel lUser = new JLabel("Username");
    private JLabel lPass = new JLabel("Password");
    
    private JTextField tfUser = new JTextField();
    private JPasswordField pfPass = new JPasswordField();
    
    private JButton btnMasuk = new JButton("Masuk");
    private JButton btnBatal = new JButton("Batal");
    
    public viewMasuk(){
        setLocationRelativeTo(null);
        setTitle("Masuk");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(280, 180);
        
        setLayout(null);
        add(lUser);
        add(tfUser);
        add(lPass);
        add(pfPass);
        add(btnMasuk);
        add(btnBatal);
        
        lUser.setBounds(20, 20, 80, 20);
        tfUser.setBounds(120, 20, 120, 20);
        lPass.setBounds(20, 50, 80, 20);
        pfPass.setBounds(120, 50, 120, 20);
        btnMasuk.setBounds(40, 90, 80, 30);
        btnBatal.setBounds(160, 90, 80, 30);
        
        setVisible(true);
    }
    
    public String getUser(){
        return tfUser.getText();
    }
    
    public String getPass(){
        return pfPass.getText();
    }
    
    public void addMasukListener(ActionListener btnMasukListener){
        btnMasuk.addActionListener(btnMasukListener);
    }
    
    public void addBatalListener(ActionListener btnBatalListener){
        btnBatal.addActionListener(btnBatalListener);
    }
    
    public void TampilSukses(String pesan){
        JOptionPane.showMessageDialog(this, pesan, "Sukses", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void TampilGagal(String pesan){
        JOptionPane.showMessageDialog(this, pesan, "Gagal", JOptionPane.ERROR_MESSAGE);
    }
}
