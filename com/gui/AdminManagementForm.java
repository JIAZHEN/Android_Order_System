/*
 * AdminManagementForm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.gui;

/**
 *
 * @author  __USER__
 */
public class AdminManagementForm extends javax.swing.JFrame {

	private MenuManagement menuManagement;
	private StuffManagementPanel stuffManagementPanel;

	/** Creates new form AdminManagementForm */
	public AdminManagementForm() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		btnMenuManagement = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		pnlContend = new javax.swing.JPanel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenuItem6 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/com/images/stuffmanagement.png"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("经典宋体简", 0, 12));
		jLabel1.setText("\u4eba\u5458\u7ba1\u7406");

		btnMenuManagement.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/com/images/menu.png"))); // NOI18N
		btnMenuManagement
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						btnMenuManagementActionPerformed(evt);
					}
				});

		jLabel2.setFont(new java.awt.Font("经典宋体简", 0, 12));
		jLabel2.setText("\u83dc\u5355\u7ba1\u7406");

		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/com/images/interface.png"))); // NOI18N

		jLabel4.setFont(new java.awt.Font("经典宋体简", 0, 12));
		jLabel4.setText("\u754c\u9762\u7ba1\u7406");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				91,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(42,
																				42,
																				42)
																		.addComponent(
																				btnMenuManagement,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				91,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(49,
																				49,
																				49)
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				91,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(20,
																				20,
																				20)
																		.addComponent(
																				jLabel1)
																		.addGap(84,
																				84,
																				84)
																		.addComponent(
																				jLabel2)
																		.addGap(95,
																				95,
																				95)
																		.addComponent(
																				jLabel4)))
										.addContainerGap(687, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				69,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel1)
																						.addComponent(
																								jLabel2)))
														.addComponent(
																btnMenuManagement,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																69,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				69,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel4)))
										.addContainerGap(19, Short.MAX_VALUE)));

		pnlContend.setBackground(new java.awt.Color(204, 204, 204));
		pnlContend.setLayout(new java.awt.GridLayout());

		jMenu1.setText("menu");

		jMenuItem1.setText("add menu");
		jMenu1.add(jMenuItem1);

		jMenuItem2.setText("update menu");
		jMenu1.add(jMenuItem2);

		jMenuItem3.setText("delete menu");
		jMenu1.add(jMenuItem3);

		jMenuBar1.add(jMenu1);

		jMenu3.setText("stuff");

		jMenuItem4.setText("add stuff");
		jMenu3.add(jMenuItem4);

		jMenuItem5.setText("update stuff");
		jMenu3.add(jMenuItem5);

		jMenuItem6.setText("delete stuff");
		jMenu3.add(jMenuItem6);

		jMenuBar1.add(jMenu3);

		jMenu2.setText("logout");
		jMenuBar1.add(jMenu2);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(pnlContend, javax.swing.GroupLayout.DEFAULT_SIZE,
						1051, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(pnlContend,
								javax.swing.GroupLayout.DEFAULT_SIZE, 509,
								Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		stuffManagementPanel = new StuffManagementPanel();
		pnlContend.removeAll();
		pnlContend.add(stuffManagementPanel);
		this.validate();
		this.repaint();
	}

	private void btnMenuManagementActionPerformed(java.awt.event.ActionEvent evt) {
		menuManagement = new MenuManagement();
		pnlContend.setLayout(new java.awt.GridLayout(1, 1));
		pnlContend.removeAll();
		pnlContend.add(menuManagement);
		this.validate();
		this.repaint();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				AdminManagementForm adminManagementForm = new AdminManagementForm();
				adminManagementForm.setVisible(true);
				adminManagementForm.setSize(1200, 730);
				adminManagementForm.setLocationRelativeTo(null);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton btnMenuManagement;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel pnlContend;
	// End of variables declaration//GEN-END:variables

}