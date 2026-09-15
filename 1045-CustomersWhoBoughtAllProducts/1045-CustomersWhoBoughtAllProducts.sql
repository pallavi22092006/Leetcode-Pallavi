-- Last updated: 9/15/2026, 4:19:31 PM
# Write your MySQL query statement below
SELECT customer_id
FROM Customer
GROUP BY customer_id
HAVING COUNT(DISTINCT product_key) =
(
    SELECT COUNT(*)
    FROM Product
);