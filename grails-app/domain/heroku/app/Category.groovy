package heroku.app

class Category {

    static constraints = {
        name blank: false, nullable: false
        grade range: 1..13
    }
    
    static hasMany = [topics : Topic]
        
    String name
    int grade
    
}