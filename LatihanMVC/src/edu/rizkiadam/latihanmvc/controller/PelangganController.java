/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizkiadam.latihanmvc.controller;

import edu.rizkiadam.latihanmvc.model.PelangganModel;
import edu.rizkiadam.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * Nama : WIDIAMEGA K
 * NIM : 10117082
 * Kelas : IF-3
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
 
    public void resetForm(PelangganView view){
      String nama = view.getTxtNama().getText();
      String email = view.getTxtEmail().getText();
      String noTelp = view.getTxtNotlp().getText();
      
      if(nama.equals("")&& email.equals("") && noTelp.equals("")){
          
      } else {
          model.resetForm();
      }
      
    }
    
    public void simpanForm(PelangganView view){
        
       String nama = view.getTxtNama().getText();
      String email = view.getTxtEmail().getText();
      String noTelp = view.getTxtNotlp().getText(); 
      
      if(nama.trim().equals("")){
          JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
          
      } else if(email.trim().equals("")) {
          JOptionPane.showMessageDialog(view, "Email Masih Kosong");
          
      }else if(noTelp.trim().equals("")) {
          JOptionPane.showMessageDialog(view, "No Telpon Masih Kosong");
          
      }else {
          model.simpanForm();
      }
    }
    
}
