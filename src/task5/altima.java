package task5;

class Altima implements nissan, vechile {


    private String entityId;
    private String entityName;
    private String color;
    private String vinNumber;
    private String year;

    private String altimaId;

    public String getAccordId() {
        return altimaId;
    }

    public void setAccordId(String altimaId) {
        this.altimaId = altimaId;
    }

    @Override
    public void setEntity(String entityId) {
        this.entityId = entityId;
    }

    @Override
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @Override
    public String getEntityId() {
        return this.entityId;
    }

    @Override
    public String getEntityName() {
        return this.entityName;
    }

    @Override
    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getVin() {
        return this.vinNumber;
    }
}

