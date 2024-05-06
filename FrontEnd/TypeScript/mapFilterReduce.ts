let cart = [
    { id: 1, productName: "Telefon", quantity: 3, unitPrice: 4000 },
    { id: 2, productName: "Bardak", quantity: 2, unitPrice: 30 },
    { id: 3, productName: "Kalem", quantity: 1, unitPrice: 20 },
    { id: 4, productName: "Şarj Cihazı", quantity: 2, unitPrice: 100 },
    { id: 5, productName: "Kitap", quantity: 3, unitPrice: 30 },
    { id: 6, productName: "Pot", quantity: 5, unitPrice: 150 },
];

//İçine gönderiyor
//cart.push({ id: 7, productName: "Monitör", quantity: 1, unitPrice: 5000 })

//Map-döngüye sokarak istediğim veri ne varsa onu veriyor
console.log("<ul>")
cart.map(product => {
    console.log("<li>" + product.productName + " : "
        + product.unitPrice * product.quantity + " TL" + "</li>")
});
console.log("</ul>")

//Filter--Filtreleme yaptırarak veriler arasında seçim yapabiliyorum
let filteredProducts = cart.filter(product => product.quantity >= 1 && product.productName.includes('a'));
console.log(filteredProducts);

//Reduce--Kümülatif toplam yaptık
let total = cart.reduce((acc: number, product) => acc + product.unitPrice * product.unitPrice, 0); //acc=accumilator
console.log(total);


function addToCart(sepet: any) {
    sepet.push({ id: 7, productName: "Monitör", quantity: 1, unitPrice: 5000 })
}

addToCart(cart)

console.log(cart);

// ts-node mapFilterReduce.ts

let sayi: number = 10;

function sayiTopla(number: number) {
    number += 1
}
sayiTopla(sayi)
console.log(sayi)