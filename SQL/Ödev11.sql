-- 1. Senaryo
(
    SELECT first_name  FROM actor
    ORDER BY first_name
)
UNION
(
	SELECT first_name  FROM actor
    ORDER BY first_name 
);

-- 2. Senaryo
(
    SELECT first_name FROM actor
    ORDER BY first_name
)
INTERSECT
(
    SELECT first_name FROM customer
    ORDER BY first_name 
);

-- 3. Senaryo
(
    SELECT first_name FROM actor
    ORDER BY first_name
)
EXCEPT
(
    SELECT first_name FROM customer
    ORDER BY first_name 
);

-- 4. Senaryo
-- =>
-- 1. Senaryo tekrar edenlerle birlikte
(
    SELECT first_name  FROM actor
    ORDER BY first_name
)
UNION ALL
(
	SELECT first_name  FROM actor
    ORDER BY first_name 
);

-- 2. Senaryo tekrar edenlerle birlikte
(
    SELECT first_name FROM actor
    ORDER BY first_name
)
INTERSECT ALL
(
    SELECT first_name FROM customer
    ORDER BY first_name 
);

-- 3. Senaryo tekrar edenlerle birlikte
(
    SELECT first_name FROM actor
    ORDER BY first_name
)
EXCEPT ALL
(
    SELECT first_name FROM customer
    ORDER BY first_name 
);