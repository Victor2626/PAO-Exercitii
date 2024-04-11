package lab7.Conversie;

import lab7.Currency;

public class ConversieCurrencyImpl implements ConversieCalcul {
    public double conversieValutaToEur(Currency currency, double cantitate) {
        return switch (currency) {
            case RON -> cantitate * 0.2;
            case EUR -> cantitate;
            case USD -> cantitate * 0.92;
            case GBP -> cantitate * 1.17;
            case TRY -> cantitate * 0.02;
            default -> 0;
        };
    }
    public double calculRata() {
        return 0;
    }
}