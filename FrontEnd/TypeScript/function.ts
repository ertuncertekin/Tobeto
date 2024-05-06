/*

//Fonksiyon
function addToCart(quantity: number, productName: string = "Kivi") {
    console.log("Sepete Eklendi: " + productName + " adet: " + quantity)
}

//addToCart();
addToCart(20);
//addToCart("Elma");

let sayHello = () => { console.log("Hello World") }; //Arrow Function-Modern
sayHello();

let sayHello2 = function () {
    console.log("Hello World 2")
}; //Geleneksel
sayHello2();

function addToCart2(productName: string, quantity: number, unitPrice: number) {
    console.log("Ürün Adı " + productName + " Ürün Adedi " + quantity + " Ürün Fiyatı " + unitPrice + " TL");
};
addToCart2("Soda", 30, 50);

//////////
class Product {
    productName: string;
    unitPrice: number;
    quantity: number;

    constructor(productName: string, unitPrice: number, quantity: number) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
}

let product1: Product = {
    productName: "Elma",
    unitPrice: 10,
    quantity: 20
}
let product2: Product = {
    productName: "Bilgisayar",
    unitPrice: 30,
    quantity: 10
};
let product3: Product = {
    productName: "Telefon",
    unitPrice: 50,
    quantity: 40
}

function addToCart3(product: Product) {
    console.log(
        "Ürün: " + product.productName +
        " Ürün Fiyatı " + product.unitPrice +
        " Ürün Adedi " + product.quantity);
}

addToCart3(product1); */

//////////

/*product2 = product3;
product2.productName = "Karpuz";
console.log(product3.productName)*/

/*
let sayi1: number = 10;
let sayi2: number = 20;

//Sayılar değerdir. obje ve array'lar referanstır.
sayi1 = sayi2;
sayi2 = 100;
console.log(sayi1);

function addToCart4(products: Product[]) {
    console.log(products);
};

let products: Product[] = [product1, product2, product3];
addToCart4(products);

//Parametre ile fonksiyon oluşturduk
function add(number1: number, number2: number) {
    console.log(number1 + number2);
}
add(20, 30);

//Sınırsız Şekilde parametre gönderebilmek için!
function add2(bisey: unknown, ...numbers: number[]) { //rest
    let sum: number = 0
    for (let i = 0; i < numbers.length; i++) {
        sum += numbers[i]
        //console.log(numbers[i]);
    }
    console.log(sum);
    console.log(bisey)

}

add2(10, 30, 40, 35);
add2(5, 35, 60); */