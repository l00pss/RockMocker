package model.statics;

public class ColumnFormat {
    private Long id;
    private Long tableId;
    private String columnName;
    private Boolean isPrimary = false;
    private Boolean isNullable = true;
    private Boolean isUnique = false;
    private String format;
    private Integer maxLength;
    private Integer minLength;
    private Boolean isUpdatable = true;
}
