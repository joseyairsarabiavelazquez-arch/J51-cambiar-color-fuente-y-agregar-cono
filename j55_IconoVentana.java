import javax.swing.*;
import java.awt.*;

public class j55_IconoVentana {

    public static void main(String[] args) {

        // 1. Crear la ventana
        JFrame frame = new JFrame("Imagen de Argentina");

        // 2. Configurar el tamaño de la ventana
        frame.setSize(450, 350);

        // 3. Cerrar el programa al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 4. Centrar la ventana
        frame.setLocationRelativeTo(null);

        // 5. Cargar la imagen
        ImageIcon iconoCargado = new ImageIcon(
                "C:/Users/pelon/Downloads/Imagen/argentina.JFIF"
        );

        // 6. Comprobar si la imagen se cargó correctamente
        if (iconoCargado.getIconWidth() == -1) {

            JOptionPane.showMessageDialog(
                    frame,
                    "No se pudo cargar la imagen. Verifica la ruta."
            );

            return;
        }

        // 7. Obtener la imagen
        Image imagen = iconoCargado.getImage();

        // 8. Colocar la imagen como ícono de la ventana
        frame.setIconImage(imagen);

        // 9. Crear una etiqueta para mostrar la imagen
        JLabel etiqueta = new JLabel(iconoCargado);

        // 10. Centrar la imagen
        etiqueta.setHorizontalAlignment(JLabel.CENTER);

        // 11. Agregar la imagen a la ventana
        frame.add(etiqueta);

        // 12. Mostrar la ventana
        frame.setVisible(true);
    }
}