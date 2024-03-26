--Inserting data into the hotel table 
Insert INTO hotel (name, location, rating)VALUES
('The Plaza Hotel', 'New York', 4),
('The Beverly Hills Hotel', 'Los Angeles', 5),
('The Langham', 'Chicags',3);


--Inserting data into the room table 
Insert INTO room (roomNumber, type, price, hotelId)VALUES 
('A-101', 'Deluxe R00m', 375,00,1),
('B-205', 'Sulte',950.00,1),
('B-306', 'PentHouse Suite',2500.00,1),
('C-401','Superior Guest Room',465.00,2),
('D-202','Bumgalow',1250.00,2),
('A-107','Penthouse Suite',3300.00,2),
('A-301','Grand Room',410.00,3),
('C-313','Executive Suite',700.00,3),
('D-404','Premier Suite',800.00,3);
