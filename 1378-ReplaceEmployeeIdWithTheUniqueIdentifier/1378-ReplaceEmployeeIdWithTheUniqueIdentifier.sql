-- Last updated: 9/15/2026, 4:17:58 PM
# Write your MySQL query statement below
SELECT u.unique_id, e.name
FROM Employees e
LEFT JOIN EmployeeUNI u
ON e.id = u.id;