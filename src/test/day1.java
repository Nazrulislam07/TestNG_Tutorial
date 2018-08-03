package test;

import org.testng.annotations.Test;

public class day1 {


	@Test
	public void Demo()
	{
		System.out.println("Hello");

	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("Bye");
	}
}
 
/*How to run tests with TestNG?
 You need to have @Test Annotation followed by method
 */
//YOu can define multiple tests from single class
//You can modularize the test cases based up on functionality and trigger them accordingly
//You can also get a control on running specific methods form test case
// Test suite -> Test Folder(Module)->test cases

/*   <class name="test.day3"> 
		<methods>
		<exclude name="mobilelogincarloan"/>
		</methods>
	</class>
	ai mehtod use kare 1ta test case or method skip kara jai. as akhane day3 class ar mobilelogincarloan test or method skip kara hoese xml file a | 
	Thik akoi vabe exclude ar poriborte include kara hobe kono specefic class ar modhe jemon-- 
		<class name="test.day1" >
			<methods>
			<include name="Demo"/>
			</methods>
			</class>	
*/




/* (Testing convention/consisting name)Test case name and method ar name ar 1st word akoi thakle sigle click a onek test run kara jabe.
 as day3 te 
   <class name="test.day3"> 
		<methods>
		<exclude name="mobile.*"/>
		</methods>
	</class>
	aivab mobile die suru joto test case ase not included.
 */

/* upore class ar name die test kara hoese. Akhane dekhano hobe pakage theke kivab run kara jai same aki rokom instead of class
 you need to put package niche dekhano hoese. ami xml copy kare xml2 name save kare oikhane run karesi, akhane akadhik package add
 kara jabe... jemon class ar modhe add kara hoese.
 
  <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Loan Department">
	<test name="Personal loan">
	
		<packages>
			<package name="test" />
		</packages>

	</test>
</suite>  
 
 */ 

/* TestNG annotations--->
 =====================
  @Beforetest apni jkono class a dite paren ate whatever testcases you can executed @Beforetest a Print asbe
 jemon ---
 @Beforetest
 Public void prerequiste()
 {
 System.out.println("Anything you can write")
 }   
 and import karte hobe
 
        
  thik ulta vabe @Aftertest j class diben oi class executed hobar por @Aftertest print asbe
  not other folder jemon personal loan, car loan as folder
  jemon---
  @Aftertest
 Public void lastexecution()
 {
 System.out.println("Anything you can write")
 } 
 
 
 
 @Beforesuite and @Aftersuite
 suit holo whole TestNG xml 
 jkono class a jkono method @Beforesuite and @Aftersuite dileo control kare all the test
 folder so akdom prothome and sese print hobe
 
 
 
 @Beforemethod and @Aftermethod 
 
 suppose 4 test cases.. every test case ar purbe @Beforemethod print hobe j methods dao na kno,
 ai test class ar modhe kaj kare imean onno class noi. Thik akoi vabe @Aftermehtods kaj kare
 after every test ar por print hobe class ar moddhe.


@Beforeclass and @Afterclass
ai annotation khubi state forward class ar purbe @Beforeclass print hobe code executed hobar age and 
class por @Afterclass  ar por code executed hobar por print hobe. @Beforeclass class ar name ar por e 
dite hoi(majkhane dile hoi kina sure na)and @Afterclass jkono methoda ar age dilei hoi 

 */

/*SMOKE TESTING
 ==============
Supose you have 100 test case you need to run 4 or 5 test case from different class as a smoke test.
 But for regression you can test all of them. but 4 or 5 test cases you can run groups tag 
 jemon- @Test(groups={"Smoke"}) aivab jesob test run karte chai @Test ar por (groups={"Smoke"}) dite hobe.
 Then you can copy of  xml test and 
 
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Loan Department">

	<test name="Regression">
	<groups>
		<run>
			<include name="Smoke"/>
		</run>
	</groups>
		<classes>
			<class name="test.day1" />
			<class name="test.day2" />
			<class name="test.day3" />
			<class name="test.day4" />
		</classes>
	</test>

</suite> 

THik akoi vabe 4 or 5 test case sara baki sabgulo rest cases run kara jabe sab thikie thakbe just
<include name="Smoke"/> aikhane include ar jaigai exclude dite hobe 

 */

/*
 dependsOnMethods
 ================
 ai helper attribute use kare kono test case or multiple test cases ar upor depend kare imean j test case 
 ar nam {} ar vitore dia hobe seta run hobar por @Test(dependsOnMethods) run hobe
 jemon-
 @Test(dependsOnMethods={"MobileloginHomeloan","mobilesignincarloan"})
	public void webloginHomeloan()
	{
		System.out.println("WebloginHome");	
	}
 upore {} vitorer test cases run karar por ai webloginHomeloan test case run karbe

 */



/*enabled
 ========
 ai helper attribute use kare kono bug test imean team ar sabai jane ai test a bug ase then you can skip this
 test without red mark or flag. so repots a bug ase ba test failed karse dekhabe na
 jemon-
 @Test(enabled=false)
 
thik akoi vabe test natun kare run karte chaile false ar jaigai true dilei hobe 

*/



/*timeout
 =======
 ai helper attribute kono particular test case a time die diake bujhai. onek somoi you may feel kisu test case run karte time lage 
 ai khethre timeout attribute use karle oi somoi porjonto wait karbe
 jemon-
 @Test(timeout=20000)
 akhane 20 second ar age test case fail karbena test run na kara porjonto wait karbe 20 second then fail hobe
 */
