public class ZooFullException extends Exception {
    public ZooFullException(int a,int b) {
        try {
            if (b >= a) {
                throw new ArrayIndexOutOfBoundsException();
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }
    }
}
