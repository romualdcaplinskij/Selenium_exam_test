## General requirements for all tasks
  	
* Create a new project. Your project should have your Name and Surname. Use the same maven project for all  tasks.
* Implement steps in the same order as they are written in test case.
* Good practices have to be applied including (but not limited to): Page Object Pattern, variables and methods naming, creating variables for constants and values which are used multiple times during test execution, etc. While performing the task, keep in mind that you are creating a "mini automation framework", which later should be extended with additional tests and functionalities. Keeping that in mind, follow appropriate design practices.
* Keep your code clean - no unused classes, variables, methods, etc.
* Quantity of successfully implemented steps matters.
* Create a suite containing all test classes
* Upload your project to Git repository

## UI testing scenario 1

* Application for testing
  - PrestaShop
  - https://bitnami.com/redirect/to/2457743/bitnami-prestashop-8.1.6-r0-debian-12-amd64.ova
*  Steps
  - Navigate to the signup page
  - Fill in the email field with a valid unique email address
  - Fill in the password field with a strong password.
  - Fill in other required fields (e.g., first name, last name, etc.).
  - Click the "Sign Up" button.
  - Assert that the user is logged in
  - Log out
  - Attempt to log in with the newly created account
  - Assert that the login is successful
*  Requirements
  - Assertions should contain message with explanation if assertion fails. You can use jUnit / AssertJ of your choice to perform assertions.
  - For Locators  different strategies should be used, like xPath or cssSelector
  - Use waits: apply them in places only where it is necessary. Thread.sleep() is not allowed.
  - Testdata file should be saved in project (not in local disk) and used for reading item names.
  - Test should work with any product names stored in testdata file and  with any amount of products.
* Bonus points
  - For this task you can apply data driven test approach (make your test parameterized).
 
## UI testing scenario 2

* Application for testing
  - PrestaShop
  - https://bitnami.com/redirect/to/2457743/bitnami-prestashop-8.1.6-r0-debian-12-amd64.ova
*  Preconditions
  - Use provided products.csv file
*  Steps
  - Open application under test
  - Read each item name from the test data file
  - For each item (If the item exists in the list):
    - Search for the product
    - Assert that product is displayed on the screen and check that name matches.
    - Select (open) this product;
    - Click button "Add to wishlist" (Heart symbol)
    - Assert that info message containing text is shown, f.e.: "You need to be logged in to save products in your wishlist."
    - Press "Cancel"
    - Select size (provided in the file)
    - Click button "Add to cart"
    - Assert that info message containing text is shown, f.e.: "Product successfully added to your shopping cart"
    - Press "PROCEED TO CHECKOUT"
    - Assert that you have succesfully added item into shopping cart (by name)
    - Assert that size is correct (f.e. XL)
    - Assert that discount is applied correctly (f.e. 20%)
*  Requirements
   - Assertions should contain message with explanation if assertion fails. You can use jUnit / AssertJ of your choice to perform assertions.
   - For Locators  different strategies should be used, like xPath or cssSelector
   - Use waits: apply them in places only where it is necessary. Thread.sleep() is not allowed.
   - Testdata file should be saved in project (not in local disk) and used for reading item names.
   - Test should work with any product names stored in testdata file and  with any amount of products.
* Bonus points
  - For this task you can apply data driven test approach (make your test parameterized).

