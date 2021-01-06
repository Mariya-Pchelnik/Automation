package collections.mainTask.sweetsHierarchy;

public enum ChocolateTypes {
    WHITE_CHOCOLATE,
    MILK_CHOCOLATE,
    DARK_CHOCOLATE;

    @Override
    public String toString() {
        String type="Тип не указан";

        switch (ordinal()) {
            case 0:
                type="белый";
                break;
            case 1:
                type="молочный";
                break;
            case 2:
                type="горький";
                break;
            default:
                type="тип шоколада не указан";
                break;
        }
        return type;
    }
}
