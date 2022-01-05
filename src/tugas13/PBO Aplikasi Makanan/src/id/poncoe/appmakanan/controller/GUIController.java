/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.poncoe.appmakanan.controller;

import id.poncoe.appmakanan.view.MainGUI;

/**
 *
 * @author poncoe
 */
public class GUIController{
    private final MainGUI maingui;
    
    public GUIController(){
        maingui = new MainGUI();
        maingui.setVisible(true); 
    }
}    