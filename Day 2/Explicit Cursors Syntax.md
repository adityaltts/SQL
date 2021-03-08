// Declaring the Cursor

CURSOR c_player IS 
SELECT id, name, skills FROM player;


// Opening the Cursor

OPEN c_player;


// Fetching the Cursor

FETCH c_player INTO c_id, c_name, c_skills;



// Closing the Cursor

CLOSE c_player;
