package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>MultiShop - Online Shop Website Template</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"keywords\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Web Fonts -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap\" rel=\"stylesheet\">  \n");
      out.write("\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Libraries Stylesheet -->\n");
      out.write("        <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            .container-fluid, .hm\n");
      out.write("            {\n");
      out.write("                background-color: #F5DEB3;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid py-5\" id = \"2\">\n");
      out.write("            <div class=\"row px-xl-5\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"owl-carousel vendor-carousel\">\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/vendor-1.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/uniqlo.png\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/vendor-3.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/vendor-4.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/vendor-5.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/vendor-6.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/vendor-7.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/vendor-8.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Vendor End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Footer Start -->\n");
      out.write("        <div class=\"container-fluid bg-dark text-secondary mt-5 pt-5\" class = \"hm\">\n");
      out.write("            <div class=\"row px-xl-5 pt-5\">\n");
      out.write("                <div class=\"col-lg-4 col-md-12 mb-5 pr-3 pr-xl-5\">\n");
      out.write("                    <h5 class=\"text-secondary text-uppercase mb-4\">Get In Touch</h5>\n");
      out.write("                    <p class=\"mb-4\">No dolore ipsum accusam no lorem. Invidunt sed clita kasd clita et et dolor sed dolor. Rebum tempor no vero est magna amet no</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt text-primary mr-3\"></i>123 Street, New York, USA</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-envelope text-primary mr-3\"></i>info@example.com</p>\n");
      out.write("                    <p class=\"mb-0\"><i class=\"fa fa-phone-alt text-primary mr-3\"></i>+012 345 67890</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-8 col-md-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4 mb-5\">\n");
      out.write("                            <h5 class=\"text-secondary text-uppercase mb-4\">Quick Shop</h5>\n");
      out.write("                            <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Shopping Cart</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Checkout</a>\n");
      out.write("                                <a class=\"text-secondary\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 mb-5\">\n");
      out.write("                            <h5 class=\"text-secondary text-uppercase mb-4\">My Account</h5>\n");
      out.write("                            <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Shopping Cart</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Checkout</a>\n");
      out.write("                                <a class=\"text-secondary\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 mb-5\">\n");
      out.write("                            <h5 class=\"text-secondary text-uppercase mb-4\">Newsletter</h5>\n");
      out.write("                            <p>Duo stet tempor ipsum sit amet magna ipsum tempor est</p>\n");
      out.write("                            <form action=\"\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Your Email Address\">\n");
      out.write("                                    <div class=\"input-group-append\">\n");
      out.write("                                        <button class=\"btn btn-primary\">Sign Up</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                            <h6 class=\"text-secondary text-uppercase mt-4 mb-3\">Follow Us</h6>\n");
      out.write("                            <div class=\"d-flex\">\n");
      out.write("                                <a class=\"btn btn-primary btn-square mr-2\" href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                                <a class=\"btn btn-primary btn-square mr-2\" href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                                <a class=\"btn btn-primary btn-square mr-2\" href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                                <a class=\"btn btn-primary btn-square\" href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row border-top mx-xl-5 py-4\" style=\"border-color: rgba(256, 256, 256, .1) !important;\">\n");
      out.write("                <div class=\"col-md-6 px-xl-0\">\n");
      out.write("                    <p class=\"mb-md-0 text-center text-md-left text-secondary\">\n");
      out.write("                        &copy; <a class=\"text-primary\" href=\"#\">Domain</a>. All Rights Reserved. Designed\n");
      out.write("                        by\n");
      out.write("                        <a class=\"text-primary\" href=\"https://htmlcodex.com\">HTML Codex</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 px-xl-0 text-center text-md-right\">\n");
      out.write("                    <img class=\"img-fluid\" src=\"img/payments.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Footer End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Back to Top -->\n");
      out.write("        <a href=\"#\" class=\"btn btn-primary back-to-top\"><i class=\"fa fa-angle-double-up\"></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- JavaScript Libraries -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("        <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Contact Javascript File -->\n");
      out.write("        <script src=\"mail/jqBootstrapValidation.min.js\"></script>\n");
      out.write("        <script src=\"mail/contact.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Template Javascript -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
