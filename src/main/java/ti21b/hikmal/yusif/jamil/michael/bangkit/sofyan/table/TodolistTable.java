package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.table;

import javax.swing.table.DefaultTableModel;

public class TodolistTable extends DefaultTableModel {

    public TodolistTable() {
        super(new Object [][] {}, new String [] {
                        "No", "Todo", "Created at", "Modified at"
                });
    }

}
