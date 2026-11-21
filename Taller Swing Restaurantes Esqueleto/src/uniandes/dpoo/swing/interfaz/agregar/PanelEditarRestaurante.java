package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        setLayout( new GridLayout( 3, 1 ) );

        txtNombre = new JTextField( 15 );
        cbbCalificacion = new JComboBox<String>( new String[]{ "1", "2", "3", "4", "5" } );
        cbbVisitado = new JComboBox<String>( new String[]{ "No", "Sí" } );

        JPanel pNombre = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        pNombre.add( new JLabel( "Nombre" ) );
        pNombre.add( txtNombre );

        JPanel pCalif = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        pCalif.add( new JLabel( "Calificación" ) );
        pCalif.add( cbbCalificacion );

        JPanel pVisitado = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        pVisitado.add( new JLabel( "Visitado" ) );
        pVisitado.add( cbbVisitado );

        add( pNombre );
        add( pCalif );
        add( pVisitado );
    }

    public boolean getVisitado( )
    {
        return cbbVisitado.getSelectedIndex( ) == 1;   // índice 1 = "Sí" (evita problemas con la tilde)
    }


    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        return txtNombre.getText( );
    }
}
