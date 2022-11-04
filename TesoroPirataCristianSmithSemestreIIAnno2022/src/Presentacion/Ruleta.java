package Presentacion;

import Dominio.Juego;
import Dominio.Jugador;
import Dominio.NumeroRuleta;
import java.util.LinkedList;
import javax.swing.JDialog;

public class Ruleta extends JDialog {

    private Juego juego;
    private int jugadorRuleta = 0;
    private LinkedList<NumeroRuleta> resultadosRuleta;

    private final int vectorTurnos[] = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    public Ruleta(java.awt.Frame parent, boolean modal, Juego juego) {
        super(parent, modal);
        this.juego = juego;
        this.resultadosRuleta = new LinkedList<>();
        initComponents();
        cargarNombreUsuario();
        bloquerBtnSiguienteJugador();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlInstruccion = new javax.swing.JLabel();
        jlJugador = new javax.swing.JLabel();
        jtfJugador = new javax.swing.JTextField();
        jlNumeroRelato = new javax.swing.JLabel();
        jtfNumeroRuleta = new javax.swing.JTextField();
        jbtGirarRuleta = new javax.swing.JButton();
        jbtSiguienteJugador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ruleta");

        jlInstruccion.setText("La ruleta definirá el turno en el juego de cada jugador");

        jlJugador.setText("Jugador: ");

        jtfJugador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfJugador.setEnabled(false);
        jtfJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfJugadorActionPerformed(evt);
            }
        });

        jlNumeroRelato.setText("Numero en la ruleta:");

        jtfNumeroRuleta.setEnabled(false);

        jbtGirarRuleta.setText("Girar Ruleta");
        jbtGirarRuleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGirarRuletaActionPerformed(evt);
            }
        });

        jbtSiguienteJugador.setText("Siguiente Jugador");
        jbtSiguienteJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSiguienteJugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtGirarRuleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtSiguienteJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlJugador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlInstruccion)
                                    .addComponent(jtfJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jlNumeroRelato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNumeroRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jlInstruccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlJugador)
                    .addComponent(jtfJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumeroRelato)
                    .addComponent(jtfNumeroRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtGirarRuleta)
                    .addComponent(jbtSiguienteJugador))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfJugadorActionPerformed
    }//GEN-LAST:event_jtfJugadorActionPerformed

    private void jbtGirarRuletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGirarRuletaActionPerformed
        if (this.jugadorRuleta < this.juego.getJugadores().size()) {
            this.jbtGirarRuleta.setEnabled(false);

            System.out.println("Id Juego: " + this.juego.getIdJuego());

            //sacar un numero aleatotrio entre 1 y 12 para asignar al jugador actual
            this.jtfNumeroRuleta.setText("" + girarRuleta());

            //asignar numero de ruleta al jugador actual
            this.juego.getJugadores().get(this.jugadorRuleta).setNumeroRuleta(Integer.parseInt(this.jtfNumeroRuleta.getText()));
            System.out.println(this.juego.getJugadores().get(this.jugadorRuleta).toString());

            //llevar registros de los giros 
            NumeroRuleta resultado = new NumeroRuleta(Integer.parseInt(this.jtfNumeroRuleta.getText()),
                    this.juego.getJugadores().get(this.jugadorRuleta).getNombreUsuario());
            this.resultadosRuleta.add(resultado);

            //habilitar boton siguiente jugador
            this.jbtSiguienteJugador.setEnabled(true);
        } else {
            System.out.println("Mostrar turnos");
            establecerTurnos();
        }
    }//GEN-LAST:event_jbtGirarRuletaActionPerformed

    private void jbtSiguienteJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSiguienteJugadorActionPerformed
        if (this.jugadorRuleta < this.juego.getJugadores().size()) {
            this.jugadorRuleta++;
            cargarNombreUsuario();
            bloquerBtnSiguienteJugador();
            this.jbtGirarRuleta.setEnabled(true);
            this.jtfNumeroRuleta.setText("");
        } else {
            System.out.println("Jugadores con numero de ruleta listos");
        }
    }//GEN-LAST:event_jbtSiguienteJugadorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtGirarRuleta;
    private javax.swing.JButton jbtSiguienteJugador;
    private javax.swing.JLabel jlInstruccion;
    private javax.swing.JLabel jlJugador;
    private javax.swing.JLabel jlNumeroRelato;
    private javax.swing.JTextField jtfJugador;
    private javax.swing.JTextField jtfNumeroRuleta;
    // End of variables declaration//GEN-END:variables

    private void cargarNombreUsuario() {
        if (this.jugadorRuleta < this.juego.getJugadores().size()) {
            this.jtfJugador.setText(this.juego.getJugadores().get(this.jugadorRuleta).getNombreUsuario());
        } else {
            //mostrar Turnos
            this.jbtGirarRuleta.setText("Mostrar Turnos");
        }
    }

    private void bloquerBtnSiguienteJugador() {
        this.jbtSiguienteJugador.setEnabled(false);
    }

    private int girarRuleta() {
        return (int) (Math.random() * 12 + 1);
    }

    private void establecerTurnos() {

        int turno = 1;

        switch (this.juego.getIdJuego()) {
            case 2:
                for (int valorTurno : this.vectorTurnos) {
                    if (this.juego.getJugadores().get(0).getNumeroRuleta() == valorTurno) {
                        this.juego.getJugadores().get(0).setTurno(turno);
                        turno++;
                    }
                    if (this.juego.getJugadores().get(1).getNumeroRuleta() == valorTurno) {
                        this.juego.getJugadores().get(1).setTurno(turno);
                        turno++;
                    }
                }
                break;
            case 3:
                for (int valorTurno : this.vectorTurnos) {
                    if (this.juego.getJugadores().get(0).getNumeroRuleta() == valorTurno) {
                        this.juego.getJugadores().get(0).setTurno(turno);
                        turno++;
                    }
                    if (this.juego.getJugadores().get(1).getNumeroRuleta() == valorTurno) {
                        this.juego.getJugadores().get(1).setTurno(turno);
                        turno++;
                    }
                    if (this.juego.getJugadores().get(2).getNumeroRuleta() == valorTurno) {
                        this.juego.getJugadores().get(2).setTurno(turno);
                        turno++;
                    }
                }
                break;
            case 4:
                for (int valorTurno : this.vectorTurnos) {

                    if (this.juego.getJugadores().get(0).getNumeroRuleta() == valorTurno) {
                        this.juego.getJugadores().get(0).setTurno(turno);
                        turno++;
                    }
                    if (this.juego.getJugadores().get(1).getNumeroRuleta() == valorTurno) {
                        this.juego.getJugadores().get(1).setTurno(turno);
                        turno++;
                    }
                    if (this.juego.getJugadores().get(2).getNumeroRuleta() == valorTurno) {
                        this.juego.getJugadores().get(2).setTurno(turno);
                        turno++;
                    }
                    if (this.juego.getJugadores().get(3).getNumeroRuleta() == valorTurno) {
                        this.juego.getJugadores().get(3).setTurno(turno);
                        turno++;
                    }
                }
                break;
        }

        //empezar juego, iniciar graphics
        System.out.println("Turnos cargados");
        for (Jugador jugador : this.juego.getJugadores()) {
            System.out.println(jugador.toString());
        }
        
        //mostrar ventana de graphics
        this.setVisible(false);
                
        JDialog ventanaTablero = new JDialog(new javax.swing.JFrame(), true);
        
        ventanaTablero.setTitle("Tesoro Pirata");
         
        ventanaTablero.add(new Tablero(this.juego));
        ventanaTablero.pack();
        
        ventanaTablero.setLocationRelativeTo(null);
        
        ventanaTablero.setVisible(true);
        
    }
}
