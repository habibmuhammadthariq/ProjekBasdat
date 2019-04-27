package Controller;

import Dao.daoDonatur;
    import View.viewTable;
public class controllerTable {
    viewTable view;
    daoDonatur dao;
    controllerTable(viewTable view) {
        this.view = view;
        view.setTable(dao.getData());
    }
    
}
