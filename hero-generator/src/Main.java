
public class Main {
    public static int strength = 0; //сила
    public static int agility = 0; //ловкость
    public static int body = 0; //телосложение
    public static int intelligence = 0; // интеллект
    public static int wisdom = 0; //мудрость
    public static int charisma = 0; //харизма
    public static int healt = 0; //жизни

    public static void main(String[] args) {
        strength = CubeRubik.rand();
        agility = CubeRubik.rand();
        body = CubeRubik.rand();
        intelligence = CubeRubik.rand();
        wisdom = CubeRubik.rand();
        charisma = CubeRubik.rand();

        healt = 10 + ((body-10)/2);



        System.out.println("Поздравляем! Вы создали персонажа\n" +
                "Ваши характеристики:\n" +
                "Сила:" + strength + "\n" +
                "Ловкость: " + agility + "\n" +
                "Телосложение: " + body + "\n" +
                "Интеллект: " + intelligence + "\n" +
                "Mудрость: " + wisdom + "\n" +
                "Харизма: " + charisma + "\n" +
                "Ваш запас здоровья:" + healt);
    }
}
