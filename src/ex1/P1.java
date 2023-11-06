package ex1;

public class P1 {
        public static void main(String[] args) {
            String input = "masina";
            String mij = findM(input);
            System.out.println(mij);
        }

        public static String findM(String cuvant) {
            int lng = cuvant.length();

            if (lng % 2 == 0) {
                int mijStIn = lng / 2 - 1;
                int mijDrIn = lng / 2;
                return cuvant.substring(mijStIn, mijDrIn + 1);
            } else {
                int mijIn = lng / 2;
                return cuvant.substring(mijIn, mijIn + 1);
            }
        }
    }
