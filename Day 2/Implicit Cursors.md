DECLARE  
   total_rows number(2); 
BEGIN 
   UPDATE customers 
   SET runs = runs + 500; 
   IF sql%notfound THEN 
      dbms_output.put_line('no player selected'); 
   ELSIF sql%found THEN 
      total_rows := sql%rowcount;
      dbms_output.put_line( total_rows || ' player selected '); 
   END IF;  
END; 
