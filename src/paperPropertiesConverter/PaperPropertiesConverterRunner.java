package paperPropertiesConverter;

public class PaperPropertiesConverterRunner {
    public static void main(String[] args) {
        PaperPropertiesConverter paper = new PaperPropertiesConverter();

        System.out.printf("Width: %.2f mm\n", paper.widthInMM);
        System.out.printf("Height: %.2f mm\n", paper.heightInMM);
        System.out.printf("Perimeter: %.2f mm\n", paper.perimeter);
        System.out.printf("Diagonal Length: %.2f mm\n", paper.diagonalLength);
    }
}
