package br.com.lojacalcados.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField$AbstractFormatter;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaFuncionário extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField txtIdFuncionario;
	private JTextField txtNomeFuncionario;
	private JTextField txtCargo;
	private JTextField txtSetor;
	private JTextField txtGestor;
	private JTextField txtExpediente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFuncionário frame = new TelaFuncionário();
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
	public TelaFuncionário() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlDP = new JPanel();
		pnlDP.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlDP.setLayout(null);
		pnlDP.setBounds(42, 262, 349, 119);
		contentPane.add(pnlDP);
		
		JLabel lblCpf = new JLabel("CPF do Funcion\u00E1rio:");
		lblCpf.setHorizontalAlignment(SwingConstants.LEFT);
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCpf.setBounds(10, 37, 129, 14);
		pnlDP.add(lblCpf);
		
		JLabel lblDN = new JLabel("Data de Nascimento:");
		lblDN.setHorizontalAlignment(SwingConstants.LEFT);
		lblDN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDN.setBounds(10, 62, 129, 14);
		pnlDP.add(lblDN);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.LEFT);
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSexo.setBounds(10, 87, 46, 18);
		pnlDP.add(lblSexo);
		
		JFormattedTextField txtCPF = new JFormattedTextField((AbstractFormatter) null);
		txtCPF.setBounds(176, 37, 112, 20);
		pnlDP.add(txtCPF);
		
		JFormattedTextField txtDataNascimento = new JFormattedTextField((AbstractFormatter) null);
		txtDataNascimento.setBounds(176, 62, 87, 20);
		pnlDP.add(txtDataNascimento);
		
		JComboBox cboSexo = new JComboBox();
		cboSexo.setBounds(176, 87, 74, 18);
		pnlDP.add(cboSexo);
		
		JPanel pnlContato = new JPanel();
		pnlContato.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlContato.setLayout(null);
		pnlContato.setBounds(439, 262, 308, 119);
		contentPane.add(pnlContato);
		
		JLabel lblTR = new JLabel("Telefone Resid\u00EAncial:");
		lblTR.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTR.setBounds(10, 11, 126, 21);
		pnlContato.add(lblTR);
		
		JLabel lblTCE = new JLabel("Telefone Celular:");
		lblTCE.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTCE.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTCE.setBounds(10, 34, 126, 21);
		pnlContato.add(lblTCE);
		
		JLabel lblTCOR = new JLabel("Telefone Cormecial:");
		lblTCOR.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTCOR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTCOR.setBounds(10, 60, 126, 21);
		pnlContato.add(lblTCOR);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(10, 84, 113, 21);
		pnlContato.add(lblEmail);
		
		JFormattedTextField txtTResidencial = new JFormattedTextField((AbstractFormatter) null);
		txtTResidencial.setBounds(146, 11, 113, 20);
		pnlContato.add(txtTResidencial);
		
		JFormattedTextField txtTCelular = new JFormattedTextField((AbstractFormatter) null);
		txtTCelular.setBounds(146, 34, 113, 20);
		pnlContato.add(txtTCelular);
		
		JFormattedTextField txtTComercial = new JFormattedTextField((AbstractFormatter) null);
		txtTComercial.setBounds(146, 60, 113, 20);
		pnlContato.add(txtTComercial);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(147, 84, 112, 20);
		pnlContato.add(textField_1);
		
		JPanel pnlEndereco = new JPanel();
		pnlEndereco.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlEndereco.setLayout(null);
		pnlEndereco.setBounds(154, 416, 537, 119);
		contentPane.add(pnlEndereco);
		
		JLabel lbltipo = new JLabel("Tipo de logradouro:");
		lbltipo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbltipo.setBounds(10, 11, 114, 14);
		pnlEndereco.add(lbltipo);
		
		JLabel lblcomplemto = new JLabel("Complemento:");
		lblcomplemto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblcomplemto.setBounds(10, 61, 114, 14);
		pnlEndereco.add(lblcomplemto);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCep.setBounds(10, 86, 114, 14);
		pnlEndereco.add(lblCep);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setHorizontalAlignment(SwingConstants.LEFT);
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBairro.setBounds(341, 36, 114, 14);
		pnlEndereco.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setHorizontalAlignment(SwingConstants.LEFT);
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCidade.setBounds(341, 61, 114, 14);
		pnlEndereco.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEstado.setBounds(341, 86, 114, 14);
		pnlEndereco.add(lblEstado);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(123, 58, 108, 20);
		pnlEndereco.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(401, 33, 108, 20);
		pnlEndereco.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(401, 58, 108, 20);
		pnlEndereco.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(401, 83, 108, 20);
		pnlEndereco.add(textField_6);
		
		JComboBox cboTipo = new JComboBox();
		cboTipo.setBounds(123, 7, 108, 22);
		pnlEndereco.add(cboTipo);
		
		JFormattedTextField txtCEP = new JFormattedTextField((AbstractFormatter) null);
		txtCEP.setBounds(123, 83, 108, 20);
		pnlEndereco.add(txtCEP);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLogradouro.setBounds(10, 36, 114, 14);
		pnlEndereco.add(lblLogradouro);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(123, 34, 108, 20);
		pnlEndereco.add(textField_7);
		
		textField_2 = new JTextField();
		textField_2.setBounds(401, 9, 108, 20);
		pnlEndereco.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setBounds(341, 11, 83, 14);
		pnlEndereco.add(lblNumero);
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblIdFuncionario = new JLabel("Id Funcion\u00E1rio:");
		lblIdFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIdFuncionario.setBounds(41, 136, 95, 31);
		contentPane.add(lblIdFuncionario);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCargo.setBounds(296, 220, 95, 31);
		contentPane.add(lblCargo);
		
		JLabel lblSetor = new JLabel("Setor:");
		lblSetor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSetor.setBounds(296, 136, 95, 31);
		contentPane.add(lblSetor);
		
		JLabel lblGestor = new JLabel("Gestor:");
		lblGestor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGestor.setBounds(296, 178, 95, 31);
		contentPane.add(lblGestor);
		
		JLabel lblExpediente = new JLabel("Expediente:");
		lblExpediente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblExpediente.setBounds(41, 220, 95, 31);
		contentPane.add(lblExpediente);
		
		JLabel lblFoto = new JLabel("Foto:");
		lblFoto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFoto.setBounds(566, 142, 95, 31);
		contentPane.add(lblFoto);
		
		txtIdFuncionario = new JTextField();
		txtIdFuncionario.setBounds(154, 142, 86, 20);
		contentPane.add(txtIdFuncionario);
		txtIdFuncionario.setColumns(10);
		
		txtNomeFuncionario = new JTextField();
		txtNomeFuncionario.setColumns(10);
		txtNomeFuncionario.setBounds(154, 184, 86, 20);
		contentPane.add(txtNomeFuncionario);
		
		txtCargo = new JTextField();
		txtCargo.setColumns(10);
		txtCargo.setBounds(154, 225, 86, 20);
		contentPane.add(txtCargo);
		
		txtSetor = new JTextField();
		txtSetor.setColumns(10);
		txtSetor.setBounds(356, 142, 86, 20);
		contentPane.add(txtSetor);
		
		txtGestor = new JTextField();
		txtGestor.setColumns(10);
		txtGestor.setBounds(356, 184, 86, 20);
		contentPane.add(txtGestor);
		
		txtExpediente = new JTextField();
		txtExpediente.setColumns(10);
		txtExpediente.setBounds(356, 226, 86, 20);
		contentPane.add(txtExpediente);
		
		JPanel pnlTitulo = new JPanel();
		pnlTitulo.setLayout(null);
		pnlTitulo.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pnlTitulo.setBackground(Color.RED);
		pnlTitulo.setBounds(0, 0, 821, 125);
		contentPane.add(pnlTitulo);
		
		JLabel lblTelaDeFuncionrios = new JLabel("TELA DE FUNCION\u00C1RIOS");
		lblTelaDeFuncionrios.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTelaDeFuncionrios.setBounds(203, 11, 213, 98);
		pnlTitulo.add(lblTelaDeFuncionrios);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setFont(new Font("Candara", Font.BOLD, 14));
		btnSalvar.setBounds(643, 48, 104, 56);
		pnlTitulo.add(btnSalvar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Verdana", Font.BOLD, 11));
		btnConsultar.setBounds(812, 38, 132, 71);
		pnlTitulo.add(btnConsultar);
		
		JLabel lblNomeFuncionario = new JLabel("Nome Funcion\u00E1rio:");
		lblNomeFuncionario.setBounds(42, 178, 114, 31);
		contentPane.add(lblNomeFuncionario);
		lblNomeFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 12));
	}
}
