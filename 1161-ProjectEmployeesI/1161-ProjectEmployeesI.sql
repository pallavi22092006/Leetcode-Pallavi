-- Last updated: 8/13/2026, 11:24:04 AM
# Write your MySQL query statement below
SELECT p.project_id,
       ROUND(AVG(e.experience_years), 2) AS average_years
FROM Project p
JOIN Employee e
ON p.employee_id = e.employee_id
GROUP BY p.project_id;