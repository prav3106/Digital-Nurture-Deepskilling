BEGIN
  FOR rec IN (SELECT c.name FROM customers c JOIN loans l ON c.customer_id = l.customer_id WHERE due_date > SYSDATE <= 30 AND due_date > SYSDATE) LOOP
    DBMS_OUTPUT.PUT_LINE('Customer: ' || rec.name || ' has a loan due in the next 30 days.');
  END LOOP;
END;
/