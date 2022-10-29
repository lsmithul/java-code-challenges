package Presentacion;

import Dominio.Avatar;
import Dominio.Juego;
import Dominio.Jugador;
import Dominio.Moneda;
import java.util.LinkedList;

public class RegistrarUsuario extends javax.swing.JDialog {

    private final Avatar avatar;
    private final Juego juego;
    private final Jugador jugador;

    public RegistrarUsuario(java.awt.Frame parent, boolean modal, Juego juego) {
        super(parent, modal);
        this.avatar = new Avatar();
        this.avatar.setIdavatar("");
        this.juego = juego;
        this.juego.setJugadores(new LinkedList<>());
        this.jugador = new Jugador(0, 0);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtMenuPrincipal = new javax.swing.JButton();
        jlJugadorUno = new javax.swing.JLabel();
        jtfJugadorUno = new javax.swing.JTextField();
        jbtAvatarUno = new javax.swing.JButton();
        jbtAvatarDos = new javax.swing.JButton();
        jbtAvatarTres = new javax.swing.JButton();
        jbtAvatarCuatro = new javax.swing.JButton();
        jbtRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jbtMenuPrincipal.setForeground(new java.awt.Color(204, 0, 0));
        jbtMenuPrincipal.setText("Menu Principal");
        jbtMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMenuPrincipalActionPerformed(evt);
            }
        });

        jlJugadorUno.setText("Nombre jugador : ");

        jbtAvatarUno.setText("avatar1");
        jbtAvatarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAvatarUnoActionPerformed(evt);
            }
        });

        jbtAvatarDos.setText("avatar2");
        jbtAvatarDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAvatarDosActionPerformed(evt);
            }
        });

        jbtAvatarTres.setText("avatar3");
        jbtAvatarTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAvatarTresActionPerformed(evt);
            }
        });

        jbtAvatarCuatro.setText("avatar4");
        jbtAvatarCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAvatarCuatroActionPerformed(evt);
            }
        });

        jbtRegistrar.setForeground(new java.awt.Color(51, 153, 0));
        jbtRegistrar.setText("Registrar");
        jbtRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtAvatarTres, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtAvatarCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtAvatarUno, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtAvatarDos, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlJugadorUno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfJugadorUno))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtMenuPrincipal)
                        .addGap(18, 18, 18)
                        .addComponent(jbtRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlJugadorUno)
                    .addComponent(jtfJugadorUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAvatarUno, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtAvatarDos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtAvatarTres, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jbtAvatarCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtMenuPrincipal)
                    .addComponent(jbtRegistrar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMenuPrincipalActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbtMenuPrincipalActionPerformed

    private void jbtAvatarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAvatarUnoActionPerformed
        this.avatar.setIdavatar(jbtAvatarUno.getText());
    }//GEN-LAST:event_jbtAvatarUnoActionPerformed

    private void jbtAvatarDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAvatarDosActionPerformed
        this.avatar.setIdavatar(jbtAvatarDos.getText());
    }//GEN-LAST:event_jbtAvatarDosActionPerformed

    private void jbtAvatarTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAvatarTresActionPerformed
        this.avatar.setIdavatar(jbtAvatarTres.getText());
    }//GEN-LAST:event_jbtAvatarTresActionPerformed

    private void jbtAvatarCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAvatarCuatroActionPerformed
        this.avatar.setIdavatar(jbtAvatarCuatro.getText());
    }//GEN-LAST:event_jbtAvatarCuatroActionPerformed

    private void jbtRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRegistrarActionPerformed
        if (jtfJugadorUno.getText().equalsIgnoreCase("")
                && this.avatar.getIdavatar().equalsIgnoreCase("")) {
            System.out.println("Nombre de jugador y avatar son obligatorios");
        } else {

            //crear jugador con nombre usuario, avatar y monedero
            this.jugador.setNombreUsuario(jtfJugadorUno.getText());
            this.jugador.setAvatar(this.avatar);
            Moneda moneda = new Moneda(jugador.getNombreUsuario());
            LinkedList<Moneda> monedero = new LinkedList<>();
            monedero.add(moneda);
            this.jugador.setMonedero(monedero);

            //guardar jugador en la lista de jugadores del juego
            LinkedList<Jugador> jugadores = this.juego.getJugadores();
            jugadores.add(this.jugador);

            //reiniciar pantalla
            limpiarCampos();

            System.out.println("jugador registrado");
        }
    }//GEN-LAST:event_jbtRegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtAvatarCuatro;
    private javax.swing.JButton jbtAvatarDos;
    private javax.swing.JButton jbtAvatarTres;
    private javax.swing.JButton jbtAvatarUno;
    private javax.swing.JButton jbtMenuPrincipal;
    private javax.swing.JButton jbtRegistrar;
    private javax.swing.JLabel jlJugadorUno;
    private javax.swing.JTextField jtfJugadorUno;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {

    }

    private void mostrarMensaje(String Tipo, String Mensaje) {

    }

    private void reiniciarEstadoBotones(String nombreBoton) {

    }

}
