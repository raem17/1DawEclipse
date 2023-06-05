package nominas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
/**
 * Clase nominas.
 * @author roger
 */
public class nominas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtSalida;
	private JLabel lblNewLabel;
	private JTextField textFieldNom;
	private JLabel lblNewLabel_1;
	private JTextField textFieldApe;
	private JLabel lblNewLabel_2;
	private JTextField textFieldNIF;
	private JLabel lblNewLabel_3;
	private JTextField textFieldNSS;
	private JLabel lblNewLabel_4;
	private JTextField textFieldTarifaHora;
	private JLabel lblNewLabel_5;
	private JTextField textFieldHoras;
	private JButton btnBoton;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nominas frame = new nominas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public nominas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 126, 414, 223);
			contentPane.add(scrollPane);
			{
				txtSalida = new JTextArea();
				scrollPane.setViewportView(txtSalida);
			}
		}
		{
			lblNewLabel = new JLabel("Nombre:");
			lblNewLabel.setBounds(10, 11, 54, 14);
			contentPane.add(lblNewLabel);
		}
		{
			textFieldNom = new JTextField();
			textFieldNom.setBounds(62, 9, 120, 17);
			contentPane.add(textFieldNom);
			textFieldNom.setColumns(10);
		}
		{
			lblNewLabel_1 = new JLabel("Apellidos:");
			lblNewLabel_1.setBounds(191, 11, 65, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			textFieldApe = new JTextField();
			textFieldApe.setColumns(10);
			textFieldApe.setBounds(254, 9, 120, 17);
			contentPane.add(textFieldApe);
		}
		{
			lblNewLabel_2 = new JLabel("NIF:");
			lblNewLabel_2.setBounds(10, 36, 21, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			textFieldNIF = new JTextField();
			textFieldNIF.setColumns(10);
			textFieldNIF.setBounds(41, 36, 120, 20);
			contentPane.add(textFieldNIF);
		}
		{
			lblNewLabel_3 = new JLabel("NSS:");
			lblNewLabel_3.setBounds(171, 36, 35, 14);
			contentPane.add(lblNewLabel_3);
		}
		{
			textFieldNSS = new JTextField();
			textFieldNSS.setColumns(10);
			textFieldNSS.setBounds(201, 36, 120, 20);
			contentPane.add(textFieldNSS);
		}
		{
			lblNewLabel_4 = new JLabel("Tarifa (€ / h):");
			lblNewLabel_4.setBounds(10, 70, 76, 14);
			contentPane.add(lblNewLabel_4);
		}
		{
			textFieldTarifaHora = new JTextField();
			textFieldTarifaHora.setColumns(10);
			textFieldTarifaHora.setBounds(96, 67, 65, 20);
			contentPane.add(textFieldTarifaHora);
		}
		{
			lblNewLabel_5 = new JLabel("Horas trabajadas:");
			lblNewLabel_5.setBounds(174, 70, 108, 14);
			contentPane.add(lblNewLabel_5);
		}
		{
			textFieldHoras = new JTextField();
			textFieldHoras.setColumns(10);
			textFieldHoras.setBounds(283, 67, 65, 20);
			contentPane.add(textFieldHoras);
		}
		{
			btnBoton = new JButton("Generar nómina");
			// Algoritmo a realizar al pulsar el botón
			btnBoton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String nom = textFieldNom.getText();
					String ape = textFieldApe.getText();
					String nif = textFieldNIF.getText();
					String nss = textFieldNSS.getText();
					double tarifaHora = Double.parseDouble(textFieldTarifaHora.getText());
					double horas = Double.parseDouble(textFieldHoras.getText());
					
					// Operaciones
					double salarioBase = horas * tarifaHora;
					double bonificacion = calcularBonificacion(horas, salarioBase);
					double salarioBruto = salarioBase + bonificacion;
					double retenciones = salarioBruto * 0.15;
					double salarioNeto = salarioBruto - retenciones;	
					
					// Salidas
					txtSalida.append("Nombre: " + nom + "\n");
					txtSalida.append("Apellidos: " + ape + "\n");
					txtSalida.append("NIF: " + nif + "\n");
					txtSalida.append("NSS: " + nss + "\n");
					txtSalida.append("Salario base: " + salarioBase + " €" + "\n");
					txtSalida.append("Bonificación: " + bonificacion + " €" + "\n");
					txtSalida.append("Salario bruto: " + salarioBruto + " €" + "\n");
					txtSalida.append("Retenciones: " + retenciones + " €" + "\n");
					txtSalida.append("Salario Neto: " + salarioNeto + " €" + "\n");
				}
			});
			btnBoton.setBounds(10, 95, 129, 23);
			contentPane.add(btnBoton);
		}
	}
	
	// Métodos
	/**
	 * Devuelve la bonificación calculada según las horas y salarioBase pasados por parámetro.
	 * @param horas Las horas.
	 * @param salarioBase El salario base.
	 * @return La bonificación calculada.
	 */
	static double calcularBonificacion (double horas, double salarioBase) {
		double bonificacion = 0.0;
		if (horas >= 1 && horas <= 10) {
			bonificacion = salarioBase * 0.05;
			
		} else if (horas >= 11 && horas <= 20) {
			bonificacion = salarioBase * 0.1;
			
		} else if (horas > 20) {
			bonificacion = salarioBase * 0.3;
		}
		
		return bonificacion;
	}
}
