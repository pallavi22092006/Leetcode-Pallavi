-- Last updated: 8/13/2026, 11:28:28 AM
# Write your MySQL query statement below
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(*) DESC
LIMIT 1;