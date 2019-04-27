package Controller;
import Model.modelDonatur;
    import Model.modelMasuk;
import View.viewDonatur;
    import View.viewMasuk;
import View.viewMenu;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

public class controllerMasuk {
    modelMasuk model; 
    viewMasuk view;
    
    public controllerMasuk(modelMasuk model, viewMasuk view){
        this.model = model;
        this.view = view;
        
        this.view.addMasukListener(new btnMasukListener());
        this.view.addBatalListener(new btnBatalListener());
    }

    private class btnMasukListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = view.getUser();
            String password = view.getPass();
            
            if(username.equals(model.getUser()) && password.equals(model.getPass())){
                view.TampilSukses("Berhasil Masuk");
                view.dispose();
                
                viewMenu view = new viewMenu();
                controllerMenu coontroller = new controllerMenu(view);
                
                
            }else{
                view.TampilGagal("Username atau Password Salah !!");
            }
        }
    }

    private class btnBatalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.dispose();
        }
    }

    
}
