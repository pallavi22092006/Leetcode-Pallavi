-- Last updated: 8/13/2026, 11:28:13 AM
# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;