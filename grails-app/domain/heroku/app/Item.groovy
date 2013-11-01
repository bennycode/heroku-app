package heroku.app

class Item {
    
    // http://coderberry.me/blog/2012/04/23/grails-domain-classes-and-enums/
    enum ContentType {
        FORMULA,
        IMAGE, 
        TEXT
    }
    
    static constraints = {
        type blank: false
        content blank: false, nullable: false
    }

    ContentType type
    String content

}