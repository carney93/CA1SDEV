
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Employee],List[models.Department],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee],department: List[models.Department],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Employees", user)/*2.25*/{_display_(Seq[Any](format.raw/*2.26*/("""
     

"""),format.raw/*5.70*/("""
	"""),_display_(/*6.3*/if(flash.containsKey("success"))/*6.35*/ {_display_(Seq[Any](format.raw/*6.37*/("""
		"""),format.raw/*7.3*/("""<div class="alert alert-success">
			"""),_display_(/*8.5*/flash/*8.10*/.get("success")),format.raw/*8.25*/("""
		"""),format.raw/*9.3*/("""</div>
	""")))}),format.raw/*10.3*/(""" 

        """),format.raw/*12.9*/("""<!-- Main -->  
      
      <div class= container-fluid padding>
           <div class="employees">
          
              <div class ="pageTitle">
              <div class="col-sm-12">
                     <h1> Employees on the System</h1>
              </div>
                  </div>
                       
              <div class="row text-center">
                        
                      	<div class="col-sm-3">
		<h4>View Employees by Department</h4>
		<div class="list-group">
			<a href=""""),_display_(/*28.14*/routes/*28.20*/.HomeController.employees(0)),format.raw/*28.48*/("""" class="list-group-item">All Departments</a>
			"""),_display_(/*29.5*/for(d<-department) yield /*29.23*/ {_display_(Seq[Any](format.raw/*29.25*/("""
                """),format.raw/*30.17*/("""<a href=""""),_display_(/*30.27*/routes/*30.33*/.HomeController.employees(d.getId)),format.raw/*30.67*/("""" class="list-group-item">"""),_display_(/*30.94*/d/*30.95*/.getName),format.raw/*30.103*/("""

            """),format.raw/*32.13*/("""</a>
			""")))}),format.raw/*33.5*/("""
		"""),format.raw/*34.3*/("""</div>
	</div>     
              
              
                           
                           
                           
                           
                <div class="col-9">
                    
                    <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Email</th>
            <th>Name</th>
            <th>DOB</th>
            <th>Department</th>
            <th>Job Title</th>
        </tr>
        </thead>
        <tbody>
     
        <!-- Users row(s) -->
       
            """),format.raw/*59.62*/("""
            """),_display_(/*60.14*/for(e<-employees) yield /*60.31*/ {_display_(Seq[Any](format.raw/*60.33*/("""
               """),format.raw/*61.16*/("""<tr>
                  <td>"""),_display_(/*62.24*/e/*62.25*/.getEmail),format.raw/*62.34*/("""</td>
                  <td>"""),_display_(/*63.24*/e/*63.25*/.getName),format.raw/*63.33*/("""</td>
                  <td>"""),_display_(/*64.24*/e/*64.25*/.getDateOfBirth),format.raw/*64.40*/("""</td>
                  <td>"""),_display_(/*65.24*/e/*65.25*/.getDepartment.getName),format.raw/*65.47*/("""</td>
                  <td>"""),_display_(/*66.24*/e/*66.25*/.getJobTitle),format.raw/*66.37*/("""</td>
            <td>
							<a href=""""),_display_(/*68.18*/routes/*68.24*/.HomeController.deleteEmployee(e.getEmail)),format.raw/*68.66*/("""" i class="far fa-trash-alt" onclick="return confirmDel();">
							</a>
						</td>
             <td>
							<a href=""""),_display_(/*72.18*/routes/*72.24*/.HomeController.updateEmployee(e.getEmail)),format.raw/*72.66*/("""" class="fas fa-pen" onclick="return confirmDel();">
							</a>
						</td>
               </tr>
            """)))}),format.raw/*76.14*/("""
        
        """),format.raw/*78.9*/("""</tbody>
    </table>
              
                  <p>
        <a href=""""),_display_(/*82.19*/routes/*82.25*/.HomeController.addEmployee()),format.raw/*82.54*/("""">
            <button class="btn btn-primary">Add a new Employee</button>
        </a>
    </p>
    
             </div>
        </div>  
              
              
          </div>  
      </div>
      
""")))}))
      }
    }
  }

  def render(employees:List[models.users.Employee],department:List[models.Department],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employees,department,user)

  def f:((List[models.users.Employee],List[models.Department],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employees,department,user) => apply(employees,department,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 21:00:07 GMT 2019
                  SOURCE: /Users/Graham/Desktop/SDEVCA1/app/views/employees.scala.html
                  HASH: 5df58fa44fd9dcd124754ff270c4a0541dbb3e3c
                  MATRIX: 1015->1|1209->103|1240->126|1278->127|1313->204|1341->207|1381->239|1420->241|1449->244|1512->282|1525->287|1560->302|1589->305|1628->314|1666->325|2202->834|2217->840|2266->868|2342->918|2376->936|2416->938|2461->955|2498->965|2513->971|2568->1005|2622->1032|2632->1033|2662->1041|2704->1055|2743->1064|2773->1067|3413->1728|3454->1742|3487->1759|3527->1761|3571->1777|3626->1805|3636->1806|3666->1815|3722->1844|3732->1845|3761->1853|3817->1882|3827->1883|3863->1898|3919->1927|3929->1928|3972->1950|4028->1979|4038->1980|4071->1992|4138->2032|4153->2038|4216->2080|4363->2200|4378->2206|4441->2248|4583->2359|4628->2377|4732->2454|4747->2460|4797->2489
                  LINES: 28->1|33->2|33->2|33->2|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|43->12|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|63->32|64->33|65->34|90->59|91->60|91->60|91->60|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|99->68|99->68|99->68|103->72|103->72|103->72|107->76|109->78|113->82|113->82|113->82
                  -- GENERATED --
              */
          