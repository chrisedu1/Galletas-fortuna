import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

public class galletas {
    public static void main(String[] args){
        Random random = new Random();
        
        List<String> fortuna  = new ArrayList<>();
        fortuna.add("Encontraras el amor de tu vida");
        fortuna.add("Galletas de la fortuna");
        fortuna.add("Ella nunca te amo");
        fortuna.add("Hola Ingeniero");
        fortuna.add("Futuro Inge");


        JFrame ventana = new JFrame("Rueda de la fortuna");

        ventana.setSize(500,500);

        ventana.setVisible(true);


        JButton btnFortuna = new JButton("Clickeame");
        
        


        btnFortuna.addActionListener(e -> 
    btnFortuna.setText(fortuna.get(random.nextInt(fortuna.size())))
);

        ventana.add(btnFortuna);
    }
    
}