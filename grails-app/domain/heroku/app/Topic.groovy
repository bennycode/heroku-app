package heroku.app

class Topic {

    static constraints = {
        name blank: false, nullable: false
    }
    
    static hasMany = [items: Item]
    
    String name
    
}