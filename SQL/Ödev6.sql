-- 1.Senaryo
SELECT ROUND(AVG(rental_rate), 2) FROM film;

-- 2.Senaryo
SELECT COUNT(title) FROM film WHERE title ILIKE 'C%';

-- 3.Senaryo
SELECT MAX(length) FROM film WHERE rental_rate = 0.99;

-- 4.Senaryo
SELECT COUNT(DISTINCT replacement_cost) FROM film
WHERE length > 150;

