// main.ts
import BaseLogger, { ElasticLogger } from "./logger";
import User from "./user";
import UserService from "./userService"

console.log("User Component Yüklendi");

let logger1 = new ElasticLogger()
let userService = new UserService(logger1);

let user1 = new User(1, "Ertunç", "Ertekin", "Çanakkale");
let user2 = new User(2, "Ertuğrul", "Göreli", "İstanbul");
let user3 = new User(3, "Cengiz", "Koç", "Ankara");

userService.add(user1);
userService.add(user2);
userService.add(user3);

console.log(userService.list())
console.log(userService.getById(1))

//userService.getById(1);
//userService.list();
