import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIPrograM extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton button;
    private JTextArea textArea;

    public GUIProgram() {
        // Configurações básicas da janela
        setTitle("Exemplo de GUI com Handler e Listener");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout
        setLayout(new BorderLayout());

        // Componentes
        textField = new JTextField();
        button = new JButton("Clique Aqui!");
        textArea = new JTextArea();

        // Adicionando os componentes à janela
        add(textField, BorderLayout.NORTH);
        add(button, BorderLayout.CENTER);
        add(new JScrollPane(textArea), BorderLayout.SOUTH);

        // Adicionando o listener ao botão
        button.addActionListener(this);
    }

    // Método de tratamento de evento
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // Ação quando o botão é clicado
            String text = textField.getText();
            textArea.append(text + "\n");
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUIProgram gui = new GUIProgram();
                gui.setVisible(true);
            }
        });
    }
}
