public class Main {
    public static void main(String[] args) {
        Drink moxito = new Drink();
        moxito.name = "Moxito";
        moxito.price = 20;
        moxito.hasAlkohol = true;
        moxito.ingrediente1 = new Ingrediente(); //zrobiłem na 2 sposoby (1 sposób)
        Ingrediente ingrediente2 = new Ingrediente(); // aaaaaaa2 pasz poc sposób
        Ingrediente ingrediente3 = new Ingrediente();
        moxito.ingrediente1.name = "woter";
        moxito.ingrediente1.amount = 0.2;
        moxito.ingrediente2 = ingrediente2;
        ingrediente2.name = "juice";
        ingrediente2.amount = 0.1;
        moxito.ingrediente3 = ingrediente3;
        ingrediente3.name = "alcohol";
        ingrediente3.amount = 0.2;
        System.out.print("Drink ");
        System.out.println(moxito.name);
        System.out.println("cena " + moxito.price + " zł");
        System.out.println("Czy zawiera alkohol? -  " + moxito.hasAlkohol);
        System.out.println("Skladnik 1 to - " + moxito.ingrediente1.name);
        System.out.println("Ilość 1 sklasdnika - " + moxito.ingrediente1.amount + " L");
        System.out.println("Skladnik 2 to - " + ingrediente2.name);
        System.out.println("Ilość 2 sklasdnika - " + ingrediente2.amount + " L");
        System.out.println("Skladnik 3 to - " + ingrediente3.name);
        System.out.println("Ilość 3 sklasdnika - " + ingrediente3.amount + " L");
        double capacityDrink = moxito.ingrediente1.amount + ingrediente2.amount + ingrediente3.amount;
        System.out.printf("Pojemność drinka wynosi " + "%s + %s + %s = %s", moxito.ingrediente1.amount, ingrediente2.amount, ingrediente3.amount, capacityDrink + " L");
    }
}
