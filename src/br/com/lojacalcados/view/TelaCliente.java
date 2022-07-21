package br.com.lojacalcados.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.MaskFormatter;

import br.com.lojacalcados.dao.DAOCliente;
import br.com.lojacalcados.dao.DAOContato;
import br.com.lojacalcados.dao.DAODadosPessoais;
import br.com.lojacalcados.dao.DAOEndereco;
import br.com.lojacalcados.pojo.Cliente;
import br.com.lojacalcados.pojo.Contato;
import br.com.lojacalcados.pojo.DadosPessoais;
import br.com.lojacalcados.pojo.Endereco;

public class TelaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeCliente;
	private JFormattedTextField txtCPF;
	private JFormattedTextField txtDataNascimento;
	private JTextField txtEmail;
	private JFormattedTextField txtTResidencial;
	private JFormattedTextField txtTCelular;
	private JFormattedTextField txtTComercial;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtEstado;
	private JFormattedTextField txtCEP;
	private JTable table;
	private JScrollPane scrollPane;
	// Instância do pojo
	private Cliente cliente = new Cliente();
	private DadosPessoais dp = new DadosPessoais();
	private Contato ct = new Contato();
	private Endereco end = new Endereco();
	// Instância do dao
	private DAOCliente daocli = new DAOCliente();
	private DAODadosPessoais daodp = new DAODadosPessoais();
	private DAOContato daocontato = new DAOContato();
	private DAOEndereco daoend = new DAOEndereco();
	private JTextField txtLogradouro;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente frame = new TelaCliente();
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
	public TelaCliente() {
		setResizable(false);
		setTitle("Tela Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1037, 882);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlTitulo = new JPanel();
		pnlTitulo.setBackground(new Color(102, 102, 102));
		pnlTitulo.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pnlTitulo.setBounds(10, 11, 1001, 144);
		contentPane.add(pnlTitulo);
		pnlTitulo.setLayout(null);
		
		JLabel lblicone = new JLabel("");
		lblicone.setIcon(new ImageIcon("C:\\Users\\nicole.agbranco.SENACEDU\\Documents\\LojaCalcados\\imagens\\user.png"));
		lblicone.setBounds(10, 11, 144, 122);
		pnlTitulo.add(lblicone);
		
		JLabel lblTituloTela = new JLabel("Gerenciar Clientes");
		lblTituloTela.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblTituloTela.setBounds(209, 11, 132, 122);
		pnlTitulo.add(lblTituloTela);
		
		JButton btnSalvar = new JButton("Salvar");
		
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\nicole.agbranco.SENACEDU\\Documents\\LojaCalcados\\imagens\\salve-.png"));
		btnSalvar.setFont(new Font("Verdana", Font.BOLD, 11));
		btnSalvar.setBounds(628, 38, 126, 71);
		pnlTitulo.add(btnSalvar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\nicole.agbranco.SENACEDU\\Documents\\LojaCalcados\\imagens\\lupa.png"));
		btnConsultar.setFont(new Font("Verdana", Font.BOLD, 11));
		btnConsultar.setBounds(812, 38, 132, 71);
		pnlTitulo.add(btnConsultar);
		
		JPanel pnlDP = new JPanel();
		pnlDP.setBounds(34, 166, 432, 208);
		contentPane.add(pnlDP);
		pnlDP.setLayout(null);
		
		JLabel lblNomeCliente = new JLabel("Nome Cliente:");
		lblNomeCliente.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNomeCliente.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeCliente.setBounds(10, 11, 81, 14);
		pnlDP.add(lblNomeCliente);
		
		JLabel lblCpf = new JLabel("CPF do Cliente:");
		lblCpf.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblCpf.setHorizontalAlignment(SwingConstants.LEFT);
		lblCpf.setBounds(10, 37, 96, 14);
		pnlDP.add(lblCpf);
		
		JLabel lblDN = new JLabel("Data de Nascimento:");
		lblDN.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblDN.setHorizontalAlignment(SwingConstants.LEFT);
		lblDN.setBounds(10, 62, 129, 14);
		pnlDP.add(lblDN);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblSexo.setHorizontalAlignment(SwingConstants.LEFT);
		lblSexo.setBounds(10, 87, 46, 18);
		pnlDP.add(lblSexo);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setBounds(176, 11, 86, 20);
		pnlDP.add(txtNomeCliente);
		txtNomeCliente.setColumns(10);
		
		try {
		txtCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		txtCPF.setBounds(176, 37, 86, 20);
		pnlDP.add(txtCPF);
		
		txtDataNascimento = new JFormattedTextField(new MaskFormatter("####-##-##"));
		txtDataNascimento.setBounds(176, 62, 87, 20);
		pnlDP.add(txtDataNascimento);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		JComboBox cboSexo = new JComboBox();
		cboSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino", "Outros"}));
		cboSexo.setBounds(176, 87, 74, 18);
		pnlDP.add(cboSexo);
		
		JPanel pnlContato = new JPanel();
		pnlContato.setBounds(533, 166, 432, 208);
		contentPane.add(pnlContato);
		pnlContato.setLayout(null);
		
		JLabel lblTR = new JLabel("Telefone Resid\u00EAncial:");
		lblTR.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTR.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTR.setBounds(10, 11, 126, 21);
		pnlContato.add(lblTR);
		
		JLabel lblTCE = new JLabel("Telefone Celular:");
		lblTCE.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTCE.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTCE.setBounds(10, 34, 126, 21);
		pnlContato.add(lblTCE);
		
		JLabel lblTCOR = new JLabel("Telefone Cormecial:");
		lblTCOR.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTCOR.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTCOR.setBounds(10, 60, 126, 21);
		pnlContato.add(lblTCOR);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblEmail.setBounds(10, 84, 113, 21);
		pnlContato.add(lblEmail);
		
		
		try {
		txtTResidencial = new JFormattedTextField(new MaskFormatter("(##)####-####"));
		txtTResidencial.setBounds(146, 11, 113, 20);
		pnlContato.add(txtTResidencial);
		
		txtTCelular = new JFormattedTextField(new MaskFormatter("(##) 9####-####"));
		txtTCelular.setBounds(146, 34, 113, 20);
		pnlContato.add(txtTCelular);
		
		txtTComercial = new JFormattedTextField(new MaskFormatter("(##)####-####"));
		txtTComercial.setBounds(146, 60, 113, 20);
		pnlContato.add(txtTComercial);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		txtEmail = new JTextField();
		txtEmail.setBounds(147, 84, 112, 20);
		pnlContato.add(txtEmail);
		txtEmail.setColumns(10);
		
		JPanel pnlEndereco = new JPanel();
		pnlEndereco.setBounds(34, 385, 931, 119);
		contentPane.add(pnlEndereco);
		pnlEndereco.setLayout(null);
		
		JLabel lbltipo = new JLabel("Tipo de logradouro:");
		lbltipo.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lbltipo.setBounds(10, 11, 114, 14);
		pnlEndereco.add(lbltipo);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNumero.setBounds(10, 36, 83, 14);
		pnlEndereco.add(lblNumero);
		
		JLabel lblcomplemto = new JLabel("Complemento:");
		lblcomplemto.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblcomplemto.setBounds(10, 61, 114, 14);
		pnlEndereco.add(lblcomplemto);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblCep.setBounds(10, 86, 114, 14);
		pnlEndereco.add(lblCep);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setHorizontalAlignment(SwingConstants.LEFT);
		lblBairro.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblBairro.setBounds(341, 36, 114, 14);
		pnlEndereco.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setHorizontalAlignment(SwingConstants.LEFT);
		lblCidade.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblCidade.setBounds(341, 61, 114, 14);
		pnlEndereco.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstado.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblEstado.setBounds(341, 86, 114, 14);
		pnlEndereco.add(lblEstado);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(123, 33, 108, 20);
		pnlEndereco.add(txtNumero);
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(123, 58, 108, 20);
		pnlEndereco.add(txtComplemento);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(401, 33, 108, 20);
		pnlEndereco.add(txtBairro);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(401, 58, 108, 20);
		pnlEndereco.add(txtCidade);
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setBounds(401, 83, 108, 20);
		pnlEndereco.add(txtEstado);
		
		JComboBox cboTipo = new JComboBox();
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Rua", "Avenida", "Pra\u00E7a", "Alameda", "Viela", "Estrada", "Travessa"}));
		cboTipo.setBounds(123, 7, 108, 22);
		pnlEndereco.add(cboTipo);
		
		try {
		txtCEP = new JFormattedTextField(new MaskFormatter("#####-###"));
		txtCEP.setBounds(123, 83, 108, 20);
		pnlEndereco.add(txtCEP);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogradouro.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblLogradouro.setBounds(341, 11, 114, 14);
		pnlEndereco.add(lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setColumns(10);
		txtLogradouro.setBounds(411, 8, 108, 20);
		pnlEndereco.add(txtLogradouro);
		
		JPanel pnlClientes = new JPanel();
		pnlClientes.setBounds(34, 515, 931, 315);
		contentPane.add(pnlClientes);
		pnlClientes.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 911, 299);
		pnlClientes.add(scrollPane);
		
		carregarDados();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				end.setTipo(cboTipo.getSelectedItem().toString());
				end.setLogradouro(txtLogradouro.getText());
				end.setNumero(txtNumero.getText());
				end.setComplemento(txtComplemento.getText());
				end.setCep(txtCEP.getText());
				end.setBairro(txtBairro.getText());
				end.setCidade(txtCidade.getText());
				end.setEstado(txtEstado.getText());
				//efetuar a gravação do endereço na tabela
				//o id gerado será alocado em umavariável
				String rse = daoend.create(end);
				
				//passagem dos dados para o objetivo contato
				ct.setTelefoneResidencial(txtTResidencial.getText());
				ct.setTelefoneCelular(txtTCelular.getText());
				ct.setTelefoneComercial(txtTComercial.getText());
				ct.setEmail(txtEmail.getText());
			    String rsc = daocontato.create(ct);
			    
			    //passagem dos dados para  o objetivo dados pessoais
			    dp.setCpf(txtCPF.getText());
			    dp.setDataNascimento(Date.valueOf(txtDataNascimento.getText()));
				dp.setSexo(cboSexo.getSelectedItem().toString());
				String rsdp = daodp.create(dp);
				
				//passagem dos dados para o objetico cliente
				cliente.setNomeCliente(txtNomeCliente.getText());
				
				dp.setIdDadosPessoais(Long.parseLong(rsdp));
			    cliente.setDadosPessoais(dp);
				
			    ct.setIdContato(Long.parseLong(rsc));
				cliente.setContato(ct);
				
				
				end.setIdEndereco(Long.parseLong(rse));
				cliente.setEndereco(end);
				
				
				JOptionPane.showMessageDialog(null,daocli.create(cliente));
				
				carregarDados();
			}
		});
	}

	private void carregarDados() {
		//Construir o cabeçalho da tabela
	     String [] cabecalho = {
	    		 "ID do Cliente",
	    		 "Nome do Cliente",
	    		 "CPF",
	    		 "Tel. Residêncial",
	    		 "Tel. Celular",
	    		 "Tel. Comercial",
	    		 "E-mail",
	    		 "Tipo",
	    		 "Logradouro",
	    		 "Número",
	    		 "Complemento",
	    		 "Cep",
	    		 "Bairro",
	    		 "Cidade",
	    		 "Estado"
	     };
	     
	     List<Cliente> lstcliente = new ArrayList<Cliente>();
			lstcliente = daocli.read();
			Object[] dados = new Object[16];
			DefaultTableModel tm = new DefaultTableModel(cabecalho,0);		
			for(int i = 0 ; i < lstcliente.size() ; i++) {
				
				
				dados[0] = lstcliente.get(i).getIdCliente();
				dados[1] = lstcliente.get(i).getNomeCliente();
				dados[2] = lstcliente.get(i).getDadosPessoais().getCpf();
				dados[3] = lstcliente.get(i).getDadosPessoais().getSexo();
				dados[4] = lstcliente.get(i).getContato().getTelefoneResidencial();
				dados[5] = lstcliente.get(i).getContato().getTelefoneCelular();
				dados[6] = lstcliente.get(i).getContato().getTelefoneComercial();
				dados[7] = lstcliente.get(i).getContato().getEmail();
				dados[8] = lstcliente.get(i).getEndereco().getTipo();
				dados[9] = lstcliente.get(i).getEndereco().getLogradouro();
				
				dados[10] = lstcliente.get(i).getEndereco().getNumero();
				dados[11] = lstcliente.get(i).getEndereco().getComplemento();
				dados[12] = lstcliente.get(i).getEndereco().getCep();
				dados[13] = lstcliente.get(i).getEndereco().getBairro();
				dados[14] = lstcliente.get(i).getEndereco().getCidade();
				dados[15] = lstcliente.get(i).getEndereco().getEstado();
				
				tm.addRow(dados);			
			}
			
			table = new JTable(tm);
				
		scrollPane.setViewportView(table);
	}
}

