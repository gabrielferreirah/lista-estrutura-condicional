import javax.swing.JOptionPane;

public class ExercicioEstrutura03{
    
    public static void main(String[] args) {
        
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog( "Digite mais um número"));

        double opcao = Double.parseDouble(JOptionPane.showInputDialog("Menu" +
        "\n1            |Somar" +
        "\n2            |Subtrair" +
        "\n3            |Multiplicar" +
        "\n4            |Divisão"
        )
        );

        if (opcao == 1){
            double resultado1 = (numero1 + numero2);
            JOptionPane.showMessageDialog(null,"Resultado: " + numero1 + " + " + numero2 + " = " + resultado1);
        }else if(opcao == 2){
            double resultado2 = (numero1 - numero2);
            JOptionPane.showMessageDialog(null,"Resultado: " + numero1 + " - " + numero2 + " = " + resultado2);
        }else if(opcao == 3){
            double resultado3 = (numero1*numero2);
            JOptionPane.showMessageDialog(null,"Resultado: " + numero1 + " * " + numero2 + " = " + resultado3);
        }else if(opcao==4){
            double resultado4 = (numero1/numero2);
            JOptionPane.showMessageDialog(null,"Resultado: " + numero1 + " / " + numero2 + " = " + resultado4);
        }else{
            JOptionPane.showMessageDialog(null, "Opção não encontrada");
        }
    }
}