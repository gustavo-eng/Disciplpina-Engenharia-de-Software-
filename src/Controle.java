//Matheus Xavier Soares - 2142651
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mxsoa
 */
public class Controle extends javax.swing.JFrame {
    private BancoProduto bDet = new BancoProduto();
    private Detalhe det = new Detalhe();
    /**
     * Creates new form TelaCadMem
     */
    public Controle() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btInserir = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        rtAddCart = new javax.swing.JLabel();
        rtCod = new javax.swing.JLabel();
        rtNome = new javax.swing.JLabel();
        rtDescricao = new javax.swing.JLabel();
        rtPreco = new javax.swing.JLabel();
        cxCod = new javax.swing.JTextField();
        cxNome = new javax.swing.JTextField();
        cxDescricao = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        btLimparDados = new javax.swing.JButton();
        rtQuantidade = new javax.swing.JLabel();
        cxQuantidade = new javax.swing.JTextField();
        btSomar = new javax.swing.JButton();
        lResultado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnShowProd = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir Produtos no Carrinho");

        btInserir.setText("Inserir no Carrinho");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar ao Menu de Seleção");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir pelo Código");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar pelo Código");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        rtAddCart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rtAddCart.setText("ADICIONAR AO CARRINHO");

        rtCod.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rtCod.setText("Código do Produto:");

        rtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rtNome.setText("Nome:");

        rtDescricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rtDescricao.setText("Descrição:");

        rtPreco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rtPreco.setText("Preço Unitário (R$):");

        cxPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPrecoActionPerformed(evt);
            }
        });

        btLimparDados.setText("Limpar Todos os Dados");
        btLimparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparDadosActionPerformed(evt);
            }
        });

        rtQuantidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rtQuantidade.setText("Quantidade:");

        btSomar.setText("Calcular compra atual");
        btSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSomarActionPerformed(evt);
            }
        });

        lResultado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lResultado.setText("RESULTADO");

        jMenu1.setText("Visualizar");

        mnShowProd.setText("Lista de Produtos");
        mnShowProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnShowProdActionPerformed(evt);
            }
        });
        jMenu1.add(mnShowProd);

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        jMenu1.add(mnSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rtCod)
                            .addComponent(rtPreco)
                            .addComponent(rtDescricao)
                            .addComponent(rtNome)
                            .addComponent(rtQuantidade)
                            .addComponent(btSomar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cxCod, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(cxNome)
                                        .addComponent(cxPreco))
                                    .addComponent(cxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(lResultado)))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(rtAddCart)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimparDados)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(rtAddCart)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCod)
                    .addComponent(cxCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rtNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPreco)
                    .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rtDescricao)
                    .addComponent(cxDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtQuantidade)
                    .addComponent(cxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSomar)
                    .addComponent(lResultado))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btLimparDados)
                    .addComponent(btConsultar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btVoltar))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        cadProd();
    }//GEN-LAST:event_btInserirActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        dispose();
    }//GEN-LAST:event_mnSairActionPerformed

    private void btLimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparDadosActionPerformed
        limparCaixas();
    }//GEN-LAST:event_btLimparDadosActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consProd();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluiProd();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void mnShowProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnShowProdActionPerformed
        new Carrinho().showProd(bDet);
    }//GEN-LAST:event_mnShowProdActionPerformed

    private void btSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSomarActionPerformed
       float resultado =  Float.parseFloat(cxPreco.getText())  * Float.parseFloat(cxQuantidade.getText());
       lResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btSomarActionPerformed

    private void cxPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPrecoActionPerformed
    
    public void consProd(){
        det = new Detalhe();
        try{
            det.setCod(Integer.parseInt(cxCod.getText()));
            det = bDet.consultaDetCod(det);
            if(det != null){
                   cxCod.setText(Integer.toString(det.getCod()));
                   cxNome.setText(det.getNome());
                   cxDescricao.setText(det.getDescricao());
                   cxPreco.setText(Double.toString(det.getPreco()));
                   cxQuantidade.setText(Integer.toString(det.getQuantidade()));
            }
            else{
                JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum produto com esse código!","Erro de Consulta", 0);
                cxCod.setText("");
                cxCod.requestFocus();
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O Código deve ser um número inteiro!","Erro de Entrada", 0);
            cxCod.setText("");
            cxCod.requestFocus();
        }
    }
    
    public void excluiProd(){
        det = new Detalhe();
        
        try{
            det.setCod(Integer.parseInt(cxCod.getText()));
            det = bDet.consultaDetCod(det);
            if (det != null){
                cxCod.setText(Integer.toString(det.getCod()));
                cxNome.setText(det.getNome());
                cxDescricao.setText(det.getDescricao());
                cxPreco.setText(Double.toString(det.getPreco()));
                cxQuantidade.setText(Integer.toString(det.getQuantidade()));
                int opcao = JOptionPane.showConfirmDialog(null, "Você deseja realmente remover do carrinho?","Remover Produto",JOptionPane.YES_NO_CANCEL_OPTION);
                if(opcao == 0){
                    bDet.excluiDet(det);
                    limparCaixas();
                    JOptionPane.showMessageDialog(null, "Remoção realizada com sucesso!","Remover Produto", 1);
                }
                else{
                    limparCaixas();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Não existe um produto cadastrado com esse código!","Erro de Entrada", 0);
                cxCod.setText("");
                cxCod.requestFocus();
            }
            
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O Código deve ser um número inteiro!","Erro de Entrada", 0);
            cxCod.setText("");
            cxCod.requestFocus();
        }
    }
    
    public void limparCaixas(){
        cxCod.setText("");
        cxNome.setText("");
        cxDescricao.setText("");
        cxPreco.setText("");
        cxQuantidade.setText("");
        cxCod.requestFocus();
    }
    
    public void cadProd(){
        det = new Detalhe();
        try{
            det.setCod(Integer.parseInt(cxCod.getText()));
            det.setNome(cxNome.getText());
            det.setDescricao(cxDescricao.getText());
            det.setPreco(Double.parseDouble(cxPreco.getText()));
            det.setQuantidade(Integer.parseInt(cxQuantidade.getText()));
            limparCaixas();
            if(bDet.consultaDetCod(det) == null){
                bDet.getBDDet().add(det);
                JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!","Inserção Realizada com Sucesso", 1);
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O valor deve ser um número!","Erro de Entrada", 0);
            cxCod.setText("");
            cxPreco.setText("");
            cxCod.requestFocus();
        }        
    }
    
    public void showCadProd(){
        this.setVisible(true);
    }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimparDados;
    private javax.swing.JButton btSomar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxCod;
    private javax.swing.JTextField cxDescricao;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxQuantidade;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lResultado;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JMenuItem mnShowProd;
    private javax.swing.JLabel rtAddCart;
    private javax.swing.JLabel rtCod;
    private javax.swing.JLabel rtDescricao;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtPreco;
    private javax.swing.JLabel rtQuantidade;
    // End of variables declaration//GEN-END:variables
}
