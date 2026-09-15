-- Last updated: 9/15/2026, 4:19:14 PM
# Write your MySQL query statement below
select player_id,
     MIN(event_date) AS first_login
from Activity
group by player_id; 