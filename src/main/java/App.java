import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    get("/hello", (request,response) ->
    "<!DOCTYPE html>" +
      "<html>" +
      "<head>" +
        "<title>Hello Friend!</title>" +
        "<link rel='stylesheet' + href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
      "</head>" +
      "<body>" +
        "<div class='container'>" +
        "<h1>Hello From Afar</h1>" +
        "<p>Dear Friend,</p>" +
        "<p>How are you? I hope you are having a nice weekend. I'm vacationing at Epicodus on the 8th floor where I am learning programming and watching fire trucks go by on the street below like giant red ants, but louder.</p>" +
        "<p>My friend, you would not belive how cold it is here. I should have worn a snowsuit to school today.</p>" +
        "<p>But I like programming a lot, so once they turn this air conditioner off and my fingers thaw out I'm going to get right back to it.</p>" +
        "<p>Looking forward to seeing you soon. I'll bring you back a souvenir. They have chips and candy bars in the funky vending area, which would you prefer?</p>" +
        "<p>Cheers,</p>" +
        "<p>KAS</p>" +
        "</div>" +
      "</body>" +
      "</html>"
    );
  }
}
