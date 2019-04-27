package main;

import Controller.controllerMasuk;
import Model.modelMasuk;
import View.viewMasuk;

public class main {
    public static void main(String[] args) {
        modelMasuk model = new modelMasuk();
        viewMasuk view = new viewMasuk();
        controllerMasuk controller = new controllerMasuk(model, view);
    }
}
