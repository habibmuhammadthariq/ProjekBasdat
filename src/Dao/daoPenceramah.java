package Dao;
    import Model.modelPenceramah;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.connection;

public class daoPenceramah extends connection{
    private modelPenceramah model;
    
    public daoPenceramah(modelPenceramah model){
        this.model = model;
    }
    
    public void createDb(){
        try {
            statement = Connect_db();
            statement.executeUpdate("insert into penceramah values('"
                    +model.getId()+"','"+model.getNama()+"','"
                    +model.getAlamat()+ "','"+model.getNo_hp()+"')");
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "You got an error", "error", JOptionPane.ERROR_MESSAGE);
        }
        Close();
    }
    
    public void updateDb(){
        try {
            statement = Connect_db();
            statement.executeUpdate("update donatur set id='"+model.getId()
                +"',nama='"+model.getNama()+"',alamat='"+model.getAlamat()
                +"',no_hp='"+model.getNo_hp()+"' where id='"+model.getId()+"')");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "You got an error","error",JOptionPane.ERROR_MESSAGE);
        }
        Close();
    }
    
    public void deleteDb(){
        try {
            statement = Connect_db();
            statement.executeUpdate("delete from penceramah where id='"+model.getId()+"'");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "You got an error", "error", JOptionPane.ERROR_MESSAGE);
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
            resultSet = statement.executeQuery("select * from pnceramah");
            
            while (resultSet.next()){
                dtm.addRow(new Object[]{
                    resultSet.getString("id"),
                    resultSet.getString("nama"),
                    resultSet.getString("alamat"),
                    resultSet.getString("no_hp"),
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
