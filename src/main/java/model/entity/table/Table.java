package model.entity.table;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Table implements Comparable<Table> {
    private boolean isExist = true;
    private final Set<Column> columnSet = new HashSet<>();

    private LocalDate modificationDate = LocalDate.now();



    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        isExist = exist;
    }

    public boolean add(Column column){
        this.modificationDate = LocalDate.now();
        return this.columnSet.add(column);
    }

    @Override
    public int compareTo(Table o) {
        return this.modificationDate.compareTo(o.modificationDate);
    }
}
