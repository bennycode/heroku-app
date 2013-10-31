package heroku.app

class Topic {

    String name

    static hasMany = [content: String]

    static constraints = {
    }
}
