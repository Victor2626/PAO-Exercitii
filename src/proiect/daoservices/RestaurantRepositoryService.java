package proiect.daoservices;

import proiect.model.Restaurant;
import proiect.dao.RestaurantDao;

import java.util.List;

public class RestaurantRepositoryService {
    private RestaurantDao restaurantDao;
    public RestaurantRepositoryService(){
        this.restaurantDao = new RestaurantDao();
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurantDao.createRestaurant(restaurant);
    }

    public Restaurant getRestaurantById(int id) {
        return restaurantDao.readRestaurant(id);
    }

    public void updateRestaurant(int id, Restaurant updatedRestaurant) {
        restaurantDao.updateRestaurant(id, updatedRestaurant);
    }

    public void removeRestaurant(Restaurant restaurant) {
        restaurantDao.deleteRestaurant(restaurant);
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantDao.findAllRestaurants();
    }
}
