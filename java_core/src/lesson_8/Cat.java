public class Cat {
    String name;

    // Блок инициализации
    {
        System.out.print("Cat created!");
    }


    // Статическая инициализация (только при первом обращении к классу)
    public final static String[] BRAND_DESCRIPTIONS = new String[2];

    static {
        BRAND_DESCRIPTIONS[0] = "Audi";
        BRAND_DESCRIPTIONS[1] = "Mersedes";
    }
}