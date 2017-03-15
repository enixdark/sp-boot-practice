package com.example.restaurant;

import com.example.BaseEntity;
import com.example.Table;
import com.google.common.collect.Lists;

import java.util.Arrays;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("id: {}, name: {}", this.getId(), this.getName()));
        sb.append(String.format("Tables: {}" + Arrays.asList(this.getTables())));
        return sb.toString();
    }
}
