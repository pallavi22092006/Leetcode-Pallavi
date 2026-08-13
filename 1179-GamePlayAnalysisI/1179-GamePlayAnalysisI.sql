-- Last updated: 8/13/2026, 11:23:54 AM
# Write your MySQL query statement below
select player_id,
     MIN(event_date) AS first_login
from Activity
group by player_id; 