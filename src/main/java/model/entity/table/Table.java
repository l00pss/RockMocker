package model.entity.table;

import java.util.HashSet;
import java.util.Set;

public class Table  {
    private boolean isExist = true;
    private final Set<Column> columnSet = new HashSet<>();

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        isExist = exist;
    }

    public boolean add(Column column){
        return this.columnSet.add(column);
    }


}
