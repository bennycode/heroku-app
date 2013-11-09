package heroku.app

import java.text.SimpleDateFormat

class DateTagLib {
  static defaultEncodeAs = 'html'
  //static encodeAsForTags = [tagName: 'raw']
  def longDate = { attrs, body ->
    //parse the incoming date
    def b = attrs.body ?: body().toString()
    def d = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(b)

    //if no format attribute is supplied, use this
    def pattern = attrs["format"] ?: "dd.MM.yyyy"
    out << new SimpleDateFormat(pattern).format(d)
  }
}
