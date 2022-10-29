package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//clases custom
import Domain.Juego;
import Domain.Jugador;

public class MenuPrincipal extends JFrame implements ActionListener {
    
    //jf
    private PedirInformacion jfPedirInformacion;
    
    //jlb
    private JLabel jlbTotalJugadores;
    
    //jbtn
    private JButton jbtnDosJugadores;
    private JButton jbtnTresJugadores;
    private JButton jbtnCuatroJugadores;

    public MenuPrincipal() {
            this.setSize(800, 600);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);
        init();
    } // constructor

    private void init() {
        
        //init jl
        this.jlbTotalJugadores = new JLabel("Total de Jugadores");
        this.jlbTotalJugadores.setBounds(300,50, 120, 20);
        this.add(this.jlbTotalJugadores);
        
        //init jbtn
        this.jbtnDosJugadores = new JButton("2 Jugadores");
        this.jbtnDosJugadores.setBounds(190, 100, 120, 30);   
        this.jbtnDosJugadores.addActionListener(this);
        this.add(this.jbtnDosJugadores);

        this.jbtnTresJugadores = new JButton("3 Jugadores");
        this.jbtnTresJugadores.setBounds(320, 100, 120, 30);
        this.jbtnTresJugadores.addActionListener(this);
        this.add(this.jbtnTresJugadores);

        this.jbtnCuatroJugadores = new JButton("4 Jugadores");
        this.jbtnCuatroJugadores.setBounds(450, 100, 120, 30);
        this.jbtnCuatroJugadores.addActionListener(this);
        this.add(this.jbtnCuatroJugadores);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.jbtnDosJugadores) {
            System.out.println("Juego para 2 jugadores");
            Juego juegoDosJugadores = new Juego();
            
            //Agregar configuracion al juego
            juegoDosJugadores.setIdJuego(2);
            //asignar tamaño del arreglo de jugadores en el juego
            Jugador[] jugadores = new Jugador[juegoDosJugadores.getIdJuego()];
            //asignar arreglo de jugadores al juego
            juegoDosJugadores.setJugadores(jugadores);
            
            //solicitar informacion de usuario
            for (Jugador jugador : juegoDosJugadores.getJugadores()) {
               this.jfPedirInformacion = new PedirInformacion(juegoDosJugadores);
               this.jfPedirInformacion.setVisible(true); 
            }
                    
        }
        if (ae.getSource() == this.jbtnTresJugadores) {
            System.out.println("Juego para 3 jugadores");
            Juego juego3Jugadores = new Juego();
        }
        if (ae.getSource() == this.jbtnCuatroJugadores) {
            System.out.println("Juego para 4 jugadores");
            Juego juego4Jugadores = new Juego();
        }
    }

}//Fin clase
