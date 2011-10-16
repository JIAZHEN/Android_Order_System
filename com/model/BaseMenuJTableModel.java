package com.model;


import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public  abstract class   BaseMenuJTableModel   extends   AbstractTableModel   {
	private String[] columnNames ;
	protected Vector<Object> dataVector;

	public BaseMenuJTableModel()
	{
	dataVector = new Vector<Object>();
	}

	public void setColumnNames(String[] columnNames)
	{
	this.columnNames = columnNames;
	}

	public void setData(Vector<Object> dataVector)
	{
	this.dataVector = dataVector;
	}
	public Vector<Object> getData()
	{
	return this.dataVector;
	}

	public int getColumnCount()
	{
	return columnNames.length;
	}

	public String getColumnName(int column)
	{
	return columnNames[column];
	}


	public int getRowCount()
	{
	return dataVector.size();
	}

	public abstract Class getColumnClass(int column);
	public abstract Object getValueAt(int row, int column);
	public abstract void setValueAt(Object value, int row, int column);
	public abstract void insertEmptyRowAt(int rowIndex);


	public void deleteAll()
	{
	dataVector.removeAllElements();
	this.fireTableDataChanged();
	}

	public void deleteRowAt(int rowIndex)
	{
	dataVector.removeElementAt(rowIndex);
	this.fireTableRowsDeleted(rowIndex, rowIndex);
	}

	public boolean isCellEditable(int row, int column)
	{
	return true;
	}
	} 