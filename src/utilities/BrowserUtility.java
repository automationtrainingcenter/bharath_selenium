package utilities;

import java.io.File;

public class BrowserUtility {

    /**
     * set the driver path irrespective of the operation system from the drivers folder
     * @param driverName name of the driver executable without any extension
     */
    public static void setDriverPath(String driverName){
        driverName = driverName.toLowerCase();

        // get the OS using os.name system property
        String os = System.getProperty("os.name").toLowerCase();
        if(os.contains("win")){
            driverName = driverName+".exe";
        }

        // get the folder path of the project root folder using user.dir system property
        String folderPath = System.getProperty("user.dir");
        folderPath = folderPath+File.separator+"drivers"+File.separator;
        if(driverName.equals("chromedriver")) {
            System.setProperty("webdriver.chrome.driver", folderPath+driverName);
        }else if(driverName.equals("geckodriver")){
            System.setProperty("webdriver.gecko.driver", folderPath+driverName);
        }else{
            System.out.println("invalid driver name. Driver name must be either chromedriver or geckodriver");
        }
    }
}
