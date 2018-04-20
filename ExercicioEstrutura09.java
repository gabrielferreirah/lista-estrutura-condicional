import javax.swing.JOptionPane;

public class ExercicioEstrutura09{
   
    public static void main(String[] args) {
       
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do lado A",
         "Quadrado"
        ));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do lado B",
        "Quadrado"
        ));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do lado C",
        "Quadrado"
        ));
        int numero4 = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do lado D",
        "Quadrado"
        ));
        int total = numero1+numero2+numero3+numero4;
        int validacao = total-total;

        if(validacao==0){
            JOptionPane.showMessageDialog(null, "Isso é um quadrado");
        }else{
            JOptionPane.showMessageDialog(null, "Isso não é um quadrado");
        }
    }
}