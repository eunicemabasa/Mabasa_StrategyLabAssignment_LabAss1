import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Knight
        Character knight = new Character(
                new SwingSword(),
                Arrays.asList(
                        new Shield(),
                        new Dodge(),
                        new CreateMagic()
                )
        );

        // Wizard
        Character wizard = new Character(
                new CastSpell(),
                Arrays.asList(
                        new CreateMagic()
                )
        );

        // Archer
        Character archer = new Character(
                new ShootArrow(),
                Arrays.asList(
                        new Dodge()
                )
        );

        System.out.println("=== Knight ===");
        knight.performAttack();
        knight.performDefense();

        System.out.println("\n=== Wizard ===");
        wizard.performAttack();
        wizard.performDefense();

        System.out.println("\n=== Archer ===");
        archer.performAttack();
        archer.performDefense();
    }
}
