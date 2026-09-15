-- Last updated: 9/15/2026, 4:19:10 PM
# Write your MySQL query statement below
SELECT ROUND(
    (
        SELECT COUNT(DISTINCT a.player_id)
        FROM Activity a
        JOIN (
            SELECT player_id,
                   MIN(event_date) AS first_date
            FROM Activity
            GROUP BY player_id
        ) b
        ON a.player_id = b.player_id
        AND DATEDIFF(a.event_date, b.first_date) = 1
    ) /
    (
        SELECT COUNT(DISTINCT player_id)
        FROM Activity
    ),
    2
) AS fraction;