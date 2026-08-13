-- Last updated: 8/13/2026, 11:21:56 AM
# Write your MySQL query statement below
SELECT
    u.name,
    SUM(t.amount) AS balance
FROM Users u
JOIN Transactions t
ON u.account = t.account
GROUP BY u.account, u.name
HAVING SUM(t.amount) > 10000;