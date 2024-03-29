/*
 * MenuManagement.java
 *
 * Created on __DATE__, __TIME__
 */

package com.gui;

import java.util.List;

import javax.swing.JFrame;

import com.hibernate.FoodDAO;
import com.hibernate.model.Food;
import com.model.JTableModel;

/**
 *
 * @author  __USER__
 */
public class MenuManagement extends javax.swing.JPanel {
	
	private FoodDAO foodDao;

	/** Creates new form MenuManagement */
	public MenuManagement() {
		initComponents();
		fillDate();
	}

	private void fillDate() {
		foodDao = new FoodDAO();
		List<Food> foodList = foodDao.findAll();
		try {
			JTableModel menuModel = new JTableModel("food");
			menuModel.setModelList(foodList);
			tblMenu.setModel(menuModel);

		} catch (Exception e) {
			e.printStackTrace();
		}

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
		btnSearch = new javax.swing.JButton();
		lblTag = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jComboBox1 = new javax.swing.JComboBox();
		jPanel2 = new javax.swing.JPanel();
		pnlData = new javax.swing.JPanel();
		lblFoodEName = new javax.swing.JLabel();
		lblFoodCName = new javax.swing.JLabel();
		lblFoodPrice = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		btnAdd = new javax.swing.JButton();
		btnUpdate = new javax.swing.JButton();
		btnDelete = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jScrollPane2 = new javax.swing.JScrollPane();
		jScrollPane1 = new javax.swing.JScrollPane();
		tblMenu = new javax.swing.JTable();
		jPanel3 = new javax.swing.JPanel();
		lblFirstLevelCategory = new javax.swing.JLabel();
		lblSecondLevelCategory = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();

		btnSearch.setFont(new java.awt.Font("经典仿宋简", 0, 12));
		btnSearch.setText("\u67e5\u627e");

		lblTag.setFont(new java.awt.Font("经典仿宋简", 0, 12));
		lblTag.setText("\u98df\u7269\u7f16\u53f7\uff1a");

		jComboBox1.setFont(new java.awt.Font("经典仿宋简", 0, 12));
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"by name", "by id", "by category" }));

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
										.addGap(72, 72, 72)
										.addComponent(lblTag)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTextField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jComboBox1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(61, 61, 61)
										.addComponent(btnSearch)
										.addContainerGap(812, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblTag)
														.addComponent(btnSearch)
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));

		javax.swing.GroupLayout pnlDataLayout = new javax.swing.GroupLayout(
				pnlData);
		pnlData.setLayout(pnlDataLayout);
		pnlDataLayout.setHorizontalGroup(pnlDataLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 140,
				Short.MAX_VALUE));
		pnlDataLayout.setVerticalGroup(pnlDataLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 63,
				Short.MAX_VALUE));

		lblFoodEName.setText("Food English Name:");

		lblFoodCName.setText("Food Chinese Name:");

		lblFoodPrice.setText("Food Price:");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addComponent(
												pnlData,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addContainerGap())
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																lblFoodCName)
														.addComponent(
																lblFoodEName))
										.addGap(30, 30, 30))
						.addGroup(
								jPanel2Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(lblFoodPrice)
										.addContainerGap(81, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout
						.createSequentialGroup()
						.addComponent(lblFoodEName)
						.addGap(39, 39, 39)
						.addComponent(lblFoodCName)
						.addGap(61, 61, 61)
						.addComponent(lblFoodPrice)
						.addGap(121, 121, 121)
						.addComponent(pnlData,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(187, Short.MAX_VALUE)));

		btnAdd.setText("add");

		btnUpdate.setText("update");

		btnDelete.setText("delete");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel4Layout
						.createSequentialGroup()
						.addContainerGap(294, Short.MAX_VALUE)
						.addComponent(btnAdd,
								javax.swing.GroupLayout.PREFERRED_SIZE, 84,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(71, 71, 71)
						.addComponent(btnUpdate)
						.addGap(69, 69, 69)
						.addComponent(btnDelete,
								javax.swing.GroupLayout.PREFERRED_SIZE, 75,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(45, 45, 45)));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap(25, Short.MAX_VALUE)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(btnDelete)
														.addComponent(btnAdd)
														.addComponent(btnUpdate))
										.addContainerGap()));

		jTextField2.setText("jTextField2");

		jTextField3.setText("jTextField3");

		jTextField4.setText("jTextField4");

		tblMenu.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(tblMenu);

		jScrollPane2.setViewportView(jScrollPane1);

		lblFirstLevelCategory.setText("FirstLevelCategory:");

		lblSecondLevelCategory.setText("SecondLevelCategory:");

		jLabel1.setText("pounds");

		jLabel6.setText("jLabel6");

		jLabel7.setText("jLabel7");

		jLabel8.setText("jLabel8");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap(414, Short.MAX_VALUE)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGap(287,
																				287,
																				287)
																		.addComponent(
																				jLabel6)
																		.addGap(143,
																				143,
																				143)
																		.addComponent(
																				jLabel7)
																		.addGap(128,
																				128,
																				128)
																		.addComponent(
																				jLabel8))
														.addComponent(jLabel1)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGap(38,
																				38,
																				38)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								lblSecondLevelCategory)
																						.addComponent(
																								lblFirstLevelCategory))))
										.addGap(161, 161, 161)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap(53, Short.MAX_VALUE)
										.addComponent(lblFirstLevelCategory)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(jLabel8)
														.addComponent(jLabel6))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(lblSecondLevelCategory)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel1)
										.addGap(41, 41, 41)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel2,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
																.addComponent(
																		jTextField3,
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(
																		jTextField2,
																		javax.swing.GroupLayout.Alignment.LEADING,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		106,
																		Short.MAX_VALUE))
												.addComponent(
														jTextField4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														98,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(979, 979, 979))
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jScrollPane2,
						javax.swing.GroupLayout.DEFAULT_SIZE, 1244,
						Short.MAX_VALUE)
				.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(392, Short.MAX_VALUE)
								.addComponent(jPanel4,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(145, 145, 145)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										46,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										240,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(301, 301, 301)
								.addComponent(jPanel4,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(262, 262, 262)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jTextField2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(37, 37,
																		37)
																.addComponent(
																		jTextField3,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(48, 48,
																		48)
																.addComponent(
																		jTextField4,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(
														jPanel2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
	}// </editor-fold>
	//GEN-END:initComponents

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton btnAdd;
	private javax.swing.JButton btnDelete;
	private javax.swing.JButton btnSearch;
	private javax.swing.JButton btnUpdate;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JLabel lblFirstLevelCategory;
	private javax.swing.JLabel lblFoodCName;
	private javax.swing.JLabel lblFoodEName;
	private javax.swing.JLabel lblFoodPrice;
	private javax.swing.JLabel lblSecondLevelCategory;
	private javax.swing.JLabel lblTag;
	private javax.swing.JPanel pnlData;
	private javax.swing.JTable tblMenu;
	// End of variables declaration//GEN-END:variables

}