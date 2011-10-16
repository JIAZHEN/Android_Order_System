package com.model;

import java.util.*;

import javax.swing.table.AbstractTableModel;

import com.hibernate.model.*;

public class JTableModel extends AbstractTableModel {
	private String tableTag;
	private static final long serialVersionUID = 1L;

	private String[] columnNames;
	// 保存一个User的列表
	private List tableList = new ArrayList();

	public JTableModel(String tableTag) {
		this.tableTag = tableTag;
		if (tableTag.equals("food")) {
			String[] columnNames = { "食物编号", "食物中文名", "食物英文名", "类别中文名",
					"类别英文名", "食物价格", "食物折扣", "食物中文描述", "食物英文描述" };
			setColumnNames(columnNames);
		} else if (tableTag.equals("stuff")) {
			String[] columnNames = { "Name", "Title", "Level",
					"Barcode", "Created time" };
			setColumnNames(columnNames);
		}
	}

	// 设置User列表, 同时通知JTabel数据对象更改, 重绘界面
	public void setModelList(List tableList) {
		this.tableList = tableList;
		this.fireTableDataChanged();// 同时通知JTabel数据对象更改, 重绘界面
	}
	
	public void add(Stuff stuff) {
		this.tableList.add(stuff);
		this.fireTableDataChanged();
	}
	
	public void delete(int index) {
		this.tableList.remove(index);
		this.fireTableDataChanged();
	}

	public int getColumnCount() {
		if (columnNames != null)
			return columnNames.length;
		else
			return 0;
	}

	public int getRowCount() {
		if (tableList.isEmpty()) {
			return 0;
		} else
			return tableList.size();
	}

	// 从list中拿出rowIndex行columnIndex列显示的值
	public Object getValueAt(int rowIndex, int columnIndex) {
		if (tableTag.trim().equals("food")) {
			Food food = (Food) tableList.get(rowIndex);
			switch (columnIndex) {
			case 0:
				return food.getFoodId();
			case 1:
				return food.getFoodCname();
			case 2:
				return food.getFoodEname();
			case 3:
				return food.getCategory().getCCname();
			case 4:
				return food.getCategory().getCEname();
			case 5:
				return food.getFoodPrice();
			case 6:
				return food.getFoodDiscount();
			case 7:
				return food.getFoodCdescription();
			case 8:
				return food.getFoodEdescription();
			}
		} else if (tableTag.trim().equals("stuff")) {
			Stuff stuff = (Stuff) tableList.get(rowIndex);
			switch (columnIndex) {
			case 0:
				return stuff.getStuffName();
			case 1:
				return stuff.getStuffTitle();
			case 2:
				return stuff.getLevel();
			case 3:
				return stuff.getBarcode();
			case 4:
				return stuff.getStuffAddTime();
			}
		}
		return null;
	}

	public void setColumnNames(String[] columnNames) {
		this.columnNames = columnNames;
	}

	public String getColumnName(int column) {
		return columnNames[column];
	}
}