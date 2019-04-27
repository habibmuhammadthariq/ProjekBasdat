package Dao;

import Model.modelDonasi;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.connection;

public class daoDonasi extends connection{
    modelDonasi model = new modelDonasi();
    
    public daoDonasi(modelDonasi model){
        this.model = model;
    }
    
    public void createData(){
            
        try {
            statement = Connect_db();
            statement.executeUpdate("insert into donasi values('"
                    +model.getId()+"','"+model.getDonatur_id()+"','"
                    +model.getHari()+"','"+model.getBentuk()+"')");
            JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal di simpan !!", "Failed", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(daoDonatur.class.getName()).log(Level.SEVERE, null, e);
        }
        
        Close();
    }
    
    public void updateData(){
        try{
            statement = Connect_db();
            statement.executeUpdate("update donasi set id='"+model.getId()
                    +"',donatur_id='"+model.getDonatur_id()+"',hari='"+model.getHari()
                    +"',bentuk='"+model.getBentuk()+"' where id ='"+model.getId()+"'");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "You got an error","error",
                    JOptionPane.ERROR_MESSAGE);
        }
        Close();
    }
    
    public void hapusData(){
        try{
            statement = Connect_db();
            statement.executeUpdate("delete from donasi where nama = '"+model.getId()+"'");
            JOptionPane.showMessageDialog(null, "data sudah dihapus"
                    , "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "You got an Error !"
            , "error", JOptionPane.ERROR_MESSAGE);
        }
        
        Close();
    }
    
    public DefaultTableModel getData(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Id");
        dtm.addColumn("Id Donatur");
        dtm.addColumn("Hari Ke");
        dtm.addColumn("Bentuk Donasi");
        
        try {
            statement = Connect_db();
            resultSet = statement.executeQuery("select * from donasi");
            
            while (resultSet.next()){
                dtm.addRow(new Object[]{
                    resultSet.getString("id"),
                    resultSet.getString("donatur_id"),
                    resultSet.getString("hari_ke"),
                    resultSet.getString("bentuk"),
                });
            }
            statement.close();
            connection.close();
                        
        } catch (SQLException ex ) {
            JOptionPane.showMessageDialog(null, "You got an Error!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        return dtm;
    }
    
}
