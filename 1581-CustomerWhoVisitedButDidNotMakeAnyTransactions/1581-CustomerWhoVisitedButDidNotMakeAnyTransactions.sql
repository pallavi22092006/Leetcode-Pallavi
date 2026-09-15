-- Last updated: 9/15/2026, 4:17:32 PM
# Write your MySQL query statement below
SELECT customer_id,
       COUNT(*) AS count_no_trans
FROM Visits
WHERE visit_id NOT IN (
    SELECT visit_id
    FROM Transactions
)
GROUP BY customer_id;