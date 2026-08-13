-- Last updated: 8/13/2026, 11:21:33 AM
# Write your MySQL query statement below
SELECT event_day AS day,
       emp_id,
       SUM(out_time - in_time) AS total_time
FROM Employees
GROUP BY event_day, emp_id;