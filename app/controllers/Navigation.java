package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class Navigation extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    public Result about() {
        return ok(about.render("Your new application is ready."));
    }
    public Result page() {
        return ok(page.render("Your new application is ready."));
    }
    public Result page2() {
        return ok(page2.render("Your new application is ready."));
    }
    public Result contact() {
        return ok(contact.render("Your new application is ready."));
    }
    public Result login() {
        return ok(login.render("Your new application is ready."));
    }
    public Result register() {
        return ok(register.render("Your new application is ready."));
    }

}
