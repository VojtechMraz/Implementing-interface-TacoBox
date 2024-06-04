
public class Main {

    public static void main(String[] args) {
        TacoBox tripleTacoBox = new TripleTacoBox();       
        System.out.println("Zbývá takos: " + tripleTacoBox.tacosRemaining()); // Očekáváno: 3
        tripleTacoBox.eat();
        System.out.println("Zbývá takos: " + tripleTacoBox.tacosRemaining()); // Očekáváno: 2   
        tripleTacoBox.eat();
        tripleTacoBox.eat();    
        System.out.println("Zbývá takos: " + tripleTacoBox.tacosRemaining()); // Očekáváno: 0        
        
        TacoBox customTacoBox = new CustomTacoBox(5);
        System.out.println("Zbývá takos: " + customTacoBox.tacosRemaining()); // Očekáváno: 5
        customTacoBox.eat();
        System.out.println("Zbývá takos: " + customTacoBox.tacosRemaining()); // Očekáváno: 4
        customTacoBox.eat();
        customTacoBox.eat();
        customTacoBox.eat();
        customTacoBox.eat();
        System.out.println("Zbývá takos: " + customTacoBox.tacosRemaining()); // Očekáváno: 0
        customTacoBox.eat();
        System.out.println("Zbývá takos: " + customTacoBox.tacosRemaining()); // Očekáváno: 0
    }
}
