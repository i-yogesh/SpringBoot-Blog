INSERT INTO product (available, brand, category, desc, name, price, quantity, release_date)
VALUES
    (TRUE, 'Apple', 'Electronics', 'Latest Apple iPhone', 'iPhone 15', 999.99, 50, PARSEDATETIME('03-01-2024', 'dd-MM-yyyy')),
    (TRUE, 'Samsung', 'Electronics', 'Samsung 4K Smart TV', 'Samsung QLED TV', 1299.99, 30, PARSEDATETIME('15-02-2024', 'dd-MM-yyyy')),
    (FALSE, 'Nike', 'Footwear', 'Running shoes with great comfort', 'Nike Air Zoom', 199.99, 0, PARSEDATETIME('10-01-2024', 'dd-MM-yyyy'));
