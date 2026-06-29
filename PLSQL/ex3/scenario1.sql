CREATE PROCEDURE ProcessMonthlyInterest
AS
BEGIN
  UPDATE accounts 
  SET balance = balance * 1.01
  WHERE account_type = 'savings';
END;