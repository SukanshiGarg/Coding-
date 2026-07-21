# Write your MySQL query statement below
select user_id,max(time_stamp) as last_stamp
#obtaining latest login from all users
from Logins
where YEAR(time_stamp)=2020
Group By user_id;