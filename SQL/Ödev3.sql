-- 1.Senaryo
SELECT country FROM country WHERE country LIKE 'A%a';
-- 2.Senaryo
SELECT country FROM country WHERE country LIKE '_____%n';
-- 3.Senaryo
SELECT title FROM film WHERE title ILIKE '%T%T%T%T%';
-- 4.Senaryo
SELECT title,length,rental_rate FROM film WHERE title LIKE 'C%' AND (length > 90 AND rental_rate = 2.99); 