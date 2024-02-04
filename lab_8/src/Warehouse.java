class Warehouse implements TradeEntity {
    private String name;

    public Warehouse(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
