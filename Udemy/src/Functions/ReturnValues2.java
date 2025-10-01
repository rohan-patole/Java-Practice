package Functions;

public class ReturnValues2 {

    public static void main(String[] args) {
        double area1 = calculateArea (2.3, 3.6);
        double area2 = calculateArea(1.6, 2.4);
        double area3 = calculateArea(2.6, 4.2);

        String englishExplaination = explainArea("English");
        String frenchExplaination = explainArea("French");
        String spanishExplaination = explainArea("Spanish");
        String italianExplaination = explainArea("Italian");

    }
    public static double calculateArea (double length, double width) {
        double area = length * width;
        return area;
    }
     public static String explainArea (String language) {
        switch (language) {
            case "English" : return "Area equals length * width";
            case "French" : return " La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            default: return "This language in not available";
        }


     }

}


