-- Last updated: 8/13/2026, 11:24:14 AM
# Write your MySQL query statement below
SELECT actor_id,
       director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(*) >= 3;