package collections.mainTask.sweetsHierarchy;

public enum ChocolateCandyFillings {
    NOUGAT,
    GRATED_NUTS,
    CREAM,
    FRUIT_JELLY;

    public String toString() {
        String filling = "Тип не указан";

        switch (ordinal()) {
            case 0:
                filling = "Нуга";
                break;
            case 1:
                filling = "Дробленый орех";
                break;
            case 2:
                filling = "Карамель";
                break;
            case 3:
                filling="Крем ";
                break;
            case 4:
                filling="Желе";
                break;
            default:
                filling = "Тип начинки не указан";
                break;
        }
        return filling;
    }
}
