select * from products;

--1. Product isimlerini (`ProductName`) ve birim başına miktar (`QuantityPerUnit`) değerlerini almak için sorgu yazın.

SELECT product_name,quantity_per_unit from products;

--2. Ürün Numaralarını (`ProductID`) ve Product isimlerini (`ProductName`) değerlerini almak için sorgu yazın. Artık satılmayan ürünleri (`Discontinued`) filtreleyiniz.

SELECT product_id,product_name from products where discontinued=1;

--3. Durdurulmayan (`Discontinued`) Ürün Listesini, Ürün kimliği ve ismi (`ProductID`, `ProductName`) değerleriyle almak için bir sorgu yazın.

SELECT product_id,product_name from products where discontinued=0;

--4. Ürünlerin maliyeti 20'dan az olan Ürün listesini (`ProductID`, `ProductName`, `UnitPrice`) almak için bir sorgu yazın.

SELECT product_id,product_name,unit_price FROM products WHERE unit_price<20;

--5. Ürünlerin maliyetinin 15 ile 25 arasında olduğu Ürün listesini (`ProductID`, `ProductName`, `UnitPrice`) almak için bir sorgu yazın.

SELECT product_id,product_name,unit_price FROM products where unit_price BETWEEN 15 AND 25;

--6. Ürün listesinin (`ProductName`, `UnitsOnOrder`, `UnitsInStock`) stoğun siparişteki miktardan az olduğunu almak için bir sorgu yazın.

SELECT product_name FROM products where units_in_stock<units_on_order;

--7. İsmi `a` ile başlayan ürünleri listeleyeniz.

SELECT product_name FROM products where product_name LIKE 'T%';

--8. İsmi `i` ile biten ürünleri listeleyeniz.

SELECT product_name FROM products where product_name LIKE '%i';

--9. Ürün birim fiyatlarına %18’lik KDV ekleyerek listesini almak (ProductName, UnitPrice, UnitPriceKDV) için bir sorgu yazın.

SELECT product_name,unit_price,unit_price*1.18 As "Unit_Price_KDV"  FROM products;

--10. Fiyatı 30 dan büyük kaç ürün var?

SELECT COUNT(*) As "Fiyatı_30_Dan_buyuk_urunler" from products where unit_price>30;
select product_id,product_name,unit_price from products where unit_price>30;

--11. Ürünlerin adını tamamen küçültüp fiyat sırasına göre tersten listele

SELECT LOWER(product_name),unit_price FROM products ORDER BY unit_price DESC;

--12. Çalışanların ad ve soyadlarını yanyana gelecek şekilde yazdır
SELECT * FROM employees;
SELECT first_name,last_name FROM employees;

--13. Region alanı NULL olan kaç tedarikçim var?
SELECT * FROM employees;
SELECT first_name,last_name,region FROM employees where region IS null;
SELECT COUNT('region') As "Null Olanlar" FROM employees WHERE region IS null;

--14. a.Null olmayanlar?

SELECT first_name,last_name,region FROM employees where region IS NOT null;
SELECT COUNT('region') As "Null Olanlar" FROM employees WHERE region IS NOT null;

--15. Ürün adlarının hepsinin soluna TR koy ve büyültüp olarak ekrana yazdır.

SELECT * FROM products;
SELECT product_name,UPPER('TR_'||product_name) FROM products; -- || METİN BİRLEŞTİRDİK

-- 16. a.Fiyatı 20den küçük ürünlerin adının başına TR ekle

SELECT * FROM products;
SELECT 'TR_'||product_name,unit_price FROM products WHERE unit_price<20 ORDER BY unit_price ASC;

--17. En pahalı ürün listesini (`ProductName` , `UnitPrice`) almak için bir sorgu yazın.
SELECT * FROM products;
SELECT product_name,unit_price FROM products where unit_price=(SELECT MAX(unit_price) FROM products);

--18. En pahalı on ürünün Ürün listesini (`ProductName` , `UnitPrice`) almak için bir sorgu yazın.

SELECT product_name,unit_price FROM products ORDER BY unit_price DESC LIMIT 10; --Limit Tanımladık

--19. Ürünlerin ortalama fiyatının üzerindeki Ürün listesini (`ProductName` , `UnitPrice`) almak için bir sorgu yazın.

SELECT product_name,unit_price AS "Ortalamanın Üzerindekiler" FROM products where unit_price>(SELECT AVG(unit_price) FROM products);

--20. Stokta olan ürünler satıldığında elde edilen miktar ne kadardır.

SELECT SUM(unit_price) AS "Stoktaki Ürünlerin Fiyat Toplamı"  FROM products where units_in_stock!=0;

--21. Mevcut ve Durdurulan ürünlerin sayılarını almak için bir sorgu yazın.

SELECT * FROM products;
SELECT product_name,units_in_stock,discontinued FROM products WHERE units_in_stock!=0 AND discontinued=1;
SELECT COUNT(*) AS "Stokta Olan Ve Durdurulan" FROM products WHERE units_in_stock!=0 AND discontinued=1;

--22. Ürünleri kategori isimleriyle birlikte almak için bir sorgu yazın.

SELECT * FROM products;
SELECT product_name AS "Ürün_Adı",categories.category_name AS "Kategori_Adı" ,unit_price 
FROM products 
INNER JOIN categories ON products.category_id=categories.category_id 
WHERE categories.category_name='Beverages';

--23. Ürünlerin kategorilerine göre fiyat ortalamasını almak için bir sorgu yazın.

SELECT categories.category_name, AVG(unit_price) AS "Fiyat_Ortalaması"
FROM products
INNER JOIN categories ON products.category_id=categories.category_id
GROUP BY(categories.category_name);

--24. En pahalı ürünümün adı, fiyatı ve kategorisin adı nedir?

SELECT product_name AS "Ürün_Adı", unit_price AS "ÜrüN_Fiyatı" , categories.category_name
FROM products
INNER JOIN categories ON products.category_id=categories.category_id
WHERE unit_price=(SELECT MAX(unit_price) FROM Products);

--25. En çok satılan ürününün adı, kategorisinin adı ve tedarikçisinin adı

--Doğruluk Kontrolü
select product_name,units_on_order from products where units_on_order=(SELECT MAX(units_on_order) FROM products);
select supplier_id,company_name from suppliers;
select category_id,category_name from categories;

SELECT product_name AS "Ürün_Adı", categories.category_name AS "Kategori_Adı",suppliers.company_name AS "Tedarikçi_Firma",units_on_order AS "Sipariş_Adedi"
FROM products
INNER JOIN categories ON products.category_id=categories.category_id
INNER JOIN suppliers ON products.supplier_id=suppliers.supplier_id
WHERE units_on_order=(SELECT MAX(units_on_order) FROM products)
