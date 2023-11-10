
package utils;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;


public class HoverEffect {
    
    // efeito hover nos botões
    public void efeitoHover(JPanel painel, int r, int g, int b) {
        painel.setBackground(new java.awt.Color(r, g, b));
    }

    // efeito hover no separador
    public void efeitoHoverSeparador(JSeparator separador, int r, int g, int b) {
        separador.setBackground(new java.awt.Color(r, g, b));
    }
    
        // efeito hover nos textos
    public void efeitoHoverTextos(JLabel label, int r, int g, int b) {
        label.setForeground(new java.awt.Color(r, g, b));
    }
}
