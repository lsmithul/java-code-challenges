package Presentacion;

import Dominio.Juego;
import javax.swing.JFrame;

public class MenuPrincipal extends JFrame {

    private Juego juego;
    
    public MenuPrincipal() {
        this.juego = new Juego();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtDosJugadores = new javax.swing.JButton();
        jbtSalir = new javax.swing.JButton();
        jbtTresJugadores = new javax.swing.JButton();
        jbtCuatroJugadores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtDosJugadores.setText("2 Jugadores");
        jbtDosJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDosJugadoresActionPerformed(evt);
            }
        });

        jbtSalir.setText("Salir");
        jbtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalirActionPerformed(evt);
            }
        });

        jbtTresJugadores.setText("3 Jugadores");
        jbtTresJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTresJugadoresActionPerformed(evt);
            }
        });

        jbtCuatroJugadores.setText("4 Jugadores");
        jbtCuatroJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCuatroJugadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jbtSalir)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jbtCuatroJugadores)
                            .addGap(148, 148, 148)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtTresJugadores)
                            .addComponent(jbtDosJugadores))
                        .addGap(148, 148, 148))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jbtDosJugadores)
                .addGap(18, 18, 18)
                .addComponent(jbtTresJugadores)
                .addGap(18, 18, 18)
                .addComponent(jbtCuatroJugadores)
                .addGap(67, 67, 67)
                .addComponent(jbtSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtDosJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDosJugadoresActionPerformed
        //cargar objeto juego
        this.juego.setIdJuego(2);
        RegistrarUsuario regUsuario = new RegistrarUsuario(new javax.swing.JFrame(), true, this.juego);
        regUsuario.setLocationRelativeTo(null);
        regUsuario.setTitle("Registro de jugadores");
        regUsuario.setVisible(true); 
    }//GEN-LAST:event_jbtDosJugadoresActionPerformed

    private void jbtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtSalirActionPerformed

    private void jbtTresJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTresJugadoresActionPerformed
        //cargar objeto juego
        this.juego.setIdJuego(3);
        RegistrarUsuario regUsuario = new RegistrarUsuario(new javax.swing.JFrame(), true, this.juego);
        regUsuario.setLocationRelativeTo(null);
        regUsuario.setTitle("Registro de jugadores");
        regUsuario.setVisible(true);
    }//GEN-LAST:event_jbtTresJugadoresActionPerformed

    private void jbtCuatroJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCuatroJugadoresActionPerformed
        //cargar objeto juego
        this.juego.setIdJuego(4);
        RegistrarUsuario regUsuario = new RegistrarUsuario(new javax.swing.JFrame(), true, this.juego);
        regUsuario.setLocationRelativeTo(null);
        regUsuario.setTitle("Registro de jugadores");
        regUsuario.setVisible(true);
    }//GEN-LAST:event_jbtCuatroJugadoresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtCuatroJugadores;
    private javax.swing.JButton jbtDosJugadores;
    private javax.swing.JButton jbtSalir;
    private javax.swing.JButton jbtTresJugadores;
    // End of variables declaration//GEN-END:variables
}
