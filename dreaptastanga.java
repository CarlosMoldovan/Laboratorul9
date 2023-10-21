public class dreaptastanga extends Thread{
    private String cuvant;
    private int start;
    private int end;

    public dreaptastanga (String cuvant, int mijloc) {
        this.cuvant = cuvant;
        this.start = cuvant.length()-1;
        this.end = mijloc;
    }

    @Override
    public void run() {
        for (int i = start; i > end; i--) {
            System.out.print(cuvant.charAt(i));
        }
    }
}
