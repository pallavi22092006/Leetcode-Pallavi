-- Last updated: 8/13/2026, 11:27:38 AM
# Write your MySQL query statement below
UPDATE Salary
SET sex =
CASE
    WHEN sex = 'm' THEN 'f'
    ELSE 'm'
END;