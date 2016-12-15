package treinamento;

public class SaudacaoV2 {

    public static void main(String[] args) {
        dumpArgs(args);
        
        String[] nomes = new String[3];
        
        nomes[0] = "Camila";
        nomes[1] = "Emiliano";
        nomes[2] = "Amanda";
        
        if ("PT".equals(args[0])) {
            for (int idx = 0; idx < 3; idx++) {
                System.out.println("Olá " + nomes[idx] + "!");
            }// for
        } else if ("EN".equals(args[0])) {
            for (int idx = 0; idx < 3; idx++) {
                System.out.println("Hi " + nomes[idx] + "!");
            }// for
        } else if ("ES".equals(args[0])) {
            for (int idx = 0; idx < 3; idx++) {
                System.out.println("¡Hola " + nomes[idx] + "!");
            }// for
        }// if
    }// main

    private static void dumpArgs(String[] args) {
        for (int idx = 0; idx < args.length; idx++) {
            System.out.printf("args[%d]: %s\n", idx, args[idx]);
        }// for
        System.out.println();
    }

}