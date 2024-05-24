public class test {
    test[] arr = new test[1000];
    int count = 0;
    String name;

    public boolean add(test x) {
        if (count >= 1000) {
            return false;
        }

        arr[count++] = x;
        return true;
    }

    public void remove(test a) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                index = i;
                break;
            }
        }
        remove(index);
    }

    public void remove(int index) {
        for (int i = index; i < arr.length; i++) {
            arr[i] = arr[i + 1];
        }
    }
}
