package heroku.app

class Item {
    
    // http://coderberry.me/blog/2012/04/23/grails-domain-classes-and-enums/
    // https://sites.google.com/a/pintailconsultingllc.com/groovy-and-grails/Home/gorm-and-domain-object-modeling/domain-object-modeling-with-groovy-enums
    enum ItemType {
        FORMULA,
        IMAGE, 
        TEXT
    }
    
    static constraints = {
        type blank: false
        content blank: false, nullable: false
    }

    ItemType type
    String content

}