// userService.ts
import User from "./user";
import LoggerService from "./logger";

export default class UserService {
    users: User[];
    loggerService: LoggerService;

    constructor(loggerService: LoggerService) {
        this.users = [];
        this.loggerService = loggerService;
    }

    add(user: User) {
        this.users.push(user);
        this.loggerService.log(user);
    }

    list() {
        return this.users;
    }

    getById(id: number) {
        return this.users.find(u => u.id === id);
    }
}
