package enumTypes;
import static enumTypes.EnumType.*;

public class Runner {
    public static void main(String[] args) {
        useConstant("LOW");
        useConstant("MEDIUM");
        useConstant("HIGH");
    }

    public static void useConstant(String strength){
        switch (strength){
            case LOW:
                System.out.println("LOW");
                break;
            case MEDIUM:
                System.out.println("MEDIUM");
                break;
            case HIGH:
                System.out.println("HIGH");
                break;
        }
    }
}