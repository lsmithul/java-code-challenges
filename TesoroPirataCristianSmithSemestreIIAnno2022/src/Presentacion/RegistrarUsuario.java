package Presentacion;

import Dominio.Avatar;
import Dominio.Juego;
import Dominio.Jugador;
import Dominio.Moneda;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class RegistrarUsuario extends javax.swing.JDialog {

    private Juego juego;
    private Jugador jugador;
    private String avatarSeleccionado;

    public RegistrarUsuario(java.awt.Frame parent, boolean modal, Juego juego) {
        super(parent, modal);
        this.juego = juego;
        this.juego.setJugadores(new LinkedList<>());
        this.jugador = new Jugador();
        this.avatarSeleccionado = "";
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtMenuPrincipal = new javax.swing.JButton();
        jlJugador = new javax.swing.JLabel();
        jtfJugador = new javax.swing.JTextField();
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

        jlJugador.setText("Nombre jugador : ");

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
                        .addComponent(jlJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfJugador))
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
                    .addComponent(jlJugador)
                    .addComponent(jtfJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        this.avatarSeleccionado = jbtAvatarUno.getText();
        reiniciarEstadoBotones("jbtAvatarUno");
    }//GEN-LAST:event_jbtAvatarUnoActionPerformed

    private void jbtAvatarDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAvatarDosActionPerformed
        this.avatarSeleccionado = jbtAvatarDos.getText();
        reiniciarEstadoBotones("jbtAvatarDos");
    }//GEN-LAST:event_jbtAvatarDosActionPerformed

    private void jbtAvatarTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAvatarTresActionPerformed
        this.avatarSeleccionado = jbtAvatarTres.getText();
        reiniciarEstadoBotones("jbtAvatarTres");
    }//GEN-LAST:event_jbtAvatarTresActionPerformed

    private void jbtAvatarCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAvatarCuatroActionPerformed
        this.avatarSeleccionado = jbtAvatarCuatro.getText();
        reiniciarEstadoBotones("jbtAvatarCuatro");
    }//GEN-LAST:event_jbtAvatarCuatroActionPerformed

    private void jbtRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRegistrarActionPerformed
        if (jtfJugador.getText().equalsIgnoreCase("")
                ||  this.avatarSeleccionado.equalsIgnoreCase("")) {
            mostrarMensaje("Nombre de jugador y avatar son obligatorios", 2);
        } else {
            //valida cantidad de jugadores resgistrados
            if (validarCantidadJugadores()) {
                //valida si ya el nombre de usuario existe
                if (existeJugador(jtfJugador.getText())) {
                    mostrarMensaje("Jugador ya esta registrado", 0);
                } else {
                    //crear jugador con nombre usuario, avatar y monedero
                    this.jugador = new Jugador();
                    this.jugador.setNombreUsuario(jtfJugador.getText());
                    //asingar avatar
                    Avatar avatar = new Avatar(this.avatarSeleccionado);
                    this.jugador.setAvatar(avatar);
                    //agregar moneda al monedero
                    Moneda moneda = new Moneda(jugador.getNombreUsuario());
                    LinkedList<Moneda> monedero = new LinkedList<>();
                    monedero.add(moneda);
                    this.jugador.setMonedero(monedero);

                    //guardar jugador en la lista de jugadores del juego
                    LinkedList<Jugador> jugadores = this.juego.getJugadores();
                    jugadores.add(this.jugador);

                    mostrarMensaje("jugador registrado: " + this.jugador.getNombreUsuario(), 1);
                    System.out.println("jugador registrado: " + this.jugador.toString());

                    this.avatarSeleccionado = "";
                    limpiarCampos();
                }

            } else {
                mostrarMensaje("Limite de jugadores alcanzado.", 0);
            }

        }
        
        //listo para tirar ruleta?
        if(partidaLista()){
            //ocultar registro de jugadores
            this.setVisible(false); 
            
            mostrarMensaje("Jugadores listos, se mostrara la pantalla de tirar ruleta", 1);
            
            //iniciar Jdialog de ruleta
            System.out.println("Iniciando ruleta...");
            Ruleta ruleta = new Ruleta(new javax.swing.JFrame(), true, this.juego);
            ruleta.setLocationRelativeTo(null);
            ruleta.setVisible(true);
                         
        }else{
            System.out.println("todavia faltan jugadores para tirar ruleta..");
        }
        
    }//GEN-LAST:event_jbtRegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtAvatarCuatro;
    private javax.swing.JButton jbtAvatarDos;
    private javax.swing.JButton jbtAvatarTres;
    private javax.swing.JButton jbtAvatarUno;
    private javax.swing.JButton jbtMenuPrincipal;
    private javax.swing.JButton jbtRegistrar;
    private javax.swing.JLabel jlJugador;
    private javax.swing.JTextField jtfJugador;
    // End of variables declaration//GEN-END:variables

    private boolean validarCantidadJugadores() {
        if (this.juego.getJugadores().size() < this.juego.getIdJuego()) {
            return true;
        }
        return false;
    }

    //valida el nombre de usuario, busca en la lista de jugadores registrados 
    //actualmente en mi objeto Juego y valida comparando la lista
    private boolean existeJugador(String nombreDeUsuario) {

        boolean yaExisteJugador = false;

        for (Jugador jugador : this.juego.getJugadores()) {
            if (jugador.getNombreUsuario().equalsIgnoreCase(nombreDeUsuario)) {
                yaExisteJugador = true;
            }
        }

        return yaExisteJugador;
    }

    //limpia los campos 
    private void limpiarCampos() {
        jtfJugador.setText("");
        jbtAvatarUno.setEnabled(true);
        jbtAvatarDos.setEnabled(true);
        jbtAvatarTres.setEnabled(true);
        jbtAvatarCuatro.setEnabled(true);
    }

    //muestra mensaje para el usuario
    private void mostrarMensaje(String mensaje, int messageType) {
        //error = 0
        //info = 1
        //warning = 2
        JOptionPane.showMessageDialog(null, mensaje, "Atencion", messageType);
    }

    //reinicia el estado de los botones 
    private void reiniciarEstadoBotones(String nombreBoton) {
        switch (nombreBoton) {
            case "jbtAvatarUno":
                jbtAvatarUno.setEnabled(false);
                jbtAvatarDos.setEnabled(true);
                jbtAvatarTres.setEnabled(true);
                jbtAvatarCuatro.setEnabled(true);
                break;
            case "jbtAvatarDos":
                jbtAvatarUno.setEnabled(true);
                jbtAvatarDos.setEnabled(false);
                jbtAvatarTres.setEnabled(true);
                jbtAvatarCuatro.setEnabled(true);
                break;
            case "jbtAvatarTres":
                jbtAvatarUno.setEnabled(true);
                jbtAvatarDos.setEnabled(true);
                jbtAvatarTres.setEnabled(false);
                jbtAvatarCuatro.setEnabled(true);
                break;
            case "jbtAvatarCuatro":
                jbtAvatarUno.setEnabled(true);
                jbtAvatarDos.setEnabled(true);
                jbtAvatarTres.setEnabled(true);
                jbtAvatarCuatro.setEnabled(false);
                break;
        }
    }
    
    //verifica si la partida esta lista para iniciar la ruleta
    private boolean partidaLista(){
        boolean laPartidaEstaLista = false; 
        if(this.juego.getJugadores().size() == this.juego.getIdJuego()){
            laPartidaEstaLista = true;
        }
        return laPartidaEstaLista;
    }
}
