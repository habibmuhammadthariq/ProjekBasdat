package View;

import Dao.daoDonatur;
import Model.modelDonasi;
import Model.modelDonatur;
import Model.modelJadwal;
import Model.modelPenceramah;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class viewTable extends JFrame{
    
    modelDonatur dnModel;
    modelPenceramah pnModel;
    modelDonasi dsModel;
    modelJadwal jdModel;
    daoDonatur dao;
    
    public JTable table = new JTable(dao.getData());
    JScrollPane scroll = new JScrollPane(table);
    JButton hapusB = new JButton("Hapus");
    JButton updateB = new JButton("Update");
    JLabel label = new JLabel("*Hanya bisa update satu persatu / pilih salah satu yang mau di edit, kemudian update");
    
//    public viewTable(){
//        
//    }
    
    public viewTable() {
        dao.getData();
        setLayout(null);
        setTitle("Form");
        setVisible(true);
        setSize(540, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(700, 150);
        
        add(scroll).setBounds(0, 0, 530, 200);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(90);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(50);
        table.getColumnModel().getColumn(3).setPreferredWidth(80);

        add(hapusB).setBounds(30, 240, 100, 25);
        add(updateB).setBounds(150, 240, 100, 25);
        add(label).setBounds(20, 200, 500, 25);
    }

    public void setTable(DefaultTableModel data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
