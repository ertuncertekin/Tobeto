export default class BaseLogger {
    log(data: any) {
    }
}

export class ElasticLogger extends BaseLogger {
    log(data: any) {
        console.log("Logged to Elastic" + data)
    }
}

export class MonoLogger extends BaseLogger {
    log(data: any) {
        console.log("Logged to Mongo" + data)
    }
}