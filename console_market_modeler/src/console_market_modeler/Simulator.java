package console_market_modeler;

public class Simulator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello World");

    }

    private static Company[] companies;

    public static void balanceNewCompany(Company to_bal) {
        int i = 0;
        float max_pop = 1 - to_bal.getPopularity();

        for (i = 0; i < companies.length; i++) {
            if (to_bal.getName() == companies[i].getName()) {

            }

        }

    };

}
