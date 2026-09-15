-- Last updated: 9/15/2026, 4:19:26 PM
# Write your MySQL query statement below
SELECT product_name, year, price
FROM Sales
JOIN Product
ON Sales.product_id = Product.product_id;