-- Last updated: 8/13/2026, 11:27:51 AM
# Write your MySQL query statement below
SELECT x,
       y,
       z,
       CASE
           WHEN x + y > z
            AND x + z > y
            AND y + z > x
           THEN 'Yes'
           ELSE 'No'
       END AS triangle
FROM Triangle;