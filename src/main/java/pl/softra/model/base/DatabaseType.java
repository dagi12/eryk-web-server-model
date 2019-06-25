package pl.softra.model.base;

public enum DatabaseType {
    ORACLE("Oracle"), PGSQL("PostgreSQL", "POSTGRESQL"), MSSQL("Microsoft SQL Server", "MSSQL"), NULL("NULL");

    private final String text;

    private String secondName;

    DatabaseType(String text, String secondName) {
        this.text = text;
        this.secondName = secondName;
    }

    DatabaseType(String text) {
        this.text = text;
    }

    public static DatabaseType fromString(String text) {
        if (text != null) {
            for (DatabaseType b : DatabaseType.values()) {
                if (text.equals(b.text)) {
                    return b;
                }
            }
        }
        return DatabaseType.NULL;

    }

    public String getSecondName() {
        return secondName;
    }
}

