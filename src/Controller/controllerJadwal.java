package Controller;

import Dao.daoJadwal;
import Model.modelJadwal;
import View.viewJadwal;
import View.viewMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controllerJadwal {
    modelJadwal model = new modelJadwal();
    viewJadwal view = new viewJadwal();
    
    public controllerJadwal(modelJadwal model, viewJadwal view){
        this.model = model;
        this.view = view;
        
        view.addMasukListener(new btnMasukListener());
        view.addBatalListener(new btnBatalListener());
    }

    private class btnMasukListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            model.setId(view.getId());
            model.setPenceramah_id(view.getIdPenceramah());
            model.setHari_ke(view.getHariKe());
            model.setKode_waktu(view.getKodeWaktu());
            model.setTema(view.getTema());
            
            daoJadwal dao = new daoJadwal(model);
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
