// PARTNER NAME: Tony Vera
// PARTNER NAME: N/A
// CS111 SECTION #: 3033
// DATE: 1/30/2025

public class Main
{
	public static void main(String[] args)
	{
		//CONSTANTS SECTIONS
		final String ANSI_BG_RED = "\u001B[41m";
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_BOLD = "\u001B[1m";
		final String TITLE_USA = ANSI_BG_RED + ANSI_BOLD + "UNITED STATES OF AMERICA" + ANSI_RESET;
		final String CARD_TYPE = ANSI_BG_RED + ANSI_BOLD + "EMPLOYMENT AUTHORIZATUION CARD" + ANSI_RESET;

		//DECLARATION + INITIALIZATION SECTION
		//Complete Fields
		String surname, givenName, category, cardNum, birthCountry, termsAndConditions;
		char sex;

		//Parts of Fields
		String birthMonth;
		int uscisNum1, uscisNum2, uscisNum3, birthDay, birthYear;
		int validDay, validMonth, validYear, expireDay, expireMonth, expireYear;


		surname = "Kim";
		givenName = "Ji-soo";
		category = "BP4";
		cardNum = "KP0000000121";
		birthCountry = "South Korea";
		termsAndConditions = "K-Pop";
		sex = 'F';
		birthMonth = "JAN";
		uscisNum1 = 123;
		uscisNum2 = 456;
		uscisNum3 = 789;
		birthDay = 03;
		birthYear = 1995;
		validDay = 13;
		validMonth = 08;
		validYear = 2016;
		expireDay = 12;
		expireMonth = 08;
		expireYear = 2036;
		
		//INPUT SECTION
		//No User Input at this time
		//CALCULATION SECTION
		//No Calculations at this time	

		//OUTPUT SECTION
		System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
		System.out.println("║         "+ TITLE_USA +"                                    ║");
		System.out.println("║                                  "+ CARD_TYPE+"     ║");
		System.out.println("║                       Surname                                       ║");
		System.out.println(  "║                       " + surname + "                                           ║");
		System.out.println("║  .----.    .----.     Given Name                                    ║");
		System.out.println(  "║ (   ^  \\  /  ^   )    "  + givenName +  "                                        ║");
		System.out.println("║        |  |           USCIS#         Category   Card#               ║");
		System.out.println("║       _/  \\_          " + uscisNum1 + "-" + uscisNum2 + "-" + uscisNum3 + "    " + category + "        " + cardNum + "        ║");
		System.out.println("║      (_    _)         Country of Birth                              ║");
		System.out.println("║   ,    `--`    ,      " + birthCountry + "                                   ║");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions                          ║");
		System.out.println("║    \\          /       " + termsAndConditions + "                                         ║");
		System.out.println("║     '.--..--.'        Date of Birth   Sex                           ║");
		System.out.println("║       `\"\"\"\"\"`         " + birthDay + " " + birthMonth + " " + birthYear + "      " + sex + "                             ║");
		System.out.println("║                       Valid From:     " + validMonth + "/" + validDay + "/" + validYear + "                     ║");
		System.out.println("║                       Card Expires:   " + expireMonth +"/" + expireDay + "/" + expireYear + "                     ║");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.                 ║");
		System.out.println("╚═════════════════════════════════════════════════════════════════════╝");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}