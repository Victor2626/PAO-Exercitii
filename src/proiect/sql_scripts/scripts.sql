CREATE TABLE demo.User (
                           id INT PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           email VARCHAR(255) NOT NULL,
                           password VARCHAR(255) NOT NULL,
                           address VARCHAR(255),
                           discountRate DOUBLE
);

CREATE TABLE demo.Recenzie (
                               id INT PRIMARY KEY,
                               userId INT,
                               comment VARCHAR(255),
                               rating INT,
                               FOREIGN KEY (userId) REFERENCES demo.User(id)
);

CREATE TABLE demo.Livrator (
                               id INT PRIMARY KEY,
                               name VARCHAR(255),
                               estimatedDeliveryTime INT
);

CREATE TABLE demo.Mancare (
                              id INT PRIMARY KEY,
                              name VARCHAR(255),
                              price DOUBLE
);

CREATE TABLE demo.Restaurant (
                                 id INT PRIMARY KEY,
                                 name VARCHAR(255),
                                 address VARCHAR(255),
                                 averagePreparationTime INT,
                                 mancareId INT,
                                 recenzieId INT,
                                 FOREIGN KEY (mancareId) REFERENCES demo.Mancare(id),
                                 FOREIGN KEY (recenzieId) REFERENCES demo.Recenzie(id)
);

CREATE TABLE demo.Comanda(
                             id INT PRIMARY KEY,
                             userId INT,
                             restaurantId INT,
                             status VARCHAR(255),
                             orderDate DATE,
                             mancareId INT,
                             FOREIGN KEY (userId) REFERENCES demo.User(id),
                             FOREIGN KEY (restaurantId) REFERENCES demo.Restaurant(id),
                             FOREIGN KEY (mancareId) REFERENCES demo.Mancare(id)
);
INSERT INTO demo.User (id, name, email, password, address, discountRate) VALUES
                                                                             (1, 'Alice', 'alice@example.com', 'password1', '123 Main St', 0.1),
                                                                             (2, 'Bob', 'bob@example.com', 'password2', '456 Elm St', 0.2),
                                                                             (3, 'Charlie', 'charlie@example.com', 'password3', '789 Maple St', 0.15),
                                                                             (4, 'David', 'david@example.com', 'password4', '321 Oak St', 0.05),
                                                                             (5, 'Eva', 'eva@example.com', 'password5', '654 Pine St', 0.3);

INSERT INTO demo.Recenzie (id, userId, comment, rating) VALUES
                                                            (1, 1, 'Great service!', 5),
                                                            (2, 2, 'Good food but slow delivery.', 3),
                                                            (3, 3, 'Excellent quality!', 4),
                                                            (4, 4, 'Not satisfied with the taste.', 2),
                                                            (5, 5, 'Very reasonable prices.', 4);

INSERT INTO demo.Livrator (id, name, estimatedDeliveryTime) VALUES
                                                                (1, 'John', 30),
                                                                (2, 'Michael', 45),
                                                                (3, 'Sara', 25),
                                                                (4, 'Kate', 35),
                                                                (5, 'Tom', 50);

INSERT INTO demo.Mancare (id, name, price) VALUES
                                               (1, 'Pizza', 8.99),
                                               (2, 'Burger', 5.99),
                                               (3, 'Pasta', 7.99),
                                               (4, 'Salad', 4.99),
                                               (5, 'Soup', 3.99);

INSERT INTO demo.Restaurant (id, name, address, averagePreparationTime, mancareId, recenzieId) VALUES
                                                                                                   (1, 'Italian Bistro', '100 Italy St', 20, 1, 1),
                                                                                                   (2, 'Burger Joint', '200 Burger Ave', 15, 2, 2),
                                                                                                   (3, 'Pasta House', '300 Pasta Blvd', 25, 3, 3),
                                                                                                   (4, 'Salad Bar', '400 Salad Ln', 10, 4, 4),
                                                                                                   (5, 'Soup Kitchen', '500 Soup Dr', 15, 5, 5);

INSERT INTO demo.Comanda (id, userId, restaurantId, status, orderDate, mancareId) VALUES
                                                                                      (1, 1, 1, 'Pending', '2024-05-01', 1),
                                                                                      (2, 2, 2, 'Pending', '2024-05-02', 2),
                                                                                      (3, 3, 3, 'Pending', '2024-05-03', 3),
                                                                                      (4, 4, 4, 'Pending', '2024-05-04', 4),
                                                                                      (5, 5, 5, 'Cancelled', '2024-05-05', 5);
