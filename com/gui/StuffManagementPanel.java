/*
 * StuffManagementPanel.java
 *
 * Created on __DATE__, __TIME__
 */

package com.gui;

import java.sql.Timestamp;
import java.util.*;
import javax.swing.*;
import com.hibernate.*;
import com.hibernate.model.*;
import com.model.JTableModel;

/**
 * 
 * @author JIAZHEN XIE
 */
public class StuffManagementPanel extends javax.swing.JPanel {

	private StuffDAO stuffDao;
	private List<Stuff> stuffList;
	private JTableModel stuffModel;

	/** Creates new form StuffManagementPanel */
	public StuffManagementPanel() {
		initComponents();
		fillData();
	}

	public void fillData() {
		stuffDao = new StuffDAO();
		stuffList = stuffDao.findAll();
		try {
			stuffModel = new JTableModel("stuff");
			stuffModel.setModelList(stuffList);
			stuffTable.setModel(stuffModel);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		searchLabel = new javax.swing.JLabel();
		searchText = new javax.swing.JTextField();
		bySelection = new javax.swing.JComboBox();
		searchBtn = new javax.swing.JButton();
		dateViewPanel = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		stuffTable = new javax.swing.JTable();
		editPanel = new javax.swing.JPanel();
		nameLabel = new javax.swing.JLabel();
		nameText = new javax.swing.JTextField();
		titleLabel = new javax.swing.JLabel();
		titleText = new javax.swing.JTextField();
		levelLabel = new javax.swing.JLabel();
		levelText = new javax.swing.JTextField();
		timeLabel = new javax.swing.JLabel();
		timeText = new javax.swing.JTextField();
		barcodeLabel = new javax.swing.JLabel();
		barcodeText = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();

		searchLabel.setFont(new java.awt.Font("Times New Roman", 0, 14));
		searchLabel.setText("Search code:");

		bySelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"By name", "By level", "By barcode" }));

		searchBtn.setText("Search");
		searchBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				searchBtnActionPerformed(evt);
			}
		});

		dateViewPanel.setLayout(new java.awt.GridLayout(1, 0));

		stuffTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		stuffTable.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tableClick(evt);
			}
		});
		jScrollPane1.setViewportView(stuffTable);

		dateViewPanel.add(jScrollPane1);

		editPanel.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Edit"));
		editPanel.setFont(new java.awt.Font("Times New Roman", 0, 12));

		nameLabel.setFont(new java.awt.Font("Times New Roman", 0, 14));
		nameLabel.setText("Name:");

		titleLabel.setFont(new java.awt.Font("Times New Roman", 0, 14));
		titleLabel.setText("Title:");

		levelLabel.setFont(new java.awt.Font("Times New Roman", 0, 14));
		levelLabel.setText("Level:");

		timeLabel.setFont(new java.awt.Font("Times New Roman", 0, 14));
		timeLabel.setText("Created time:");

		timeText.setEditable(false);
		timeText.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				timeTextActionPerformed(evt);
			}
		});

		barcodeLabel.setFont(new java.awt.Font("Times New Roman", 0, 14));
		barcodeLabel.setText("Barcode:");

		jButton1.setText("Clear");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("Update");

		jButton3.setText("Add");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("delete");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(
				editPanel);
		editPanel.setLayout(editPanelLayout);
		editPanelLayout
				.setHorizontalGroup(editPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								editPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												editPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																editPanelLayout
																		.createSequentialGroup()
																		.addComponent(
																				nameLabel,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				45,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				nameText,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				85,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																editPanelLayout
																		.createSequentialGroup()
																		.addComponent(
																				titleLabel,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				45,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				titleText,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				85,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(73,
																				73,
																				73)
																		.addGroup(
																				editPanelLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								editPanelLayout
																										.createSequentialGroup()
																										.addComponent(
																												levelLabel,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												45,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(10,
																												10,
																												10)
																										.addComponent(
																												levelText,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												85,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(50,
																												50,
																												50)
																										.addComponent(
																												timeLabel,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												80,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												timeText,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												123,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								editPanelLayout
																										.createSequentialGroup()
																										.addComponent(
																												barcodeLabel)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												barcodeText,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												260,
																												javax.swing.GroupLayout.PREFERRED_SIZE))))
														.addGroup(
																editPanelLayout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton3)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				jButton2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton4)))
										.addGap(205, 205, 205)));
		editPanelLayout
				.setVerticalGroup(editPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								editPanelLayout
										.createSequentialGroup()
										.addGroup(
												editPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																nameLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																25,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																nameText,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																levelText,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																timeLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																25,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																timeText,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																levelLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																25,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(26, 26, 26)
										.addGroup(
												editPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																titleLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																25,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																titleText,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																barcodeLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																25,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																barcodeText,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												53, Short.MAX_VALUE)
										.addGroup(
												editPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton3)
														.addComponent(jButton2)
														.addComponent(jButton4))
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addComponent(searchLabel)
								.addGap(2, 2, 2)
								.addComponent(searchText,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										120,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(bySelection,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										371, Short.MAX_VALUE)
								.addComponent(searchBtn,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										167,
										javax.swing.GroupLayout.PREFERRED_SIZE))
				.addComponent(dateViewPanel,
						javax.swing.GroupLayout.DEFAULT_SIZE, 835,
						Short.MAX_VALUE)
				.addComponent(editPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(searchBtn)
												.addComponent(
														searchLabel,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														25,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		bySelection,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		25,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		searchText,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		25,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(dateViewPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										356,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(editPanel,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
	}// </editor-fold>
		// GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		int row = stuffTable.getSelectedRow();
		if (row == -1) {
			JOptionPane.showMessageDialog(null,
					"Please select one row before deleting!");
		} else {
			Stuff deletedStuff = stuffList.get(row);
			stuffDao.delete(deletedStuff);
			stuffModel.delete(row);

		}
	}

	private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {
		String by = (String) bySelection.getSelectedItem();
		if (by.equals("By name")) {
			// stuffList = stuffDao.findById(id);
			stuffModel.setModelList(stuffList);
			stuffTable.setModel(stuffModel);
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		String name = nameText.getText();
		String title = titleText.getText();
		String level = levelText.getText();
		if (name.isEmpty() || level.isEmpty() || title.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Name, level and title can't be empty!");
		} else {
			Timestamp time = new Timestamp(new Date().getTime());
			String barcode = barcodeText.getText();
			int answer = JOptionPane.showConfirmDialog(null,
					"The following new stuff will be added into the database:\n"
							+ "name: " + name + "\n" + "title: " + title + "\n"
							+ "level: " + level + "\n" + "barcode: " + barcode
							+ "\n" + "time: " + time + "\n", "Confirmation",
					JOptionPane.YES_NO_OPTION);
			if (answer == 0) {
				Stuff newStuff = new Stuff(name, title,
						Short.parseShort(level), time);
				stuffDao.save(newStuff);
				stuffModel.add(newStuff);
			}
		}

	}

	private void tableClick(java.awt.event.MouseEvent evt) {
		int row = stuffTable.getSelectedRow();
		nameText.setText(stuffList.get(row).getStuffName());
		titleText.setText(stuffList.get(row).getStuffTitle());
		levelText.setText("" + stuffList.get(row).getLevel());
		timeText.setText("" + stuffList.get(row).getStuffAddTime());
		barcodeText.setText(stuffList.get(row).getBarcode());
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		nameText.setText("");
		titleText.setText("");
		levelText.setText("");
		timeText.setText("");
		barcodeText.setText("");
	}

	private void timeTextActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel barcodeLabel;
	private javax.swing.JTextField barcodeText;
	private javax.swing.JComboBox bySelection;
	private javax.swing.JPanel dateViewPanel;
	private javax.swing.JPanel editPanel;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel levelLabel;
	private javax.swing.JTextField levelText;
	private javax.swing.JLabel nameLabel;
	private javax.swing.JTextField nameText;
	private javax.swing.JButton searchBtn;
	private javax.swing.JLabel searchLabel;
	private javax.swing.JTextField searchText;
	private javax.swing.JTable stuffTable;
	private javax.swing.JLabel timeLabel;
	private javax.swing.JTextField timeText;
	private javax.swing.JLabel titleLabel;
	private javax.swing.JTextField titleText;
	// End of variables declaration//GEN-END:variables

}