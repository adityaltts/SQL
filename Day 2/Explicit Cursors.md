DECLARE 
   c_id player.id%type; 
   c_name player.name%type; 
   c_skills player.skills%type; 
   CURSOR c_player is 
      SELECT id, name, skills FROM player; 
BEGIN 
   OPEN c_player; 
   LOOP 
   FETCH c_player into c_id, c_name, c_skills; 
      EXIT WHEN c_player%notfound; 
      dbms_output.put_line(c_id || ' ' || c_name || ' ' || c_skills); 
   END LOOP; 
   CLOSE c_player; 
END; 
