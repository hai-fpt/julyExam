CREATE TABLE Product (
                         ProdID INT PRIMARY KEY,
                         ProdName VARCHAR(100),
                         Description VARCHAR(255),
                         DateOfManf DATE,
                         Price DECIMAL(10, 2)
);

CREATE TABLE Sale (
                      SlNo INT PRIMARY KEY,
                      SalesmanID INT,
                      ProdID INT,
                      SalesmanName VARCHAR(100),
                      DOS DATE,
                      FOREIGN KEY (ProdID) REFERENCES Product(ProdID)
);
