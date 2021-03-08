CREATE DEFINER=`root`@`localhost` PROCEDURE `getCount`()<br>
BEGIN<br>
select count(Moviename) from movie where length>18;<br>
END<br>
call productioninformation.getCount();<br>
Output:6<br>

Movienames
CREATE DEFINER=`root`@`localhost` PROCEDURE `getMoviename`()<br>
BEGIN<br>
select Moviename from movie where Movietype like "drama%";<br>
END<br>
call productioninformation.getMoviename();<br>
out put<br>
# Moviename<br>
'Padmavaat'<br>
'Badhaai Ho'<br>
'Rangoon'<br>
'Bahubali-The_Beginning'<br>
'Maryada Ramanna'<br>
'Khaidi No. 150'<br>
'The Villain'<br>


Details<br>
CREATE DEFINER=`root`@`localhost` PROCEDURE `Details`()<br>
BEGIN<br>
select Moviename from movie where language like "t%";<br>
END<br>
call productioninformation.Details();<br>
# Moviename<br>
'Bahubali-The_Beginning'<br>
'Maryada Ramanna'<br>
'Khaidi No. 150'<br>
'Bharath Ane nenu'<br>
'Gruham '<br>
'2.0'<br>
'Aval'<br>


Min Length<br>
CREATE DEFINER=`root`@`localhost` PROCEDURE `minlength`()<br>
BEGIN<br>
select Moviename from movie where length=(select max(length)from movie);<br>
END<br>
call productioninformation.minlength();<br>
# Moviename<br>
'Padmavaat'<br>
'Bahubali-The_Beginning'<br>
'K G F chapter 1'<br>
 
 Result<br>
 CREATE DEFINER=`root`@`localhost` PROCEDURE `Result`()<br>
BEGIN<br>
select * from Productions;<br>
END<br>
call productioninformation.Result();<br>
1010	Hari Om Entertainment	Mumbai	2008	Akshay Kumar<br>
1111	STP	chennai	2018	Sree<br>
1854	Jungle Pictures	Mumbai	2014	Vineeth Jain<br>
1899	Vaicom18Studios	Mumbai	2008	Ajith Andhare<br>
1988	Red Chillies Entertainment	Mumbai	2003	Shah Ruck<br>
2341	CRM	Bangalore	2017	Manohar<br>
6773	Hombale Flims	Bangalore	1995	Vijay<br>
7682	Mythri Movie Makers	Hyderabad	2015	Naveen Yerneni<br>
7882	DVV Entertainments	Hyderabad	1993	DVV Danayya<br>
8892	Lyka Productions	Chennai	2014	Subaskaran<br>
9091	Arkamediaworks	Hyderabad	2001	Shobu Yarlagada<br>





