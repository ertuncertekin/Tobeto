let message: string = "Hello World";
console.log(message);

let dolarDun: number = 35;
let dolarBugun: number = 30;

{ //Kendi İçinde Çalışıyor
    let dolarDun: number = 50;
    console.log(dolarDun);
}

const euroDun: number = 14;

console.log(dolarDun);

//array
let konutKredileri: string[] = ["Konut Kredisi", "Emlak Konut Kredisi", "Kamu Konut Kredisi"];
let multiArray: [string, number, string[]] = ["Deneme", 4, ["a", "b", "c"]];
console.log(konutKredileri);
console.log(multiArray);

//Döngü
for (let i = 0; i < konutKredileri.length; i++) {
    console.log(konutKredileri[i]);
}

let sayilar: number[] = [40, 300, 30, 10]
console.log(...sayilar)
console.log(Math.max(...sayilar))  //Math bir dizi istediğinden ... ekledik.

let [icAnadolu, marmara, akdeniz] = [
    { name: "İç Anadolu", nufus: "20M" },
    { name: "marmara", nufus: "30M" },
    { name: "akdeniz", nufus: "5M" }]

console.log(marmara.nufus)