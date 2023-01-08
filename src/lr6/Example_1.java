package lr6;

public class Example_1 {

    private char symbols;
    private String texts;

    public void SetSymbolsAndTexts(char symbols) {
        this.symbols = symbols;
        System.out.println(this.symbols);
    }

    public void SetSymbolsAndTexts(String texts) {
        this.texts = texts;
        System.out.println(this.texts);
    }

    public void SetSymbolsAndTexts(char[] symbols) {
        if (symbols.length == 1) {
            this.symbols = symbols[0];
            System.out.println(this.symbols);
        }

        if (symbols.length > 1) {
            texts = String.valueOf(symbols);
            System.out.println(this.texts);
        }

    }

    public static void main(String[] args) {
        Example_1 example_1 = new Example_1();
        example_1.SetSymbolsAndTexts('a');
        example_1.SetSymbolsAndTexts("sdf sdf");
        char [] mass = {'g'};
        char [] mass1 = {'g','s','t','f'};
        example_1.SetSymbolsAndTexts(mass);
        example_1.SetSymbolsAndTexts(mass1);
    }
}