-- Last updated: 9/15/2026, 4:19:29 PM
# Write your MySQL query statement below
SELECT actor_id,
       director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(*) >= 3;