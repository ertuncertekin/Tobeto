export default class User {
    id: number;
    firstName: string;
    lastName: string;
    city: string;

    constructor(id: number, firstName: string, lastName: string, city: string) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }
}
