-- Last updated: 8/13/2026, 11:28:49 AM
SELECT e.name
FROM Employee e
JOIN Employee m
ON e.id = m.managerId
GROUP BY e.id, e.name
HAVING COUNT(*) >= 5;