-- Last updated: 8/13/2026, 11:34:18 AM
SELECT name AS Customers
FROM Customers
WHERE id NOT IN (
    SELECT customerId
    FROM Orders
);