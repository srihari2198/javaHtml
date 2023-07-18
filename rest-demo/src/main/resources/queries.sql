-- Create table "Employee"
CREATE TABLE Employee (
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  job_start_date DATE,
  salary INTEGER
);

-- Add a new column "department" to the "Employee" table
ALTER TABLE Employee
ADD department VARCHAR(50);

-- Find the highest salary from the "Employee" table
SELECT MAX(salary) FROM Employee;

-- Find all employees who joined in the last 6 months
SELECT *
FROM Employee
WHERE job_start_date >= DATE_SUB(CURRENT_DATE(), INTERVAL 6 MONTH);

-- Display the number of employees in each department
SELECT department, COUNT(first_name) AS 'number_of_employees' FROM Employee GROUP BY department;

-- Update the email_address on the consultant_detail table
UPDATE consultant_detail SET email_address = 'smith@gmail.com' WHERE id = 201;

-- Find the total number of submissions for each consultant
SELECT cd.id AS consultant_id, cd.first_name, COUNT(s.id) AS submission_count
FROM consultant_detail cd LEFT JOIN submission s ON cd.id = s.consultant_id
GROUP BY cd.id;

-- Find the total number of submissions for each consultant by each submission day
SELECT cd.id AS consultant_id, cd.first_name, s.submission_date, COUNT(s.id) AS submission_count
FROM consultant_detail cd LEFT JOIN submission s ON cd.id = s.consultant_id
GROUP BY cd.id, s.submission_date
ORDER BY s.submission_date;

-- Delete all submissions where "rate" is null
DELETE FROM submission
WHERE pay_rate IS NULL;

-- Find the submissions for a given lead name and submission date
SELECT s.*
FROM submission s
JOIN consultant_detail c ON s.consultant_id = c.id
JOIN lead_detail l ON c.lead_id = l.id
WHERE l.first_name = 'John' AND s.submission_date = '2023-07-01';

-- Find the number of submissions by each lead
SELECT l.first_name, COUNT(s.id) AS submissions
FROM lead_detail l
JOIN consultant_detail cd ON cd.lead_id = l.id
LEFT JOIN submission s ON s.consultant_id = cd.id
GROUP BY l.id;
