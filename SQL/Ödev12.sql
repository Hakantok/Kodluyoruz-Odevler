-- 1. Senaryo
select count(*),(select avg(length) from film) from film
where  length>(select avg(length) from film) ;

-- 2. Senaryo
select count(rental_rate) from film 
where rental_rate = (select max(rental_rate) from film)

-- 3. Senaryo
select count(*) from film
where rental_rate = (select min(rental_rate) from film) and replacement_cost = (select min(replacement_cost) from film)

-- 4. Senaryo
SELECT  customer_id,COUNT(customer_id) FROM payment
GROUP BY customer_id
ORDER BY customer_id DESC;