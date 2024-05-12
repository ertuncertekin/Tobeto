SELECT * FROM Products
INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID
WHERE Categories.CategoryID IN (1,2,3) AND UnitPrice >= 20
ORDER BY UnitPrice ASC;

SELECT DISTINCT(Country) FROM Customers ;--�oklayanlar� Yok Ettik

SELECT TOP 5 Categories.CategoryName FROM Categories;  --�LK 5 Kayd� getirdik --Top 20 PERCENT �lk y�zde 20lik kayd� getir.

SELECT * FROM Products
WHERE Products.UnitsInStock>60;

SELECT * FROM Employees
WHERE BirthDate='1958-01-09';

SELECT * FROM Customers --�lke almanya �ehir berlin veya k�ln
WHERE Country='Germany' AND (City='Berlin' OR City='K�ln');

SELECT * FROM Customers --�lke almanya �ehir berlin olmayanlar
WHERE Country='Germany' AND NOT City='Berlin';

SELECT * FROM Customers
ORDER BY CompanyName ASC;

SELECT Country,City FROM Customers --�lkeye g�re s�ralad�k. sonra �lkenin �ehirlerine g�re s�ralad�k.
ORDER BY Country ASC,City ASC;

SELECT DISTINCT TOP 5 Country FROM Customers  --
WHERE Region IS NOT NULL
ORDER BY Country DESC;

INSERT INTO Categories (CategoryName,[Description],Picture)
VALUES(
'Cozmetik','Kozmetik �r�nleri parf�m vs','0x1523678163781273761893'
);

INSERT INTO Categories (CategoryName,[Description],Picture)
VALUES(
'Mobilya',DEFAULT,'0x15236SADSS'  --default verdi�imiz '---' yi girmi� olduk.
);

DELETE FROM Categories  --12 nolu id'ye sahip kategoriyi sildik
WHERE CategoryID = 12;

SELECT * FROM Categories;

UPDATE Categories SET CategoryName='Bilgisayar',Description='Ekran Kart� vs' 
WHERE CategoryID=10;  --update ettik

TRUNCATE TABLE Categories2 --Tabloyu s�f�rlar ilk haline getirir.id'ler 1 den ba�lar.

SELECT * FROM Products
WHERE UnitPrice = (SELECT MIN(UnitPrice) FROM Products); --subquerry

SELECT MAX(UnitPrice) FROM Products;

SELECT TOP 1 * FROM Products --EN UCUZU GET�RD�M DESC EN pahal� olurdu
ORDER BY UnitPrice ASC;

--Null olanlar da say�l�r)
SELECT COUNT(*) FROM Products
WHERE Discontinued=1;

SELECT COUNT(UnitsOnOrder) FROM Products; --kolon girersem vermez

SELECT AVG(UnitPrice) AS [ORTALAMA F�YAT] FROM Products
WHERE Discontinued=1;

SELECT SUM(UnitPrice) AS [TOPLAM F�YAT] FROM Products
WHERE Discontinued=0;

SELECT * FROM Customers
WHERE CompanyName LIKE 'alfred%';

SELECT * FROM Customers
WHERE CompanyName LIKE '%a';

SELECT * FROM Customers
WHERE CompanyName LIKE '%cia%';

SELECT * FROM Customers
WHERE CompanyName LIKE '_r%'; --ilk harf ne olursa olsun ikinci harfi r olsun sonras� ne olursa olsun her bir '_' bir karakteri temsil eder

SELECT * FROM Customers
WHERE CompanyName LIKE '[a-d]%'; --a ve d harfiyle ba�layanlar� getirir

SELECT * FROM Customers
WHERE Country IN ('Mexico','UK','T�rkiye');

SELECT * FROM Categories
WHERE CategoryID IN (1,3,5);

SELECT * FROM Products
WHERE UnitPrice BETWEEN 18 AND 29;

SELECT * FROM Employees --Tarih aral���na g�re getirdik
WHERE BirthDate BETWEEN '1948-11-06' AND '1958-01-11';