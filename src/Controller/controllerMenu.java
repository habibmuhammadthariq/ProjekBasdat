package Controller;

import Model.modelDonasi;
import Model.modelDonatur;
import Model.modelJadwal;
import Model.modelPenceramah;
import View.viewDonasi;
import View.viewDonatur;
import View.viewJadwal;
import View.viewMenu;
import View.viewPenceramah;
import View.viewTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controllerMenu {
    viewMenu view;
    public controllerMenu(viewMenu view){
        this.view = view;
        
        view.btnDonaturListener(new btnDonaturListener());
        view.btnPenceramahListener(new btnPenceramahListener());
        view.btnDonasiListener(new btnDonasiListener());
        view.btnJadwalListener(new btnJadwalListener());
    }

    private class btnDonaturListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.dispose();
            modelDonatur model = new modelDonatur();
            viewDonatur view = new viewDonatur();
            controllerDonatur controller = new controllerDonatur(model, view);
        }
    }

    private class btnPenceramahListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.dispose();
            modelPenceramah model = new modelPenceramah();
            viewPenceramah view = new viewPenceramah();
            controllerPenceramah controller = new controllerPenceramah(model, view);
        }
    }

    private class btnDonasiListener implements ActionListener {
   @Override
        public void actionPerformed(ActionEvent e) {
            view.dispose();
            modelDonasi model = new modelDonasi();
            viewDonasi view = new viewDonasi();
//            controllerDonasi controller = new controllerDonasi(model, view);
        }
    }

    private class btnJadwalListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.dispose();
//            modelJadwal model = new modelJadwal();
//            viewJadwal view = new viewJadwal();
//            controllerJadwal = new controllerJadwal(model, view);


            viewTable view = new viewTable();
            controllerTable controller = new controllerTable(view);
        }
    }
        
    private class btnTableListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.dispose();
            viewTable view = new viewTable();
            controllerTable controller = new controllerTable(view);
        }
    }
    
}
