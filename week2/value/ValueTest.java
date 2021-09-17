package value;

public class ValueTest {
    int x = 1;

    public void modifikasiNilai(int nilai) {
        x = x + nilai;
    }

    public static void main(String[] args) {
        ValueTest value = new ValueTest();

        value.modifikasiNilai(2);
        System.out.println(value.x);
    }
}
