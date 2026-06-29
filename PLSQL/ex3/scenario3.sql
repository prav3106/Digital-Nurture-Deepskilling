CREATE PROCEDURE TransferFunds(
  amount IN NUMBER,
  from_account IN NUMBER,
  to_account IN NUMBER
)
AS
BEGIN
  v_balance = SELECT balance INTO v_balance FROM accounts WHERE account_id = from_account;
  if v_balance >= amount then
    UPDATE accounts SET balance = balance - amount WHERE account_id = from_account;
    UPDATE accounts SET balance = balance + amount WHERE account_id = to_account;
  else
    DBMS_OUTPUT.PUT_LINE("Insufficient Balance");
  end if;
END;