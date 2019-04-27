package Controller;

import Dao.daoPenceramah;
import Model.modelPenceramah;
import View.viewPenceramah;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controllerPenceramah {
    modelPenceramah model; viewPenceramah view;
    
    public controllerPenceramah(modelPenceramah model, viewPenceramah view){
        this.model = model;
        this.view = view;
        
        this.view.addDaftarListener(new btnDaftarListener());
        this.view.addBatalListener(new btnBatalListener());
    }

    private class btnDaftarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            model.setId(view.getId());
            model.setNama(view.getNama());
            model.setAlamat(view.getAlamat());
            model.setNo_hp(view.getNoHp());
            
            daoPenceramah dao = new daoPenceramah(model);
            dao.createDb();
        }

        
    }

    private class btnBatalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.dispose();
        }
    }

    
}
