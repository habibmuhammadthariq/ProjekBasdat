package Dao;

import Model.modelJadwal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.connection;

public class daoJadwal extends connection{
    public modelJadwal model;
    public daoJadwal(modelJadwal model){
        this.model = model;
    }
    public void createData(){
            
        try {
            statement = Connect_db();
            statement.executeUpdate("insert into jadwal values('"
                    +model.getId()+"','"+model.getPenceramah_id()+"','"
                    +model.getHari_ke()+"','"+model.getKode_waktu()+"','"
                    +model.getTema()+"')");
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
            statement.executeUpdate("update jadwal set id='"+model.getId()
                    +"',penceramah_id='"+model.getPenceramah_id()
                    +"',hari_ke='"+model.getHari_ke()+"',kode_waktu='"
                    +model.getKode_waktu()+"',tema='"+model.getTema()
                    +"' where id ='"+model.getId()+"'");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "You got an error","error",
                    JOptionPane.ERROR_MESSAGE);
        }
        Close();
    }
    
    public void hapusData(){
        try{
            statement = Connect_db();
            statement.executeUpdate("delete from jadwal where nama = '"+model.getId()+"'");
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
        dtm.addColumn("Id Penceramah");
        dtm.addColumn("Hari Ke");
        dtm.addColumn("Kode Waktu");
        dtm.addColumn("Tema");
        
        try {
            statement = Connect_db();
            resultSet = statement.executeQuery("select * from jadwal");
            
            while (resultSet.next()){
                dtm.addRow(new Object[]{
                    resultSet.getString("id"),
                    resultSet.getString("penceramah_id"),
                    resultSet.getString("hari_ke"),
                    resultSet.getString("kode_waktu"),
                    resultSet.getString("tema"),
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
