CREATE TABLE hotel (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    location TEXT,
    rating INT,
);

CREATE TABLE room(
    id INT PRIMARY KEY AUTO_INCREMENT,
    roomNumber TEXT,
    price DOUBLE,
    hotelId INT,
    FOREIGN KEY (hotelId) REFRENCES hotel(id)
);