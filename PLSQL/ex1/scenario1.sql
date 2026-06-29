
BEGIN
  FOR rec IN (SELECT customer_id FROM customers WHERE age > 60) LOOP
    UPDATE loans SET interest_rates = interest_rates * 0.99 WHERE customer_id = rec.customer_id;
  END LOOP;
END;
/