CREATE PROCEDURE UpdateEmployeeBonus(
  bonus_percentage IN NUMBER
)
AS
BEGIN
  UPDATE employees
  SET salary = salary + salary * (bonus_percentage / 100)
  WHERE department = 'Sales';
END;
/