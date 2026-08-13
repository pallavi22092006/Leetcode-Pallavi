-- Last updated: 8/13/2026, 11:24:12 AM
# Write your MySQL query statement below
SELECT product_name, year, price
FROM Sales
JOIN Product
ON Sales.product_id = Product.product_id;