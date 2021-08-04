package tela;

import Entidades.Aluno;
import Entidades.Curso;
import Entidades.Disciplina;
import Entidades.Professor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Larissa Solino
 */
public class Principal extends javax.swing.JFrame {

    ArrayList<Professor> ListaPro;
    ArrayList<Aluno> ListaAlu;
    ArrayList<Curso> ListaCur;
    ArrayList<Disciplina> ListaDis;
    String modoPro;
    String modoAlu;
    String modoCur;
    String modoDis;

    public void LoadTablePro() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome", "Endereço", "Telefone", "CPF", "Salário", "Titulação", "Área de Pesquisa"}, 0);

        for (int i = 0; i < ListaPro.size(); i++) {
            Object linha[] = new Object[]{ListaPro.get(i).getNome(),
                ListaPro.get(i).getEndereco(),
                ListaPro.get(i).getTelefone(),
                ListaPro.get(i).getCpf(),
                ListaPro.get(i).getSalario(),
                ListaPro.get(i).getTitulacao(),
                ListaPro.get(i).getAreaPesquisa()};
            modelo.addRow(linha);
        }

        tbl_pro_profs.setModel(modelo);
        tbl_pro_profs.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_pro_profs.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbl_pro_profs.getColumnModel().getColumn(2).setPreferredWidth(20);
        tbl_pro_profs.getColumnModel().getColumn(3).setPreferredWidth(15);
        tbl_pro_profs.getColumnModel().getColumn(4).setPreferredWidth(20);
        tbl_pro_profs.getColumnModel().getColumn(5).setPreferredWidth(100);
        tbl_pro_profs.getColumnModel().getColumn(6).setPreferredWidth(100);

    }

    public void LoadTableAlu() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome", "Matrícula", "CPF"}, 0);

        for (int i = 0; i < ListaAlu.size(); i++) {
            Aluno aluno = ListaAlu.get(i);
            Object linha[] = new Object[]{
                aluno.getNome(),
                aluno.getMatricula(),
                aluno.getCpf()
            };

            modelo.addRow(linha);
        }

        tbl_alu_alus.setModel(modelo);
        tbl_alu_alus.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_alu_alus.getColumnModel().getColumn(1).setPreferredWidth(100);
        tbl_alu_alus.getColumnModel().getColumn(2).setPreferredWidth(20);

    }

    public void LoadTableCur() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Código", "Nome", "Duração"}, 0);

        for (int i = 0; i < ListaCur.size(); i++) {
            Object linha[] = new Object[]{ListaCur.get(i).getCodigo(),
                ListaCur.get(i).getNome(),
                ListaCur.get(i).getDuracao()};
            modelo.addRow(linha);
        }

        tbl_cur_curs.setModel(modelo);
        tbl_cur_curs.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_cur_curs.getColumnModel().getColumn(1).setPreferredWidth(100);
        tbl_cur_curs.getColumnModel().getColumn(2).setPreferredWidth(20);

    }

    public void LoadTableDis() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Código", "Nome", "Carga Horária"}, 0);

        for (int i = 0; i < ListaDis.size(); i++) {
            Object linha[] = new Object[]{ListaDis.get(i).getCodigo(),
                ListaDis.get(i).getNome(),
                ListaDis.get(i).getCargaHoraria()};
            modelo.addRow(linha);
        }

        tbl_dis_discs.setModel(modelo);
        tbl_dis_discs.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_dis_discs.getColumnModel().getColumn(1).setPreferredWidth(100);
        tbl_dis_discs.getColumnModel().getColumn(2).setPreferredWidth(20);

    }

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        ListaPro = new ArrayList();
        ListaAlu = new ArrayList();
        ListaCur = new ArrayList();
        ListaDis = new ArrayList();
        modoPro = "Navegar";
        modoAlu = "Navegar";
        modoCur = "Navegar";
        modoDis = "Navegar";
        ManipulaInterfacePro();
        ManipulaInterfaceAlu();
        ManipulaInterfaceCur();
        ManipulaInterfaceDis();
    }

    public void ManipulaInterfacePro() {
        switch (modoPro) {
            case "Navegar":
                btn_pro_salvar.setEnabled(false);
                btn_pro_cancelar.setEnabled(false);
                c_pro_nome.setEnabled(false);
                c_pro_endereco.setEnabled(false);
                c_pro_telefone.setEnabled(false);
                c_pro_cpf.setEnabled(false);
                c_pro_salario.setEnabled(false);
                c_pro_titulacao.setEnabled(false);
                c_pro_areapesquisa.setEnabled(false);
                btn_pro_novo.setEnabled(true);
                btn_pro_editar.setEnabled(false);
                btn_pro_excluir.setEnabled(false);
                break;

            case "Novo":
                btn_pro_salvar.setEnabled(true);
                btn_pro_cancelar.setEnabled(true);
                c_pro_nome.setEnabled(true);
                c_pro_endereco.setEnabled(true);
                c_pro_telefone.setEnabled(true);
                c_pro_cpf.setEnabled(true);
                c_pro_salario.setEnabled(true);
                c_pro_titulacao.setEnabled(true);
                c_pro_areapesquisa.setEnabled(true);
                btn_pro_novo.setEnabled(false);
                btn_pro_editar.setEnabled(false);
                btn_pro_excluir.setEnabled(false);
                break;

            case "Editar":
                btn_pro_salvar.setEnabled(true);
                btn_pro_cancelar.setEnabled(true);
                c_pro_nome.setEnabled(true);
                c_pro_endereco.setEnabled(true);
                c_pro_telefone.setEnabled(true);
                c_pro_cpf.setEnabled(true);
                c_pro_salario.setEnabled(true);
                c_pro_titulacao.setEnabled(true);
                c_pro_areapesquisa.setEnabled(true);
                btn_pro_novo.setEnabled(true);
                btn_pro_editar.setEnabled(false);
                btn_pro_excluir.setEnabled(false);
                break;

            case "Excluir":
                btn_pro_salvar.setEnabled(false);
                btn_pro_cancelar.setEnabled(false);
                c_pro_nome.setEnabled(false);
                c_pro_endereco.setEnabled(false);
                c_pro_telefone.setEnabled(false);
                c_pro_cpf.setEnabled(false);
                c_pro_salario.setEnabled(false);
                c_pro_titulacao.setEnabled(false);
                c_pro_areapesquisa.setEnabled(false);
                btn_pro_novo.setEnabled(true);
                btn_pro_editar.setEnabled(false);
                btn_pro_excluir.setEnabled(false);
                break;

            case "Selecao":
                btn_pro_salvar.setEnabled(false);
                btn_pro_cancelar.setEnabled(false);
                c_pro_nome.setEnabled(false);
                c_pro_endereco.setEnabled(false);
                c_pro_telefone.setEnabled(false);
                c_pro_cpf.setEnabled(false);
                c_pro_salario.setEnabled(false);
                c_pro_titulacao.setEnabled(false);
                c_pro_areapesquisa.setEnabled(false);
                btn_pro_novo.setEnabled(true);
                btn_pro_editar.setEnabled(true);
                btn_pro_excluir.setEnabled(true);
                break;
            default:
                System.out.println("Modo inválido");
        }
    }

    public void ManipulaInterfaceAlu() {
        switch (modoAlu) {
            case "Navegar":
                btn_alu_salvar.setEnabled(false);
                btn_alu_cancelar.setEnabled(false);
                c_alu_nome.setEnabled(false);
                c_alu_matricula.setEnabled(false);
                c_alu_cpf.setEnabled(false);
                btn_alu_novo.setEnabled(true);
                btn_alu_editar.setEnabled(false);
                btn_alu_excluir.setEnabled(false);
                break;

            case "Novo":
                btn_alu_salvar.setEnabled(true);
                btn_alu_cancelar.setEnabled(true);
                c_alu_nome.setEnabled(true);
                c_alu_matricula.setEnabled(true);
                c_alu_cpf.setEnabled(true);
                btn_alu_novo.setEnabled(false);
                btn_alu_editar.setEnabled(false);
                btn_alu_excluir.setEnabled(false);
                break;

            case "Editar":
                btn_alu_salvar.setEnabled(true);
                btn_alu_cancelar.setEnabled(true);
                c_alu_nome.setEnabled(true);
                c_alu_matricula.setEnabled(true);
                c_alu_cpf.setEnabled(true);
                btn_alu_novo.setEnabled(true);
                btn_alu_editar.setEnabled(false);
                btn_alu_excluir.setEnabled(false);
                break;

            case "Excluir":
                btn_alu_salvar.setEnabled(false);
                btn_alu_cancelar.setEnabled(false);
                c_alu_nome.setEnabled(false);
                c_alu_matricula.setEnabled(false);
                c_alu_cpf.setEnabled(false);
                btn_alu_novo.setEnabled(true);
                btn_alu_editar.setEnabled(false);
                btn_alu_excluir.setEnabled(false);
                break;

            case "Selecao":
                btn_alu_salvar.setEnabled(false);
                btn_alu_cancelar.setEnabled(false);
                c_alu_nome.setEnabled(false);
                c_alu_matricula.setEnabled(false);
                c_alu_cpf.setEnabled(false);
                btn_alu_novo.setEnabled(true);
                btn_alu_editar.setEnabled(true);
                btn_alu_excluir.setEnabled(true);
                break;
            default:
                System.out.println("Modo inválido");
        }
    }

    public void ManipulaInterfaceCur() {
        switch (modoCur) {
            case "Navegar":
                btn_cur_salvar.setEnabled(false);
                btn_cur_cancelar.setEnabled(false);
                c_cur_codigo.setEnabled(false);
                c_cur_nome.setEnabled(false);
                c_cur_duracao.setEnabled(false);
                btn_cur_novo.setEnabled(true);
                btn_cur_editar.setEnabled(false);
                btn_cur_excluir.setEnabled(false);
                break;

            case "Novo":
                btn_cur_salvar.setEnabled(true);
                btn_cur_cancelar.setEnabled(true);
                c_cur_codigo.setEnabled(true);
                c_cur_nome.setEnabled(true);
                c_cur_duracao.setEnabled(true);
                btn_cur_novo.setEnabled(false);
                btn_cur_editar.setEnabled(false);
                btn_cur_excluir.setEnabled(false);
                break;

            case "Editar":
                btn_cur_salvar.setEnabled(true);
                btn_cur_cancelar.setEnabled(true);
                c_cur_codigo.setEnabled(true);
                c_cur_nome.setEnabled(true);
                c_cur_duracao.setEnabled(true);
                btn_cur_novo.setEnabled(true);
                btn_cur_editar.setEnabled(false);
                btn_cur_excluir.setEnabled(false);
                break;

            case "Excluir":
                btn_cur_salvar.setEnabled(false);
                btn_cur_cancelar.setEnabled(false);
                c_cur_codigo.setEnabled(false);
                c_cur_nome.setEnabled(false);
                c_cur_duracao.setEnabled(false);
                btn_cur_novo.setEnabled(true);
                btn_cur_editar.setEnabled(false);
                btn_cur_excluir.setEnabled(false);
                break;

            case "Selecao":
                btn_cur_salvar.setEnabled(false);
                btn_cur_cancelar.setEnabled(false);
                c_cur_codigo.setEnabled(false);
                c_cur_nome.setEnabled(false);
                c_cur_duracao.setEnabled(false);
                btn_cur_novo.setEnabled(true);
                btn_cur_editar.setEnabled(true);
                btn_cur_excluir.setEnabled(true);
                break;
            default:
                System.out.println("Modo inválido");
        }
    }

    public void ManipulaInterfaceDis() {
        switch (modoDis) {
            case "Navegar":
                btn_dis_salvar.setEnabled(false);
                btn_dis_cancelar.setEnabled(false);
                c_dis_codigo.setEnabled(false);
                c_dis_nome.setEnabled(false);
                c_dis_cargahoraria.setEnabled(false);
                btn_dis_novo.setEnabled(true);
                btn_dis_editar.setEnabled(false);
                btn_dis_excluir.setEnabled(false);
                break;

            case "Novo":
                btn_dis_salvar.setEnabled(true);
                btn_dis_cancelar.setEnabled(true);
                c_dis_codigo.setEnabled(true);
                c_dis_nome.setEnabled(true);
                c_dis_cargahoraria.setEnabled(true);
                btn_dis_novo.setEnabled(false);
                btn_dis_editar.setEnabled(false);
                btn_dis_excluir.setEnabled(false);
                break;

            case "Editar":
                btn_dis_salvar.setEnabled(true);
                btn_dis_cancelar.setEnabled(true);
                c_dis_codigo.setEnabled(true);
                c_dis_nome.setEnabled(true);
                c_dis_cargahoraria.setEnabled(true);
                btn_dis_novo.setEnabled(true);
                btn_dis_editar.setEnabled(false);
                btn_dis_excluir.setEnabled(false);
                break;

            case "Excluir":
                btn_dis_salvar.setEnabled(false);
                btn_dis_cancelar.setEnabled(false);
                c_dis_codigo.setEnabled(false);
                c_dis_nome.setEnabled(false);
                c_dis_cargahoraria.setEnabled(false);
                btn_dis_novo.setEnabled(true);
                btn_dis_editar.setEnabled(false);
                btn_dis_excluir.setEnabled(false);
                break;

            case "Selecao":
                btn_dis_salvar.setEnabled(false);
                btn_dis_cancelar.setEnabled(false);
                c_dis_codigo.setEnabled(false);
                c_dis_nome.setEnabled(false);
                c_dis_cargahoraria.setEnabled(false);
                btn_dis_novo.setEnabled(true);
                btn_dis_editar.setEnabled(true);
                btn_dis_excluir.setEnabled(true);
                break;
            default:
                System.out.println("Modo inválido");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jMenu1 = new javax.swing.JMenu();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTabbedPane1_pro = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pro_profs = new javax.swing.JTable();
        btn_pro_novo = new javax.swing.JButton();
        btn_pro_editar = new javax.swing.JButton();
        btn_pro_excluir = new javax.swing.JButton();
        cb_pro_profs = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        c_pro_nome = new javax.swing.JTextField();
        c_pro_endereco = new javax.swing.JTextField();
        c_pro_telefone = new javax.swing.JTextField();
        c_pro_cpf = new javax.swing.JTextField();
        c_pro_salario = new javax.swing.JTextField();
        c_pro_titulacao = new javax.swing.JTextField();
        c_pro_areapesquisa = new javax.swing.JTextField();
        btn_pro_salvar = new javax.swing.JButton();
        btn_pro_cancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_alu_alus = new javax.swing.JTable();
        btn_alu_novo = new javax.swing.JButton();
        btn_alu_editar = new javax.swing.JButton();
        btn_alu_excluir = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c_alu_nome = new javax.swing.JTextField();
        c_alu_matricula = new javax.swing.JTextField();
        c_alu_cpf = new javax.swing.JTextField();
        btn_alu_salvar = new javax.swing.JButton();
        btn_alu_cancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_cur_curs = new javax.swing.JTable();
        btn_cur_novo = new javax.swing.JButton();
        btn_cur_editar = new javax.swing.JButton();
        btn_cur_excluir = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        c_cur_codigo = new javax.swing.JTextField();
        c_cur_nome = new javax.swing.JTextField();
        c_cur_duracao = new javax.swing.JTextField();
        btn_cur_salvar = new javax.swing.JButton();
        btn_cur_cancelar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_dis_discs = new javax.swing.JTable();
        btn_dis_novo = new javax.swing.JButton();
        btn_dis_editar = new javax.swing.JButton();
        btn_dis_excluir = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        c_dis_codigo = new javax.swing.JTextField();
        c_dis_nome = new javax.swing.JTextField();
        c_dis_cargahoraria = new javax.swing.JTextField();
        btn_dis_salvar = new javax.swing.JButton();
        btn_dis_cancelar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1_pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1_proMouseClicked(evt);
            }
        });

        tbl_pro_profs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Endereço", "Telefone", "CPF", "Salário", "Titulação", "Área de Pesquisa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_pro_profs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pro_profsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_pro_profs);

        btn_pro_novo.setText("Novo");
        btn_pro_novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pro_novoMouseClicked(evt);
            }
        });
        btn_pro_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pro_novoActionPerformed(evt);
            }
        });

        btn_pro_editar.setText("Editar");
        btn_pro_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pro_editarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pro_editarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pro_editarMouseExited(evt);
            }
        });
        btn_pro_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pro_editarActionPerformed(evt);
            }
        });

        btn_pro_excluir.setText("Excluir");
        btn_pro_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pro_excluirMouseClicked(evt);
            }
        });
        btn_pro_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pro_excluirActionPerformed(evt);
            }
        });

        cb_pro_profs.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Professor"));
        cb_pro_profs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_pro_profsMouseClicked(evt);
            }
        });

        jLabel8.setText("Nome:");

        jLabel9.setText("Endereço:");

        jLabel10.setText("Telefone:");

        jLabel11.setText("CPF:");

        jLabel12.setText("Salário:");

        jLabel13.setText("Titulação:");

        jLabel14.setText("Área de Pesquisa:");

        c_pro_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_pro_nomeActionPerformed(evt);
            }
        });

        c_pro_endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_pro_enderecoActionPerformed(evt);
            }
        });

        c_pro_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_pro_telefoneActionPerformed(evt);
            }
        });

        c_pro_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_pro_cpfActionPerformed(evt);
            }
        });

        c_pro_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_pro_salarioActionPerformed(evt);
            }
        });

        c_pro_titulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_pro_titulacaoActionPerformed(evt);
            }
        });

        c_pro_areapesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_pro_areapesquisaActionPerformed(evt);
            }
        });

        btn_pro_salvar.setText("Salvar");
        btn_pro_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pro_salvarMouseClicked(evt);
            }
        });
        btn_pro_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pro_salvarActionPerformed(evt);
            }
        });

        btn_pro_cancelar.setText("Cancelar");
        btn_pro_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pro_cancelarMouseClicked(evt);
            }
        });
        btn_pro_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pro_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cb_pro_profsLayout = new javax.swing.GroupLayout(cb_pro_profs);
        cb_pro_profs.setLayout(cb_pro_profsLayout);
        cb_pro_profsLayout.setHorizontalGroup(
            cb_pro_profsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cb_pro_profsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cb_pro_profsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(cb_pro_profsLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(68, 68, 68)
                        .addComponent(c_pro_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cb_pro_profsLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(50, 50, 50)
                        .addComponent(c_pro_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cb_pro_profsLayout.createSequentialGroup()
                        .addGroup(cb_pro_profsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_pro_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cb_pro_profsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cb_pro_profsLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(c_pro_areapesquisa))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cb_pro_profsLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(52, 52, 52)
                                    .addComponent(c_pro_titulacao))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cb_pro_profsLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(53, 53, 53)
                                    .addComponent(c_pro_telefone))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cb_pro_profsLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(76, 76, 76)
                                    .addGroup(cb_pro_profsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(c_pro_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c_pro_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(116, 116, 116)
                        .addComponent(btn_pro_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cb_pro_profsLayout.setVerticalGroup(
            cb_pro_profsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cb_pro_profsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cb_pro_profsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_pro_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cb_pro_profsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(c_pro_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cb_pro_profsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(c_pro_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cb_pro_profsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(c_pro_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cb_pro_profsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(c_pro_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cb_pro_profsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(c_pro_titulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cb_pro_profsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(c_pro_areapesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(cb_pro_profsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pro_salvar)
                    .addComponent(btn_pro_cancelar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cb_pro_profs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_pro_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_pro_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btn_pro_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pro_novo)
                    .addComponent(btn_pro_editar)
                    .addComponent(btn_pro_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_pro_profs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1_pro.addTab("Professor", jPanel2);

        tbl_alu_alus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Matricula", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_alu_alus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_alu_alusMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_alu_alus);

        btn_alu_novo.setText("Novo");
        btn_alu_novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_alu_novoMouseClicked(evt);
            }
        });
        btn_alu_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alu_novoActionPerformed(evt);
            }
        });

        btn_alu_editar.setText("Editar");
        btn_alu_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_alu_editarMouseClicked(evt);
            }
        });
        btn_alu_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alu_editarActionPerformed(evt);
            }
        });

        btn_alu_excluir.setText("Excluir");
        btn_alu_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_alu_excluirMouseClicked(evt);
            }
        });
        btn_alu_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alu_excluirActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Aluno"));

        jLabel1.setText("Nome:");

        jLabel2.setText("Matricula:");

        jLabel3.setText("CPF:");

        c_alu_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_alu_nomeActionPerformed(evt);
            }
        });

        c_alu_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_alu_matriculaActionPerformed(evt);
            }
        });

        c_alu_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_alu_cpfActionPerformed(evt);
            }
        });

        btn_alu_salvar.setText("Salvar");
        btn_alu_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alu_salvarActionPerformed(evt);
            }
        });

        btn_alu_cancelar.setText("Cancelar");
        btn_alu_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alu_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(c_alu_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(c_alu_matricula, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(c_alu_cpf)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btn_alu_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(btn_alu_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_alu_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(c_alu_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c_alu_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alu_salvar)
                    .addComponent(btn_alu_cancelar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(btn_alu_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(btn_alu_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_alu_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alu_novo)
                    .addComponent(btn_alu_editar)
                    .addComponent(btn_alu_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1_pro.addTab("Aluno", jPanel3);

        tbl_cur_curs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Duração"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_cur_curs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_cur_cursMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_cur_curs);

        btn_cur_novo.setText("Novo");
        btn_cur_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cur_novoActionPerformed(evt);
            }
        });

        btn_cur_editar.setText("Editar");
        btn_cur_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cur_editarActionPerformed(evt);
            }
        });

        btn_cur_excluir.setText("Excluir");
        btn_cur_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cur_excluirActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Curso"));

        jLabel4.setText("Código:");

        jLabel5.setText("Nome:");

        jLabel6.setText("Duração:");

        c_cur_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cur_codigoActionPerformed(evt);
            }
        });

        c_cur_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cur_nomeActionPerformed(evt);
            }
        });

        c_cur_duracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cur_duracaoActionPerformed(evt);
            }
        });

        btn_cur_salvar.setText("Salvar");
        btn_cur_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cur_salvarMouseClicked(evt);
            }
        });
        btn_cur_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cur_salvarActionPerformed(evt);
            }
        });

        btn_cur_cancelar.setText("Cancelar");
        btn_cur_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cur_cancelarMouseClicked(evt);
            }
        });
        btn_cur_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cur_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_cur_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_cur_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_cur_duracao, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btn_cur_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btn_cur_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c_cur_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_cur_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_cur_duracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(52, 52, 52)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cur_salvar)
                    .addComponent(btn_cur_cancelar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cur_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_cur_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btn_cur_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cur_novo)
                    .addComponent(btn_cur_editar)
                    .addComponent(btn_cur_excluir))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1_pro.addTab("Curso", jPanel4);

        tbl_dis_discs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CargaHorária"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_dis_discs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dis_discsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_dis_discs);

        btn_dis_novo.setText("Novo");
        btn_dis_novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dis_novoMouseClicked(evt);
            }
        });
        btn_dis_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dis_novoActionPerformed(evt);
            }
        });

        btn_dis_editar.setText("Editar");
        btn_dis_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dis_editarMouseClicked(evt);
            }
        });
        btn_dis_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dis_editarActionPerformed(evt);
            }
        });

        btn_dis_excluir.setText("Excluir");
        btn_dis_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dis_excluirMouseClicked(evt);
            }
        });
        btn_dis_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dis_excluirActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Disciplina"));

        jLabel7.setText("Código:");

        jLabel15.setText("Nome:");

        jLabel16.setText("Carga Horária:");

        c_dis_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_dis_codigoActionPerformed(evt);
            }
        });

        c_dis_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_dis_nomeActionPerformed(evt);
            }
        });

        c_dis_cargahoraria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_dis_cargahorariaActionPerformed(evt);
            }
        });

        btn_dis_salvar.setText("Salvar");
        btn_dis_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dis_salvarMouseClicked(evt);
            }
        });
        btn_dis_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dis_salvarActionPerformed(evt);
            }
        });

        btn_dis_cancelar.setText("Cancelar");
        btn_dis_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dis_cancelarMouseClicked(evt);
            }
        });
        btn_dis_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dis_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_dis_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_dis_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_dis_cargahoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addComponent(btn_dis_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(c_dis_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(c_dis_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(c_dis_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(c_dis_cargahoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dis_salvar)
                    .addComponent(btn_dis_cancelar))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btn_dis_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(btn_dis_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(btn_dis_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dis_novo)
                    .addComponent(btn_dis_editar)
                    .addComponent(btn_dis_excluir))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1_pro.addTab("Disciplina", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1_pro, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1_pro)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pro_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pro_novoActionPerformed
        c_pro_nome.setText("");
        c_pro_endereco.setText("");
        c_pro_telefone.setText("");
        c_pro_cpf.setText("");
        c_pro_salario.setText("");
        c_pro_titulacao.setText("");
        c_pro_areapesquisa.setText("");
        modoPro = "Novo";
        ManipulaInterfacePro();
    }//GEN-LAST:event_btn_pro_novoActionPerformed

    private void c_pro_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_pro_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_pro_nomeActionPerformed

    private void c_pro_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_pro_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_pro_cpfActionPerformed

    private void c_cur_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cur_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_cur_codigoActionPerformed

    private void c_cur_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cur_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_cur_nomeActionPerformed

    private void c_cur_duracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cur_duracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_cur_duracaoActionPerformed

    private void btn_alu_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alu_novoActionPerformed
        c_alu_nome.setText("");
        c_alu_matricula.setText("");
        c_alu_cpf.setText("");
        modoAlu = "Novo";
        ManipulaInterfaceAlu();
    }//GEN-LAST:event_btn_alu_novoActionPerformed

    private void btn_pro_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pro_editarActionPerformed
        modoPro = "Editar";
        ManipulaInterfacePro();
    }//GEN-LAST:event_btn_pro_editarActionPerformed

    private void btn_pro_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pro_excluirActionPerformed
        int index = tbl_pro_profs.getSelectedRow();
        if (index >= 0 && index < ListaPro.size()) {
            ListaPro.remove(index);
        }
        LoadTablePro();
        modoPro = "Navegar";
        ManipulaInterfacePro();
    }//GEN-LAST:event_btn_pro_excluirActionPerformed

    private void btn_pro_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pro_salvarActionPerformed
        Double salario = Double.parseDouble(c_pro_salario.getText());
        Professor professor = new Professor(c_pro_nome.getText(),
                c_pro_endereco.getText(), c_pro_telefone.getText(),
                c_pro_cpf.getText(), salario, c_pro_titulacao.getText(),
                c_pro_areapesquisa.getText());
        ListaPro.add(professor);
        LoadTablePro();
        modoPro = "Navegar";
        ManipulaInterfacePro();
        c_pro_nome.setText("");
        c_pro_endereco.setText("");
        c_pro_telefone.setText("");
        c_pro_cpf.setText("");
        c_pro_salario.setText("");
        c_pro_titulacao.setText("");
        c_pro_areapesquisa.setText("");
    }//GEN-LAST:event_btn_pro_salvarActionPerformed

    private void btn_pro_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pro_cancelarActionPerformed
        c_pro_nome.setText("");
        c_pro_endereco.setText("");
        c_pro_telefone.setText("");
        c_pro_cpf.setText("");
        c_pro_salario.setText("");
        c_pro_titulacao.setText("");
        c_pro_areapesquisa.setText("");
        modoPro = "Navegar";
        ManipulaInterfacePro();
    }//GEN-LAST:event_btn_pro_cancelarActionPerformed

    private void c_pro_enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_pro_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_pro_enderecoActionPerformed

    private void c_pro_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_pro_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_pro_telefoneActionPerformed

    private void c_pro_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_pro_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_pro_salarioActionPerformed

    private void c_pro_titulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_pro_titulacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_pro_titulacaoActionPerformed

    private void c_pro_areapesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_pro_areapesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_pro_areapesquisaActionPerformed

    private void btn_alu_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alu_editarActionPerformed
        modoAlu = "Editar";
        ManipulaInterfaceAlu();
    }//GEN-LAST:event_btn_alu_editarActionPerformed

    private void btn_alu_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alu_excluirActionPerformed
        modoAlu = "Navegar";
        ManipulaInterfaceAlu();
    }//GEN-LAST:event_btn_alu_excluirActionPerformed

    private void btn_alu_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alu_salvarActionPerformed
        Integer matricula = Integer.parseInt(c_alu_matricula.getText());
        Aluno aluno = new Aluno(c_alu_nome.getText(), matricula,
                c_alu_cpf.getText());
        ListaAlu.add(aluno);
        LoadTableAlu();
        modoAlu = "Navegar";
        ManipulaInterfaceAlu();
        c_alu_nome.setText("");
        c_alu_matricula.setText("");
        c_alu_cpf.setText("");

     }//GEN-LAST:event_btn_alu_salvarActionPerformed

    private void btn_alu_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alu_cancelarActionPerformed
        c_alu_nome.setText("");
        c_alu_matricula.setText("");
        c_alu_cpf.setText("");
        modoAlu = "Navegar";
        ManipulaInterfaceAlu();
    }//GEN-LAST:event_btn_alu_cancelarActionPerformed

    private void c_alu_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_alu_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_alu_nomeActionPerformed

    private void c_alu_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_alu_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_alu_matriculaActionPerformed

    private void c_alu_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_alu_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_alu_cpfActionPerformed

    private void btn_cur_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cur_novoActionPerformed
        c_cur_codigo.setText("");
        c_cur_nome.setText("");
        c_cur_duracao.setText("");
        modoCur = "Novo";
        ManipulaInterfaceCur();
    }//GEN-LAST:event_btn_cur_novoActionPerformed

    private void btn_cur_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cur_editarActionPerformed
        modoCur = "Editar";
        ManipulaInterfaceCur();
    }//GEN-LAST:event_btn_cur_editarActionPerformed

    private void btn_cur_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cur_excluirActionPerformed
        modoCur = "Navegar";
        ManipulaInterfaceCur();
    }//GEN-LAST:event_btn_cur_excluirActionPerformed

    private void btn_cur_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cur_salvarActionPerformed
        Integer duracao = Integer.parseInt(c_cur_duracao.getText());
        Curso curso = new Curso(c_cur_codigo.getText(), c_cur_nome.getText(),
                duracao);
        ListaCur.add(curso);
        LoadTableCur();
        modoCur = "Navegar";
        ManipulaInterfaceCur();
        c_cur_codigo.setText("");
        c_cur_nome.setText("");
        c_cur_duracao.setText("");
    }//GEN-LAST:event_btn_cur_salvarActionPerformed

    private void btn_cur_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cur_cancelarActionPerformed
        c_cur_codigo.setText("");
        c_cur_nome.setText("");
        c_cur_duracao.setText("");
        modoCur = "Navegar";
        ManipulaInterfaceCur();
    }//GEN-LAST:event_btn_cur_cancelarActionPerformed

    private void btn_dis_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dis_novoActionPerformed
        c_dis_codigo.setText("");
        c_dis_nome.setText("");
        c_dis_cargahoraria.setText("");
        modoDis = "Novo";
        ManipulaInterfaceDis();
    }//GEN-LAST:event_btn_dis_novoActionPerformed

    private void btn_dis_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dis_editarActionPerformed
        modoDis = "Editar";
        ManipulaInterfaceDis();
    }//GEN-LAST:event_btn_dis_editarActionPerformed

    private void btn_dis_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dis_excluirActionPerformed
        modoDis = "Navegar";
        ManipulaInterfaceDis();
    }//GEN-LAST:event_btn_dis_excluirActionPerformed

    private void btn_dis_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dis_salvarActionPerformed
        Integer cargahoraria = Integer.parseInt(c_dis_cargahoraria.getText());
        Disciplina disciplina = new Disciplina(c_dis_codigo.getText(),
                c_dis_nome.getText(), cargahoraria);
        ListaDis.add(disciplina);
        LoadTableDis();
        modoDis = "Navegar";
        ManipulaInterfaceDis();
        c_dis_codigo.setText("");
        c_dis_nome.setText("");
        c_dis_cargahoraria.setText("");
    }//GEN-LAST:event_btn_dis_salvarActionPerformed

    private void btn_dis_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dis_cancelarActionPerformed
        c_dis_codigo.setText("");
        c_dis_nome.setText("");
        c_dis_cargahoraria.setText("");
        modoDis = "Navegar";
        ManipulaInterfaceDis();
    }//GEN-LAST:event_btn_dis_cancelarActionPerformed

    private void c_dis_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_dis_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_dis_codigoActionPerformed

    private void c_dis_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_dis_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_dis_nomeActionPerformed

    private void c_dis_cargahorariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_dis_cargahorariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_dis_cargahorariaActionPerformed

    private void btn_pro_novoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pro_novoMouseClicked
        int index = tbl_pro_profs.getSelectedRow();
        if (index >= 0 && index < ListaPro.size()) {
            Professor professor = ListaPro.get(index);
            c_pro_nome.setText(String.valueOf(professor.getNome()));
            c_pro_endereco.setText(professor.getEndereco());
            c_pro_telefone.setText(professor.getTelefone());
            String salario = "";
            c_pro_cpf.setText((String) professor.getCpf());
            c_pro_titulacao.setText(professor.getTitulacao());
            c_pro_areapesquisa.setText(professor.getAreaPesquisa());
            modoPro = "Selecao";
            ManipulaInterfacePro();
        }
    }//GEN-LAST:event_btn_pro_novoMouseClicked

    private void btn_pro_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pro_editarMouseClicked
        atualizar_tbl_pro_profs();
        int linhaSelecionada = tbl_pro_profs.getSelectedRow();
        Object valor = tbl_pro_profs.getValueAt(linhaSelecionada, 0);
        int Professor;
        Professor = Integer.parseInt(valor.toString());
    }//GEN-LAST:event_btn_pro_editarMouseClicked

    private void btn_pro_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pro_excluirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pro_excluirMouseClicked

    private void btn_pro_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pro_salvarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pro_salvarMouseClicked

    private void btn_pro_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pro_cancelarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pro_cancelarMouseClicked

    private void btn_alu_novoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alu_novoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_alu_novoMouseClicked

    private void btn_alu_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alu_editarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_alu_editarMouseClicked

    private void btn_alu_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alu_excluirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_alu_excluirMouseClicked

    private void jTabbedPane1_proMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1_proMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1_proMouseClicked

    private void btn_cur_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cur_salvarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cur_salvarMouseClicked

    private void btn_cur_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cur_cancelarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cur_cancelarMouseClicked

    private void btn_dis_novoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dis_novoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dis_novoMouseClicked

    private void btn_dis_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dis_editarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dis_editarMouseClicked

    private void btn_dis_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dis_excluirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dis_excluirMouseClicked

    private void btn_dis_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dis_salvarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dis_salvarMouseClicked

    private void btn_dis_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dis_cancelarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dis_cancelarMouseClicked

    private void tbl_dis_discsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dis_discsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_dis_discsMouseClicked

    private void tbl_cur_cursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cur_cursMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_cur_cursMouseClicked

    private void tbl_alu_alusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_alu_alusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_alu_alusMouseClicked

    private void tbl_pro_profsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pro_profsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_pro_profsMouseClicked

    private void cb_pro_profsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_pro_profsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_pro_profsMouseClicked

    private void btn_pro_editarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pro_editarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pro_editarMouseEntered

    private void btn_pro_editarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pro_editarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pro_editarMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alu_cancelar;
    private javax.swing.JButton btn_alu_editar;
    private javax.swing.JButton btn_alu_excluir;
    private javax.swing.JButton btn_alu_novo;
    private javax.swing.JButton btn_alu_salvar;
    private javax.swing.JButton btn_cur_cancelar;
    private javax.swing.JButton btn_cur_editar;
    private javax.swing.JButton btn_cur_excluir;
    private javax.swing.JButton btn_cur_novo;
    private javax.swing.JButton btn_cur_salvar;
    private javax.swing.JButton btn_dis_cancelar;
    private javax.swing.JButton btn_dis_editar;
    private javax.swing.JButton btn_dis_excluir;
    private javax.swing.JButton btn_dis_novo;
    private javax.swing.JButton btn_dis_salvar;
    private javax.swing.JButton btn_pro_cancelar;
    private javax.swing.JButton btn_pro_editar;
    private javax.swing.JButton btn_pro_excluir;
    private javax.swing.JButton btn_pro_novo;
    private javax.swing.JButton btn_pro_salvar;
    private javax.swing.JTextField c_alu_cpf;
    private javax.swing.JTextField c_alu_matricula;
    private javax.swing.JTextField c_alu_nome;
    private javax.swing.JTextField c_cur_codigo;
    private javax.swing.JTextField c_cur_duracao;
    private javax.swing.JTextField c_cur_nome;
    private javax.swing.JTextField c_dis_cargahoraria;
    private javax.swing.JTextField c_dis_codigo;
    private javax.swing.JTextField c_dis_nome;
    private javax.swing.JTextField c_pro_areapesquisa;
    private javax.swing.JTextField c_pro_cpf;
    private javax.swing.JTextField c_pro_endereco;
    private javax.swing.JTextField c_pro_nome;
    private javax.swing.JTextField c_pro_salario;
    private javax.swing.JTextField c_pro_telefone;
    private javax.swing.JTextField c_pro_titulacao;
    private javax.swing.JPanel cb_pro_profs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1_pro;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tbl_alu_alus;
    private javax.swing.JTable tbl_cur_curs;
    private javax.swing.JTable tbl_dis_discs;
    private javax.swing.JTable tbl_pro_profs;
    // End of variables declaration//GEN-END:variables

    private void atualizar_tbl_pro_profs() {
        throw new UnsupportedOperationException("Not supported yet.");
//To change body of generated methods, choose Tools | Templates.
    }
}
