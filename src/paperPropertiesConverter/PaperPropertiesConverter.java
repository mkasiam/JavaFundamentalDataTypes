package paperPropertiesConverter;

public class PaperPropertiesConverter {

    final double WIDTH_IN_INCHES = 8.5;
    final double HEIGHT_IN_INCHES = 11.0;

    // Converting Width and Height from Inches to MM
    double widthInMM = WIDTH_IN_INCHES * Constants.INCH_TO_MM;
    double heightInMM = HEIGHT_IN_INCHES * Constants.INCH_TO_MM;

    // calculating perimeter
    double perimeter = 2 * (widthInMM + heightInMM);

    // calculating diagonal Length
    double diagonalLength = Math.sqrt(Math.pow(widthInMM,2))
            + Math.sqrt(Math.pow(heightInMM,2));
}
