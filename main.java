/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.rivan.personalfinancetracker;

/**
 *
 * @author HP
 */
public class main {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(() -> {

            LoginFrom login = new LoginFrom();

            login.setTitle("Login");
            login.setDefaultCloseOperation(
                javax.swing.JFrame.EXIT_ON_CLOSE
            );
            login.setLocationRelativeTo(null);
            login.setVisible(true);

        });
    }
}
