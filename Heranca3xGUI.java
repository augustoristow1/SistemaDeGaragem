import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Heranca3xGUI extends JFrame {

    private JTextArea outputArea;

    public Heranca3xGUI() {
        setTitle("Sistema de Cadastro de Veículos - Herança3x");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane abas = new JTabbedPane();

        abas.add("Veículo", painelVeiculo());
        abas.add("Ônibus", painelOnibus());
        abas.add("Caminhão", painelCaminhao());

        outputArea = new JTextArea(10, 70);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scroll = new JScrollPane(outputArea);

        add(abas, BorderLayout.CENTER);
        add(scroll, BorderLayout.SOUTH);
    }

    private JPanel painelVeiculo() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblPlaca = new JLabel("Placa:");
        JTextField txtPlaca = new JTextField();

        JLabel lblAno = new JLabel("Ano de Fabricação:");
        JTextField txtAno = new JTextField();

        JButton btnAdicionar = new JButton("Cadastrar Veículo");

        btnAdicionar.addActionListener(e -> {
            String placa = txtPlaca.getText();
            int ano = Integer.parseInt(txtAno.getText());

            Veiculo v = new Veiculo(placa, ano);
            outputArea.append(">>> VEÍCULO:\n");
            outputArea.append("A placa do veículo é " + v.getPlaca() + " e o ano de fabricação é " + v.getAno() + "\n\n");
        });

        panel.add(lblPlaca);
        panel.add(txtPlaca);
        panel.add(lblAno);
        panel.add(txtAno);
        panel.add(new JLabel());
        panel.add(btnAdicionar);

        return panel;
    }

    private JPanel painelOnibus() {
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblPlaca = new JLabel("Placa:");
        JTextField txtPlaca = new JTextField();

        JLabel lblAno = new JLabel("Ano de Fabricação:");
        JTextField txtAno = new JTextField();

        JLabel lblAssentos = new JLabel("Quantidade de Assentos:");
        JTextField txtAssentos = new JTextField();

        JButton btnAdicionar = new JButton("Cadastrar Ônibus");

        btnAdicionar.addActionListener(e -> {
            String placa = txtPlaca.getText();
            int ano = Integer.parseInt(txtAno.getText());
            int assentos = Integer.parseInt(txtAssentos.getText());

            Onibus o = new Onibus(placa, ano, assentos);
            outputArea.append(">>> ÔNIBUS:\n");
            outputArea.append("A placa do veículo é " + o.getPlaca() + " e o ano de fabricação é " + o.getAno() + ", a quantidade de assentos é " + o.getAssentos() + "\n\n");
        });

        panel.add(lblPlaca);
        panel.add(txtPlaca);
        panel.add(lblAno);
        panel.add(txtAno);
        panel.add(lblAssentos);
        panel.add(txtAssentos);
        panel.add(new JLabel());
        panel.add(btnAdicionar);

        return panel;
    }

    private JPanel painelCaminhao() {
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblPlaca = new JLabel("Placa:");
        JTextField txtPlaca = new JTextField();

        JLabel lblAno = new JLabel("Ano de Fabricação:");
        JTextField txtAno = new JTextField();

        JLabel lblEixos = new JLabel("Quantidade de Eixos:");
        JTextField txtEixos = new JTextField();

        JButton btnAdicionar = new JButton("Cadastrar Caminhão");

        btnAdicionar.addActionListener(e -> {
            String placa = txtPlaca.getText();
            int ano = Integer.parseInt(txtAno.getText());
            int eixos = Integer.parseInt(txtEixos.getText());

            Caminhao c = new Caminhao(placa, ano, eixos);
            outputArea.append(">>> CAMINHÃO:\n");
            outputArea.append("A placa do veículo é " + c.getPlaca() + " e o ano de fabricação é " + c.getAno() + ", a quantidade de eixos é " + c.getEixos() + "\n\n");
        });

        panel.add(lblPlaca);
        panel.add(txtPlaca);
        panel.add(lblAno);
        panel.add(txtAno);
        panel.add(lblEixos);
        panel.add(txtEixos);
        panel.add(new JLabel());
        panel.add(btnAdicionar);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Heranca3xGUI().setVisible(true));
    }
}
