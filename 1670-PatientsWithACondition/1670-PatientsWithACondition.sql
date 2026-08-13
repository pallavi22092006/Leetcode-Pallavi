-- Last updated: 8/13/2026, 11:22:02 AM
# Write your MySQL query statement below
SELECT *
FROM Patients
WHERE conditions LIKE 'DIAB1%'
   OR conditions LIKE '% DIAB1%';