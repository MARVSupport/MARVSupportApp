/*
 * The MIT License
 *
 * Copyright 2023 MARVSupport..
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package utils;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

/**
 * Métodos de efeito hover (ao passar o mouse)
 *
 * @author Victor Silva
 * @version 1.0.2
 */
//classe de efeitos Hover (passagem de mouse ou click)
public class HoverEffect {

    boolean temHover = false;

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
