BEGIN
  FOR rec IN (SELECT id FROM accounts WHERE balance > 10000) LOOP
    UPDATE accounts SET IsVIP = TRUE WHERE id = rec.id;
  END LOOP;
END;
/