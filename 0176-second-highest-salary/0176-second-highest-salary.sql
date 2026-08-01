# Write your MySQL query statement below
SELECT max( distinct(salary)) as SecondHighestSalary FROM Employee where salary<(select
MAX(salary) from employee);