package proiect.services;

import proiect.model.User;

public class PromotieService {
    //Functie care aplica discount-ul user-ului
    public void applyDiscountToUser(User user, int rating) {
        if (rating == 5) {
            double discount = 0.5;
            user.setDiscountRate(discount);
        }
    }
}


