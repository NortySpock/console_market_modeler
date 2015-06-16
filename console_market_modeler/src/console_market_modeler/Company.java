package console_market_modeler;

public class Company {
    private float popularity;
    private float production_rate;
    private String name;

    Company(String name, float pop, float rate) {
        this.name = name;
        this.popularity = pop;
        this.production_rate = rate;
    }

    String getName() {
        return this.name;
    }

    String getPopularityPercent() {
        float decimal = (float) (this.popularity * 100.0);
        return Float.toString(decimal);
    }

    float getPopularity() {
        return this.popularity;
    }

    float getProductionRate() {
        return this.production_rate;
    }

    void changePopularity(float delta) {

    }
}
