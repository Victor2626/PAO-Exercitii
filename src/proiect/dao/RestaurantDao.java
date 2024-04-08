package proiect.dao;

import proiect.model.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RestaurantDao {
    private static int nextId = 1;
    private static List<Restaurant> restaurants = new ArrayList<>();

    public void createRestaurant(Restaurant restaurant) {
        restaurant.setId(nextId++);
        restaurants.add(restaurant);
    }

    public Restaurant readRestaurant(int id) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getId() == id) {
                return restaurant;
            }
        }
        return null;
    }

    public void updateRestaurant(int id, Restaurant restaurantUpdated) {
        Optional<Restaurant> restaurantOptional = restaurants.stream()
                .filter(restaurant -> restaurant.getId() == id)
                .findFirst();

        restaurantOptional.ifPresent(restaurant -> {
            restaurants.remove(restaurant);
            restaurantUpdated.setId(id);
            restaurants.add(restaurantUpdated);
        });
    }

    public void deleteRestaurant(Restaurant restaurant) {
        restaurants.remove(restaurant);
    }

    public List<Restaurant> findAllRestaurants() {
        return new ArrayList<>(restaurants);
    }
}

