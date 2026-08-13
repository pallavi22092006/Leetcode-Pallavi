-- Last updated: 8/13/2026, 11:28:18 AM
# Write your MySQL query statement below
SELECT name, population, area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;