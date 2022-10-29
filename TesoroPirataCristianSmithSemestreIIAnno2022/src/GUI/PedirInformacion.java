package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//clases custom
import Domain.Jugador;
import Domain.Juego;
import Domain.Avatar;
import Domain.Moneda;

public class PedirInformacion extends JFrame implements ActionListener {

    //JLable
    private JLabel jlbnombreUsuario;
    private JLabel jlbIdAvatar;
    //JText
    private JTextField jtfNombreUsuario;
    //JButton
    private JButton jbtnAvatarUno;
    private JButton jbtnAvatarDos;
    private JButton jbtnAvatarTres;
    private JButton jbtnAvatarCuatro;
    private JButton jbtnGuardar;
    private Juego juego;
    private Jugador jugador;
    private Avatar avatar;
    private Moneda moneda;
    private Moneda[] monedero;

    public PedirInformacion(Juego juego) {
        this.setSize(800, 600);
        this.setLayout(null);
        this.juego = juego;
        init();
    }

    private void init() {
        //Jlabel
        this.jlbnombreUsuario = new JLabel("Ingrese su nombre de usuario");
        this.jlbnombreUsuario.setBounds(300, 50, 200, 20);
        this.add(this.jlbnombreUsuario);

        this.jlbIdAvatar = new JLabel("tbd");
        this.jlbIdAvatar.setBounds(190, 260, 200, 30);
        this.add(this.jlbIdAvatar);

        //Jtext
        this.jtfNombreUsuario = new JTextField();
        this.jtfNombreUsuario.setBounds(320, 80, 100, 20);
        this.add(this.jtfNombreUsuario);
        //Jbutton   
        this.jbtnAvatarUno = new JButton("Avatar 1");
        this.jbtnAvatarUno.setBounds(190, 100, 120, 30);
        this.jbtnAvatarUno.addActionListener(this);
        this.add(this.jbtnAvatarUno);

        this.jbtnAvatarDos = new JButton("Avatar 2");
        this.jbtnAvatarDos.setBounds(190, 140, 120, 30);
        this.jbtnAvatarDos.addActionListener(this);
        this.add(this.jbtnAvatarDos);

        this.jbtnAvatarTres = new JButton("Avatar 3");
        this.jbtnAvatarTres.setBounds(190, 180, 120, 30);
        this.jbtnAvatarTres.addActionListener(this);
        this.add(this.jbtnAvatarTres);

        this.jbtnAvatarCuatro = new JButton("Avatar 4");
        this.jbtnAvatarCuatro.setBounds(190, 220, 120, 30);
        this.jbtnAvatarCuatro.addActionListener(this);
        this.add(this.jbtnAvatarCuatro);

        this.jbtnGuardar = new JButton("Guardar informacion");
        this.jbtnGuardar.setBounds(300, 290, 220, 30);
        this.jbtnGuardar.addActionListener(this);
        this.add(this.jbtnGuardar);
        
        //iniciar config del juego
        
        //1. iniciar vector de jugadores de mi clase juego
        

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.jbtnGuardar) {
            if (this.jtfNombreUsuario.getText().equalsIgnoreCase("")) {
                System.out.println("Nombre de usuario es obligatorio");
            } else {
                //cargamos jugadores
                this.jugador = new Jugador(0, 0);
                this.jugador.setNombreUsuario(this.jtfNombreUsuario.getText());
                this.jugador.setAvatar(this.avatar);

                //crear moneda
                this.moneda = new Moneda();
                this.moneda.setIdMoneda(this.jugador.getNombreUsuario());

                //crear monedero para el jugador
                this.monedero = new Moneda[this.juego.getJugadores().length];

                //agrega la moneda a ese monedero del jugador
                this.monedero[0] = this.moneda;

                //agregar monedero al jugador
                this.jugador.setMonedero(monedero);

                //como luce la informacion del jugador
                this.jugador.toString();

            }
        }

        if (ae.getSource() == this.jbtnAvatarUno) {
            this.avatar = new Avatar(this.jbtnAvatarUno.getText());
            this.jlbIdAvatar.setText("Avatar seleccionado: " + this.avatar.getIdavatar());
        }

        if (ae.getSource() == this.jbtnAvatarDos) {
            this.avatar = new Avatar(this.jbtnAvatarDos.getText());
            this.jlbIdAvatar.setText("Avatar seleccionado: " + this.avatar.getIdavatar());
        }

        if (ae.getSource() == this.jbtnAvatarTres) {
            this.avatar = new Avatar(this.jbtnAvatarTres.getText());
            this.jlbIdAvatar.setText("Avatar seleccionado: " + this.avatar.getIdavatar());
        }

        if (ae.getSource() == this.jbtnAvatarCuatro) {
            this.avatar = new Avatar(this.jbtnAvatarCuatro.getText());
            this.jlbIdAvatar.setText("Avatar seleccionado: " + this.avatar.getIdavatar());
        }
    }

}//Fin clase
