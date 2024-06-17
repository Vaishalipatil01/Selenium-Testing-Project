package magento.p1.Tests;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "registrationData")
    public static Object[][] registrationData() {
        return new Object[][] {
            // Positive test cases
        	{"vaishu","patil","vaishu@29.example.com","vaishu#19","vaishu#19",true},
        	{"sagar","rathee","mitran2396@example.com","vaishu#19","vaishu#19",true},
        	{"sid","suriya","mittu@4576example.com","vaishu#19","vaishu#19",true},
       
            // Negative test cases
            {"kiran", "kp", "karan", "$%^bilal56", "$%^bilal56", false}, // invalid email
            {"patil", "kiran", "kiran.patil@gmail.com", "qwerty", "WRONG", false} // mismatched confirm password
        };
    }

    @DataProvider(name = "signInData")
    public static Object[][] signInData() {
        return new Object[][]{
            // Positive test cases
        	{"vaishu@example.com","vaishu#19",true},
        	{"vaishu@example.com","vaishu#19",true},
        	{"vaishu@example.com","vaishu#19",true},
            {"vaishu@example.com","vaishu#19",true},
            // Negative test cases
            {"kiran.patil@gmail.com", "$%^patil56", false}, // incorrect password
            {"invalid.email", "password", false} // invalid email format
        };
    }

    @DataProvider(name = "changePasswordData")
    public static Object[][] changePasswordData() {
        return new Object[][]{
            // Positive test cases
 
        	{"vaishu@example.com","vaishu#19","vaishu#19","vaishu#19","vaishu#19",true},
        	{"vaishu@example.com","vaishu#19","vaishu#19","vaishu#19","vaishu#19",true},//differentuser
        	{"vaishu@example.com","vaishu#19","vaishu#19","vaishu#19","vaishu#19",true}

        	 
            // mismatched new password
        };
    }
    @DataProvider(name = "addressData")
    public static Object[][] addressData() {
        return new Object[][]{
            {"vaishu@example.com","vaishu#19","kp", "vp", "kbp Company", "1234567890", "123 Main St", "manytown", "Texas", "99501", "United States",true},
            {"patil@457example.com","vaishu#19","kp", "vp", "kbp Company", "1234067890", "123 St", "manytown", "Texas", "   ", "United States",false},
            {"vaishu@example.com","vaishu#19","kp", "vp", "kbp Company", "1234567890", "123 Main ", "manytown", "Alaska", "  ", "United States",false},//zipblank
            {"patil@example.com","vaishu#19","kp", "vp", "kbp Company", "1234567890", "123 Main", "manytown", "Alaska", " 4567 ", "United States",true},
            {"vaishu@example.com","vaishu#19","kp", "vp", "kbp Company", "1234567890", "123 Main St", "manytown", "Texas", "99501", "United States",true}
            
        };
    }
    
   
        @DataProvider(name = "productData")
        public static Object[][] productData() {
            return new Object[][]{
                {"vaishu@example.com", "patil#19", "Selene Yoga Hoodie", "168", "57"},
                {"kiran@example.com", "vaishu#19", "Cassius Sparring Tank", "167", "50"},
                {"patil@example.com", "patil#19", "Zeppelin Yoga Pant", "176", "53"}
            };
        }
}


 