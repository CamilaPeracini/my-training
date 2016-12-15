package treinamento;

public class Saudacaov1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        dumpArgs(args);
       
        String[] nomes = new String[3];
       
        nomes[0] = "Camila";
        nomes[1] = "Emiliano";
        nomes[2] = "Amanda";
       
        for (int idx = 0; idx < 3; idx++) {
            System.out.println("Olá " + nomes[idx] + "!");
        }// for
    }// main

    private static void dumpArgs(String[] args) {
        for (int idx = 0; idx < args.length; idx++) {
            System.out.printf("args[%d]: %s\n", idx, args[idx]);
        }// for
        System.out.println();
    }

}