class stangadreapta extends Thread {
    private String cuvant;
    private int start;
    private int end;

    public stangadreapta(String cuvant, int mijloc) {
        this.cuvant = cuvant;
        this.start = 0;
        this.end = mijloc;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.print(cuvant.charAt(i));
        }
    }
}
