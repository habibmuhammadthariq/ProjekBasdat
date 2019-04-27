package Dao;

    import Model.modelDonatur;
    import java.sql.SQLException;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
    import main.connection;

public class daoDonatur extends connection{
    private modelDonatur model;
    
    public daoDonatur(modelDonatur model){
        this.model = model;
    }
    
    public void createData(){
            
        try {
            statement = Connect_db();
            statement.executeUpdate("insert into donatur values('"
                    +model.getId()+"','"+model.getNama()+"','"
                    +model.getAlamat()+"','"+model.getNoHp()+"')");
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
            statement.executeUpdate("update donatur set id='"+model.getId()
                    +"',nama='"+model.getNama()+"',alamat='"+model.getAlamat()
                    +"',no_hp='"+model.getNoHp()+"' where id ='"+model.getId()+"'");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "You got an error","error",
                    JOptionPane.ERROR_MESSAGE);
        }
        Close();
    }
    
    public void hapusData(){
        try{
            statement = Connect_db();
            statement.executeUpdate("delete from donatur where nama = '"+model.getNama()+"'");
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
        dtm.addColumn("Nama");
        dtm.addColumn("Alamat");
        dtm.addColumn("No Hp");
        
        try {
            statement = Connect_db();
            resultSet = statement.executeQuery("select * from donatur");
            
            while (resultSet.next()){
                dtm.addRow(new Object[]{
                    resultSet.getString("id"),
                    resultSet.getString("nama"),
                    resultSet.getString("alamat"),
                    resultSet.getString("no_hp"),
                });
            }
            
            JOptionPane.showMessageDialog(null, "berhasil di simpan", "sukses",JOptionPane.INFORMATION_MESSAGE);
            statement.close();
            connection.close();
                        
        } catch (SQLException ex ) {
            JOptionPane.showMessageDialog(null, "You got an Error!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        return dtm;
    }
}
