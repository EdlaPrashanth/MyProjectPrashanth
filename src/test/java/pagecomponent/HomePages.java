package pagecomponent;

import java.io.ObjectInputFilter.Status;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import enginecomponent.Base;
import utility.WebUtil;

public class HomePages extends Base {

	WebUtil webutilobj = new WebUtil();

	@FindBy(xpath = "(//a[@class='us-link'])[1]")
	WebElement us;

	@FindBy(xpath = "//span[text()='Account']")
	WebElement account;

	@FindBy(xpath = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
	WebElement Signin;

	@FindBy(xpath = "//input[@type='email']")
	WebElement Username;

	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;

	@FindBy(xpath = "//button[@class=\"c-button c-button-secondary c-button-lg c-button-block c-button-icon c-button-icon-leading cia-form__controls__submit \"]")
	WebElement Submit;

	

	public void HomePage() {
		PageFactory.initElements(WebUtil.driver, this);
	}

	public void SignInPositiveScenario() throws InterruptedException {
		try {
			expWait(us, 2);
			eleClick(us);
			expWait(account, 2);
			eleClick(account);
			expWait(Signin, 2);
			eleClick(Signin);
			sendkeysMethod(Username, "dineshsachu747@gmail.com");
			sendkeysMethod(Password, "Dinesh@24");
			eleClick(Submit);
			test.addScreenCaptureFromPath(getScreenShot("SignInPositiveScenario"));
			test.log(Status.PASS, "Signin Successful");
		} catch (Exception e) {
			test.log(Status.FAIL, "Signin Failed");
			e.printStackTrace();
		}
	}

	public void SignInNegativeScenario() throws InterruptedException {

		try {
			eleClick(us);
			expWait(account, 2);
			eleClick(account);
			expWait(Signin, 2);
			eleClick(Signin);
			sendkeysMethod(Username, "hkdkael@gmail.co");
			sendkeysMethod(Password, "fhjafkjdfj");
			eleClick(Submit);
			test.addScreenCaptureFromPath(getScreenShot("SignInNegativeScenario"));
			test.log(Status.PASS, "Signin with incorrect credentials successfull");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in signin up with incorrect credentials");
			e.printStackTrace();
		}
	}

	
        
		public class BottomHomePage extends WebUtil{
	
	@FindBy(xpath = "(//a[@class='us-link'])[1]")
	WebElement us;
	
	@FindBy(xpath = "//a[@class='body-copy-sm mr-200']")
	WebElement Accessibility;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[2]")
	WebElement TermsandConditions;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[3]")
	WebElement privacy;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[4]")
	WebElement InterestBasedAd;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[5]")
	WebElement StatePrivacy;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[6]")
	WebElement CA;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[7]")
	WebElement LimitUSe;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[8]")
	WebElement TargetedAdv;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[9]")
	WebElement CASupplyChain;
	
	public BottomHomePage() {
		PageFactory.initElements(WebUtil.driver, this);
	}

		public void BottomLinksValidation() {
			try {
				eleClick(us);
				expWait(Accessibility, 2);
				eleClick(Accessibility);
				driver.getTitle();
				String title =driver.getTitle();
				System.out.println(title);
				test.log(Status.PASS, "Accessibility title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating Accessibility title");
				e.printStackTrace();
			}
			
			try {
				expWait(TermsandConditions, 2);
				eleClick(TermsandConditions);
				String title1 =driver.getTitle();
				System.out.println(title1);
				test.addScreenCaptureFromPath(getScreenShot("TermsandConditions"));
				test.log(Status.PASS, "TermsandConditions title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating TermsandConditions title");
				e.printStackTrace();
			}
			
			try {
				expWait(privacy, 2);
				eleClick(privacy);
				String title2 =driver.getTitle();
				System.out.println(title2);
				test.addScreenCaptureFromPath(getScreenShot("privacy"));
				test.log(Status.PASS, "privacy title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating privacy title");
				e.printStackTrace();
			}
			
			try {
				expWait(InterestBasedAd, 2);
				eleClick(InterestBasedAd);
				String title3 =driver.getTitle();
				System.out.println(title3);
				test.addScreenCaptureFromPath(getScreenShot("InterestBasedAd"));
				test.log(Status.PASS, "InterestBasedAd title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating InterestBasedAd title");
				e.printStackTrace();
			}
			
			try {
				expWait(StatePrivacy, 2);
				eleClick(StatePrivacy);
				String title4 =driver.getTitle();
				System.out.println(title4);
				test.addScreenCaptureFromPath(getScreenShot("StatePrivacy"));
				test.log(Status.PASS, "StatePrivacy title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating StatePrivacy title");
				e.printStackTrace();
			}
			
			try {
				expWait(CA, 2);
				eleClick(CA);
				String title5 =driver.getTitle();
				System.out.println(title5);
				test.addScreenCaptureFromPath(getScreenShot("CA"));
				test.log(Status.PASS, "CA title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating CA title");
				e.printStackTrace();
			}
			
			navigateback();
			
		
			try {
				expWait(LimitUSe, 2);
				eleClick(LimitUSe);
				String title6 =driver.getTitle();
				System.out.println(title6);
				test.addScreenCaptureFromPath(getScreenShot("LimitUSe"));
				test.log(Status.PASS, "LimitUSe title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating LimitUSe title");
				e.printStackTrace();
			}
			navigateback();
			
			
			try {
				expWait(TargetedAdv, 2);
				eleClick(TargetedAdv);
				String title7 =driver.getTitle();
				System.out.println(title7);
				test.addScreenCaptureFromPath(getScreenShot("TargetedAdv"));
				test.log(Status.PASS, "TargetedAdv title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating TargetedAdv title");
				e.printStackTrace();
			}
			navigateback();
			
			try {
				expWait(CASupplyChain, 2);
				eleClick(CASupplyChain);
				String title8 =driver.getTitle();
				System.out.println(title8);
				test.addScreenCaptureFromPath(getScreenShot("CASupplyChain"));
				test.log(Status.PASS, "CASupplyChain title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating CASupplyChain title");
				e.printStackTrace();
			}
	}



}


public class AllMenuPage extends WebUtil{
	
	@FindBy(xpath="(//a[@class=\"us-link\"])[1]")
	WebElement us;
	
	@FindBy(xpath="//a[text()=\"Top Deals\"]")
	WebElement topdeals;
	
	@FindBy(xpath="//a[text()=\"Deal of the Day\"]")
	WebElement Dealoftheday;
	
	@FindBy(xpath="//a[text()=\"Totaltech Membership\"]")
	WebElement Totaltech;
	
	@FindBy(xpath="//a[text()=\"Credit Cards\"]")
	WebElement Creditcards;
	
	@FindBy(xpath="//a[text()=\"Gift Cards\"]")
	WebElement GiftCards;
	
	@FindBy(xpath="//a[text()=\"Gift Ideas\"]")
	WebElement GiftIdeas;
	
	@FindBy(xpath="//a[text()=\"Health & Wellness\"]")
	WebElement HealthWellness;
	
	@FindBy(xpath="//a[text()='Best Buy Outlet']")
	WebElement BestBuyOutlet;
	
	@FindBy(xpath="//span[@class=\"v-p-right-xxs utility-nav-drawer-btn-label\"]")
	WebElement more;
	
	@FindBy(xpath="//a[@class=\"utility-menu-flyout-list-item\"]")
	WebElement BestBuyBusiness;
	
	@FindBy(xpath="//button[@class=\"c-button-link menuCloseBtn accountMenuCloseButton\"]")
	WebElement close;
	
	public AllMenuPage() {
		PageFactory.initElements(WebUtil.driver, this);
	}

	public void Menu() throws InterruptedException {
		try {
			eleClick(us);
			expWait(topdeals,2);
			eleClick(topdeals);
			String title =driver.getTitle();
			Assert.assertEquals(title, "Top Deals and Featured Offers on Electronics - Best Buy");
			test.log(Status.PASS, "TopDeals Title validated");
			test.addScreenCaptureFromPath(getScreenShot("topdeals"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating TopDeals title");
			e.printStackTrace();
		}
		
		try {
			eleClick(Dealoftheday);
			String title1 =driver.getTitle();
			Assert.assertEquals(title1, "Deal of the Day: Electronics Deals - Best Buy");
			test.log(Status.PASS, "Dealoftheday Title validated");
			test.addScreenCaptureFromPath(getScreenShot("Dealoftheday"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating Dealoftheday title");
			e.printStackTrace();
		}
		
		try {
			eleClick(Totaltech);
			String title2 =driver.getTitle();
			Assert.assertEquals(title2, "Best Buy Totaltech™ – Best Buy");
			test.log(Status.PASS, "Totaltech Title validated");
			test.addScreenCaptureFromPath(getScreenShot("Totaltech"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating Totaltech title");
			e.printStackTrace();
		}
		
		try {
			eleClick(Creditcards);
			String title3 =driver.getTitle();
			Assert.assertEquals(title3, "Best Buy Credit Card: Rewards & Financing");
			test.log(Status.PASS, "Creditcards Title validated");
			test.addScreenCaptureFromPath(getScreenShot("Creditcards"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating Creditcards title");
			e.printStackTrace();
		}
  
		try {
			eleClick(GiftCards);
			String title4 =driver.getTitle();
			Assert.assertEquals(title4, "Gifts Cards and E-Gift Cards - Best Buy");
			test.log(Status.PASS, "GiftCards Title validated");
			test.addScreenCaptureFromPath(getScreenShot("GiftCards"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating GiftCards title");
			e.printStackTrace();
		}
		
		try {
			eleClick(GiftIdeas);
			String title5 =driver.getTitle();
			Assert.assertEquals(title5, "Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
			test.log(Status.PASS, "GiftIdeas Title validated");
			test.addScreenCaptureFromPath(getScreenShot("GiftIdeas"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating GiftIdeas title");
			e.printStackTrace();
		}
		try {
			eleClick(HealthWellness);
			String title6 =driver.getTitle();
			Assert.assertEquals(title6, "Health & Wellness Solutions & Technology - Best Buy");
			test.log(Status.PASS, "HealthWellness Title validated");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating HealthWellness title");
			e.printStackTrace();
		}
		
		try {
			eleClick(BestBuyOutlet);
			String title7 = driver.getTitle();
			Assert.assertEquals(title7, "Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy");
			test.log(Status.PASS, "BestBuyOutlet Title validated");
			test.addScreenCaptureFromPath(getScreenShot("BestBuyOutlet"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating BestBuyOutlet title");
			e.printStackTrace();
		}
		
		try {
			eleClick(more);
			expWait(BestBuyBusiness,2);
			eleClick(BestBuyBusiness);
			String title8 = driver.getTitle();
			Assert.assertEquals(title8, "Best Buy for Business - Best Buy");
			test.log(Status.PASS, "Best Buy for Business validated");
			test.addScreenCaptureFromPath(getScreenShot("BestBuyBusiness"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating Best Buy for Business validated title");
			e.printStackTrace();
		}
		  
      
      public class ShopByBrandPage extends WebUtil{
	
	@FindBy(xpath="(//a[@class='us-link'])[1]")
	WebElement us;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	WebElement hamburgermenu;
	
	@FindBy(xpath="(//button[@class=\"c-button-unstyled top-four v-fw-medium\"])[3]")
	WebElement Brands;
	
	@FindBy(xpath="(//a[@class=\"hamburger-menu-flyout-list-item  \"])[5]")
	WebElement Sony;
	
	@FindBy(linkText="Sony home audio")
	WebElement sonyhomeaudio;
	
	@FindBy(xpath="(//button[@class=\"c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button\"])[1]")
	WebElement addtocart;
	
	public ShopByBrandPage() {
		PageFactory.initElements(WebUtil.driver, this);
	}
	
	public void ShopByBrand() {
		
		try {
			eleClick(us);
			expWait(hamburgermenu,2);
			eleClick(hamburgermenu);
			expWait(Brands,2);
			eleClick(Brands);
			expWait(Sony,2);
			eleClick(Sony);
			expWait(sonyhomeaudio,2);
			eleClick(sonyhomeaudio);
			expWait(addtocart,2);
			eleClick(addtocart);
			test.addScreenCaptureFromPath(getScreenShot("ShopByBrand"));
			test.log(Status.PASS, "ShopByBrand successfull");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in ShopByBrand");
			e.printStackTrace();
		}
	}
	

}

public class ShopByDepartmentPage extends WebUtil {

	@FindBy(xpath="(//a[@class='us-link'])[1]")
	WebElement us;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	WebElement hamburgermenu;

	@FindBy(xpath = "(//button[@class=\"c-button-unstyled hamburger-menu-flyout-list-item \"])[3]")
	WebElement ComputerTables;

	@FindBy(xpath = "(//button[@class=\"c-button-unstyled hamburger-menu-flyout-list-item \"])[7]")
	WebElement ComputerAccessories;

	@FindBy(xpath = "(//a[@class=\"hamburger-menu-flyout-list-item  \"])[5]")
	WebElement Webcams;

	@FindBy(xpath = "(//button[@type='button'])[33]")
	WebElement AddtoCart;

	public ShopByDepartmentPage() {
		PageFactory.initElements(WebUtil.driver, this);
	}

	public void ShopByDept() {
		try {
			expWait(us,2);
			eleClick(us);
			expWait(hamburgermenu,2);
			eleClick(hamburgermenu);
			//expWait(ComputerTables,2);
			eleClick(ComputerTables);
			expWait(ComputerAccessories,2);
			eleClick(ComputerAccessories);
			expWait(Webcams,2);
			eleClick(Webcams);
			expWait(AddtoCart,2);
			eleClick(AddtoCart);
			test.log(Status.PASS, "Adding item in ShopByDept is successful");
			test.addScreenCaptureFromPath(getScreenShot("ShopByDept"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in Adding item in ShopByDept");
			e.printStackTrace();
		}
	}
	
}

			test.addScreenCaptureFromPath(getScreenShot("HealthWellness"));