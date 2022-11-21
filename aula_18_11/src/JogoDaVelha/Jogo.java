package JogoDaVelha;

import java.awt.*;
import javax.swing.*;

public class Jogo {

    private int contadorJogadas = 0;
    private String jogadoInicial = "X";

    private JButton[][] botoes = {
        {new JButton(), new JButton(), new JButton()},
        {new JButton(), new JButton(), new JButton()},
        {new JButton(), new JButton(), new JButton()},};

    public void show() {
        JFrame frame = new JFrame("Jogo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(3, 3));
        panel.setPreferredSize(new Dimension(500, 500));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton btnAtual = botoes[i][j];
                panel.add(btnAtual);

                btnAtual.addActionListener(e -> {
                    if (btnAtual.getText().equals("")) {
                        btnAtual.setText(jogadoInicial);
                        contadorJogadas++;
                        if (verificarVencedor()) {
                            JOptionPane.showMessageDialog(null, "Venceu!");
                            reiniciar();
                        } else {
                            if (contadorJogadas == 9) {
                                JOptionPane.showMessageDialog(null, "Empate");
                                reiniciar();
                            } else {
                                jogadoInicial = (jogadoInicial.equals("X")) ? "O" : "X";
                            }
                        }
                    }
                });
            }
        }

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public boolean verificarVencedor() {
        String b00 = botoes[0][0].getText();
        String b01 = botoes[0][1].getText();
        String b02 = botoes[0][2].getText();

        String b10 = botoes[1][0].getText();
        String b11 = botoes[1][1].getText();
        String b12 = botoes[1][2].getText();

        String b20 = botoes[2][0].getText();
        String b21 = botoes[2][1].getText();
        String b22 = botoes[2][2].getText();

        //Linhas
        if ((!b00.equals("") && b00.equals(b01) && b00.equals(b02))
                || (!b10.equals("") && b10.equals(b11) && b00.equals(b12))
                || (!b20.equals("") && b20.equals(b21) && b20.equals(b22))) {
            return true;
        } //Colunas
        else if ((!b00.equals("") && b00.equals(b10) && b00.equals(b20))
                || (!b01.equals("") && b00.equals(b11) && b00.equals(b21))
                || (!b02.equals("") && b02.equals(b12) && b00.equals(b22))) {
            return true;
        } else if ((!b00.equals("") && b00.equals(b11) && b00.equals(b22))
                || (!b02.equals("") && b02.equals(b11) && b02.equals(b20))) {
            return true;

        }

        return false;
    }
    public void reiniciar(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botoes[i][j].setText("");
                contadorJogadas = 0;
                jogadoInicial = "X";
            }
        }
    }
}
