package advancedJava;
//generic olarak Primitive data tipleri KULLANILAMAZ.
public class Advanced02<T> {
    private T field;

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}