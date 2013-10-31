package heroku.app

class Category {

    String name
    int grade

    static hasMany = [topics : Topic]

    static constraints = {
        grade range: 1..13
    }
}
