/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafezinn;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author vitur
 */
public class Cafezinn 
{

    
    public static void main(String[] args) 
    {
        int Pedido,PedidoFinal,v;
        String tabela  = JOptionPane.showInputDialog(
                "<html> "        + "Menu Do Cafezinho Do Hoff"+ "<br>"
                        +  "*************************" + "<br>"
                        + "Digite 1 Para Cappuchino = 2,00"+ "<br>"
                        + "Digite 2 Para Achocolatado = 3,00 "+ "<br>"
                        + "Digite 3 Para Café Tradicional = 1,00"+ "<br>"
                        + "Digite 4 Para Café Com Creme = 5,00"+ "<br>"
                        +  "*************************"+ "</html>");
        JOptionPane PaneTabela = new JOptionPane();
        PaneTabela.setMessage(tabela);
        PaneTabela.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog=PaneTabela.createDialog(null, "Cafeteria Do HoffBoy");
        dialog.setVisible(true);



        Pedido = Integer.parseInt(tabela);
        switch(Pedido){
            case 1:
                 Pedido = 0 + 2;
                JOptionPane.showMessageDialog(null,"Cappuchino: R$2,00, Foi Adicionado Na Sua Compra:  ");
            break;
            case 2: 
                Pedido = 0 + 3;
                JOptionPane.showMessageDialog(null,"Achocolatado: R$3,00, Foi Adicionado Na Sua Compra:  ");
            break;
            case 3: 
                Pedido = 0 + 1;
                JOptionPane.showMessageDialog(null,"Café Tradicional: R$1,00, Foi Adicionado Na Sua Compra:  ");
            break;
             case 4: 
                Pedido = 0 + 5;
                JOptionPane.showMessageDialog(null,"Café Com Creme: R$5,00, Foi Adicionado Na Sua Compra:  ");
                break;
             default: JOptionPane.showMessageDialog(null,"Você Não Escolheu Nenhuma Bebida!");
        }
        
        
        
        String MaisPedido = JOptionPane.showInputDialog(null,"Deseja algo mais? Digite: 1 para Sim e Digite: 2 para não!");
        v = Integer.parseInt(MaisPedido);
        if(v == 1)
        {
            System.out.println(PaneTabela);
                    switch(v){
                        case 1:
                             PedidoFinal = Pedido + 2;
                             JOptionPane.showMessageDialog(null,"O Valor Total Saiu Por:" + PedidoFinal);
                             break;
                        case 2:
                            PedidoFinal = Pedido + 3;
                            JOptionPane.showMessageDialog(null,"O Valor Total Saiu Por:" + PedidoFinal);
                            break;
                        case 3:
                            PedidoFinal = Pedido + 4;
                             JOptionPane.showMessageDialog(null,"O Valor Total Saiu Por:" + PedidoFinal);
                            break;
                        case 4:
                             PedidoFinal = Pedido + 5;
                             JOptionPane.showMessageDialog(null,"O Valor Total Saiu Por:" + PedidoFinal);
                            break;
                            
                    default: JOptionPane.showMessageDialog(null,"Você Não Escolheu Nenhuma Bebida!");                           
                   }
        }
        else if(v == 2)
        {
            JOptionPane.showMessageDialog(null,"O Valor Total Saiu Por:" + Pedido);
            JOptionPane.showMessageDialog(null,"A Loja De Café Do Hoff Fechou");  
        }
     
    }
    
}
