package class5;

public class Accord implements Honda, Car {


    private String entityId;
    private String entityName;
    private String color;
    private String vinNumber;
    private String year;

    private String accordId;

    public String getAccordId() {
        return accordId;
    }

    public void setAccordId(String accordId) {
        this.accordId = accordId;
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
