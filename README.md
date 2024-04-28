In this project, i have utilizing the powerful TestNG framework alongside Selenium WebDriver,& used ChromeDriver to open the browser and get things started. also explored the basics of automated testing,
ensuring the functionality and integrity of essential features of Application as follows steps :  

𝐓𝐞𝐬𝐭 𝐂𝐚𝐬𝐞𝐬 :

𝟏. 𝐋𝐨𝐠𝐢𝐧 𝐭𝐨 𝐀𝐦𝐚𝐳𝐨𝐧 : Initiating the test, & simulated user login, ensuring smooth authentication flow. This test verifies the robustness of the login mechanism.

𝟐. 𝐒𝐞𝐚𝐫𝐜𝐡 𝐈𝐭𝐞𝐦 : With the user logged in, proceed to search for an item, say 'Apple iPhone 15,' examining the search functionality.

𝟑. 𝐕𝐞𝐫𝐢𝐟𝐲 𝐓𝐢𝐭𝐥𝐞 : I've assert the correctness of the Amazon webpage title, confirming its alignment with the expected title. This ensures the page's identity and relevance.

𝟒. 𝐕𝐞𝐫𝐢𝐟𝐲 𝐋𝐨𝐠𝐨 : Validate the presence of the Amazon logo, an integral aspect of the website's branding and user experience.


In this I have also used some TestNG Annotations as follows :

𝟏. 𝐓𝐞𝐬𝐭 𝐏𝐫𝐢𝐨𝐫𝐢𝐭𝐢𝐳𝐚𝐭𝐢𝐨𝐧 : Utilizing TestNG annotations like @Test(priority = ...), as prioritize test execution, ensuring critical functionalities are thoroughly validated.

𝟐. 𝐃𝐞𝐩𝐞𝐧𝐝𝐞𝐧𝐜𝐲 𝐌𝐞𝐭𝐡𝐨𝐝 : Leveraging dependsOnMethods attribute, to manage test dependencies, executing tests in a logical sequence.

𝟑. 𝐀𝐬𝐬𝐞𝐫𝐭𝐢𝐨𝐧 𝐚𝐧𝐝 𝐕𝐚𝐥𝐢𝐝𝐚𝐭𝐢𝐨𝐧 : Employing assertions with TestNG's Assert class, as validate expected outcomes against actual results, ensuring accuracy and reliability.

𝟒. 𝐁𝐫𝐨𝐰𝐬𝐢𝐧𝐠 𝐌𝐞𝐭𝐡𝐨𝐝𝐬 : Employing @BeforeMethod and @AfterMethod annotations, to handle browser Login and other tests efficiently, maintaining test environment integrity.

By using the powerful duo of TestNG framework and Selenium WebDriver, I ran test cases, managed dynamic elements, and checked if things worked as expected. This helped make testing faster and more accurate.

