/*
 *implementado 18 octubre 2014
 *autor Jorge Lopez Courrau
 *
 */
package vista;

import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class VentanaRegistro extends JFrame {
    /*
     *@brief SIGETI ventana registro
     *
     *en esta ventana los usuarios pueden registrarse como usuario estandar
     */
   
    //--o--
    private static VentanaRegistro instancia = null;

    public VentanaRegistro() {
        super("SISTEMA GESTIÓN DE TICKETS - SIGETI - Registro de Usuarios");
        ajustarConfiguracionInicial();
        ajustarComponentes(getContentPane());
        ajustarEventos();
    }//----------------------------------------------------------END_Constructor

    public static VentanaRegistro obtenerInstancia() {//asi garantizamos que solo aya una ventana
        if (instancia == null) {
            instancia = new VentanaRegistro();
        }
        return instancia;
    }//-----------------------------------------------------END_obtenerInstancia

    private void ajustarConfiguracionInicial() {
        setSize(650, 380);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                cerrarAplicacion();
            }
        });
        cambioIcono();
    }//----------------------------------------------------------END_ConfInicial

    public void cambioIcono() {//establece el icono de la aplicacion
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/App-Office-Word-Proccesser-iconx128.png"));
        setIconImage(icon);
    }//----------------------------------------------------------END_cambioIcono

    public void mostrar() {//para mostar el JFRAME
        setLocationRelativeTo(null);
        this.setVisible(true);
        repaint();
    }//--------------------------------------------------------------END_MOSTRAR

    public void ocultar() {// oculta la ventana de ser necesario
        this.setVisible(false);
    }//--------------------------------------------------------------END_OCULTAR

    private void ajustarComponentes(Container c) {
        c.add(PanelRegistrar.obtenerInstancia());        
    }//----------------------------------------------------------END_AjustarComp

    private void ajustarEventos() {
    }//----------------------------------------------------------END_AjustarEven

    public void cerrarAplicacion() {//mensaje de confirmacion para dar fin a la ejecucion de la aplicacion        
        if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(this, "¿Desea cerrar la aplicación?", "Cerrar", JOptionPane.YES_NO_OPTION)) {
            System.exit(0);
        }
    }//-----------------------------------------------------END_cerrarAplicacion

}//_____________________________________________________________________________
