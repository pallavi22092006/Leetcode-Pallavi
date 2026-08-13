-- Last updated: 8/13/2026, 11:22:27 AM
# Write your MySQL query statement below
SELECT 
    stock_name,
    SUM(CASE WHEN operation = 'Buy' THEN -price ELSE price END) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name;
