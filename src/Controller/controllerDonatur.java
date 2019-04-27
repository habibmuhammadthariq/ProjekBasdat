package Controller;

import Dao.daoDonatur;
import Model.modelDonatur;
import View.viewDonatur;
import View.viewMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controllerDonatur {
    modelDonatur model; viewDonatur view;
    
    public controllerDonatur(modelDonatur model, viewDonatur view){
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
            model.setNoHp(view.getNoHp());
            
            daoDonatur dao = new daoDonatur(model);
            dao.createData();
            
        }
    }

    private class btnBatalListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            viewMenu view = new viewMenu();
            controllerMenu controller = new controllerMenu(view);
        }
    }
}
