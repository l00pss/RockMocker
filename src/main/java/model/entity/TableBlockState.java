package model.entity;

public  class TableBlockState {
    private boolean isID;
    private String name;
    private boolean isUnique;
    private boolean isNullable;
    private boolean isUpdatable;
    private boolean isInsertable;
    private ColumnType columnType;
    private String regex;

    public boolean isID() {
        return isID;
    }

    public void setID(boolean ID) {
        isID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUnique() {
        return isUnique;
    }

    public void setUnique(boolean unique) {
        isUnique = unique;
    }

    public boolean isNullable() {
        return isNullable;
    }

    public void setNullable(boolean nullable) {
        isNullable = nullable;
    }

    public boolean isUpdatable() {
        return isUpdatable;
    }

    public void setUpdatable(boolean updatable) {
        isUpdatable = updatable;
    }

    public boolean isInsertable() {
        return isInsertable;
    }

    public void setInsertable(boolean insertable) {
        isInsertable = insertable;
    }

    public ColumnType getColumnType() {
        return columnType;
    }

    public void setColumnType(ColumnType columnType) {
        this.columnType = columnType;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
}
