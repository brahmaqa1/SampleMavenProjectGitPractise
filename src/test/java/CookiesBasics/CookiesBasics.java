package CookiesBasics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.base;

public class CookiesBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",  "D:\\SeleniumSoftwares\\Alldrivers\\chromedriver_win32V96\\chromedriver.exe");		//		  
		//"main" java.lang.IllegalStateException: The driver executable does not exist: D:\SeleniumSoftwares\All Selenium Jar Files\chromedriver_win32V96\chromedriver.exe

		WebDriver driver= new ChromeDriver();	
		driver.get("https://www.udemy.com");
		Set<Cookie> gCookies= driver.manage().getCookies();

		System.out.println("get cnt= "+gCookies.size());
		for(Cookie EachCookie : gCookies)
		{	
			System.out.println("****************");
			System.out.println("cookie  name ="+ EachCookie.getName());
			System.out.println("cookie  value ="+ EachCookie.getValue());
			System.out.println("cookie getDomain-"+EachCookie.getDomain());
			System.out.println("cookie Expired date-"+EachCookie.getPath());

			System.out.println("cookie getPath-"+EachCookie.getPath());
			System.out.println("****************");

		}

		//		get cnt= 21
		//				****************
		//				cookie  name =ud_cache_campaign_code
		//				cookie  value =INDIANEWLEARNER
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =ud_cache_brand
		//				cookie  value =INen_US
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =ud_cache_price_country
		//				cookie  value =IN
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =__cfruid
		//				cookie  value =e89ed11dc3d1e3560ef7718c4d80ef2727908905-1642422465
		//				cookie getDomain-.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =ud_cache_language
		//				cookie  value =en
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =ud_firstvisit
		//				cookie  value =2022-01-17T12:27:44.956660+00:00:1n9R6v:aAkmQVx0aeO0aprMI0htely-qzc
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =__cf_bm
		//				cookie  value =_HSzGAVzfIlGczcYd7R5CQ4mzfUmiTmGiFIxRcmk6NA-1642422481-0-AXTvLUsxoYSo3N7HTLqHNcBh35sCM9oYlhmptlGjTzXGFFBPTwZnQIHNxKzZzyF7gFO8lzV6cPgiHIvTLm/I8Q6i1M4hLPzELaK26jVM/S+f8/X4VFt5cD0eRKmHi+VtN0EObuQXWadxIsYQWT1ybKreB9YG1GjBwlRhS5x8CAi2X6KPbpL6+GCb5rPKsDnuzg==
		//				cookie getDomain-.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =ud_cache_device
		//				cookie  value =None
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =ud_rule_vars
		//				cookie  value ="eJx9jcEOgyAQBX_FcG01C2JRvsWErLBY0qakgF6M_16TtklPvb68mdlYwTRTIWfWkEOJSZODTrXkevRWOvSTVaoHRNlx3gqB2sZ4C8R0xbaR-ZByebPGYaHx2EcmQIgaeM1VxYUWSkvZDHIArk4AGmBk5-N1xwMtcbFXUxJ6H6zJcUmWzIop4HT_2GKa8RHsD5TouVD-X-yaVl0U77_Fne0vQfRIjw==:1n9R6v:qp5cMYbH9rn3I5eQL-bl01Z0L3I"
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =ud_cache_modern_browser
		//				cookie  value =1
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =OptanonConsent
		//				cookie  value =isIABGlobal=false&datestamp=Mon+Jan+17+2022+17%3A57%3A59+GMT%2B0530+(India+Standard+Time)&version=6.10.0&hosts=&consentId=d2f677de-c489-4607-90e9-5381764f888e&interactionCount=0&landingPath=https%3A%2F%2Fwww.udemy.com%2F&groups=C0003%3A1%2CC0005%3A1%2CC0004%3A1%2CC0001%3A1%2CC0002%3A1
		//				cookie getDomain-.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =__udmy_2_v57r
		//				cookie  value =ed0573ed8afc4dafbc7780aa4511322a
		//				cookie getDomain-.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =seen
		//				cookie  value =1
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =ud_cache_marketplace_country
		//				cookie  value =IN
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =ud_cache_logged_in
		//				cookie  value =0
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =__udmy_1_a12z_c24t
		//				cookie  value =VGhlIGFuc3dlciB0byBsaWZlLCB0aGUgdW5pdmVyc2UsIGFuZCBldmVyeXRoaW5nIGlzIDQy
		//				cookie getDomain-.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =ud_cache_user
		//				cookie  value =""
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =evi
		//				cookie  value ="3@YxZ1TKPP9PH-H-CFo-1Z7HEh46C3RO7odPsVBETDjE9OdXTsP8_vWfqitD901zfmhQEnVa_CusK5IiOtp77V3YO-jrqYzzNEaIyVAluP7YGsWDzirTAQM9-qHcFUoj17sYE="
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =ud_cache_release
		//				cookie  value =37b92ae4000b8b0031fb
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =csrftoken
		//				cookie  value =O8OIkQy2Bmxg52DNKzCmJH36OUyWPEFU0b17KNmImMdARixB1OAjHtsgWDSSevLq
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************
		//				****************
		//				cookie  name =ud_cache_version
		//				cookie  value =1
		//				cookie getDomain-www.udemy.com
		//				cookie Expired date-/
		//				cookie getPath-/
		//				****************

		// delet all cookies 
//		driver.manage().deleteAllCookies();/

//		gCookies= driver.manage().getCookies();

//		System.out.println("get cnt= "+gCookies.size());//
//		1 ????
		
		// deleet cookie
		driver.manage().deleteCookieNamed("ud_cache_version");
		gCookies= driver.manage().getCookies();
		System.out.println("get cnt= "+gCookies.size());// 20-1 =19 
		
		//add cookie
		Cookie ck = new Cookie("MyCookie", "Ramsita");
	
		driver.manage().addCookie(ck);
		
		gCookies= driver.manage().getCookies();
		System.out.println("get cnt= "+gCookies.size());// 21 after adding 
		
		System.out.println("ends here");

	}

}
