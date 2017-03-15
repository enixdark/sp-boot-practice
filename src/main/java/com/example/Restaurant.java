package com.example;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by cqshinn on 14/03/2017.
 */
public class Restaurant extends BaseEntity<String> {

    private List<Table> tables = Lists.newArrayList();

    public Restaurant(String name, String id, List<Table> tables){
        super(id, name);
        this.setTables(tables);
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }
}
