import org.openqa.selenium.WebDriver;

import com.crm.genericlibrary.ConstantPath;
import com.crm.genericlibrary.PropertiesUtility;
import com.crm.genericlibrary.WebDriverUtility;
import com.crm.objectrepository.HomePage;
import com.crm.objectrepository.KidsPage;
import com.crm.objectrepository.StartingAt;

public class AddToCart 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = null;
		String profile = ConstantPath.PROPERTYFILEPATH;
		PropertiesUtility.initialize(profile);

		String url = PropertiesUtility.fetchString("url");
		String browser = PropertiesUtility.fetchString("browser");
		String timeout = PropertiesUtility.fetchString("timeout");
		long l=Long.parseLong(timeout);
		System.out.println(url);
		System.out.println(browser);
		System.out.println(l);


		driver=WebDriverUtility.openBrowser(driver, url);


		HomePage hp=new HomePage(driver);
		WebDriverUtility.impliWait(driver, l);
		hp.selectKid();

		KidsPage kp=new KidsPage(driver);
		kp.selectTopsAndTees();
		WebDriverUtility.getWinId(driver);
		
		StartingAt sta= new StartingAt(driver);
		//sta.riogirlselect();
		sta.dropDownselect();
		
		//WebDriverUtility.select(sta.dropDownselect(),"prce-desc");
		//WebDriverUtility.select(sta.getDropDown(), "prce-desc");
		WebDriverUtility.select("prce-desc",sta.getDropDown());
	}
}
