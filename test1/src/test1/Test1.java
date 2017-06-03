/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Gli7ch
 */
public class Test1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
                System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        File f = new File("password.txt");
        InputStream strm = new FileInputStream(f);
        BufferedInputStream buf;
        buf = new BufferedInputStream(strm);
        
        StringBuilder sb = new StringBuilder();
        while(true){
            int data = buf.read();
            if (data == -1){
                break;
            }
            else{
                sb.append((char)data);
            }

        }
        
        WebDriver drive =new ChromeDriver();
        JavascriptExecutor jse = (JavascriptExecutor)drive;
        drive.get("https://www.facebook.com/");
        drive.findElement(By.id("email")).sendKeys("......");
        drive.findElement(By.id("pass")).sendKeys(sb);
        drive.findElement(By.id("loginbutton")).click();
                    try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                
            }
        drive.findElement(By.xpath("//*[@id=\"u_0_4\"]/div[1]/div[1]/div/a")).click();
        
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                
            }
                                try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                
            }
        
                                
        drive.findElement(By.xpath("//div[@id='fbTimelineHeadline']/div[2]/div/div/a[3]")).click();
        //*[@id="u_jsonp_2_3"]/div
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                
            }
            
        String str = (drive.findElement(By.xpath("//div[@id='fbTimelineHeadline']/div[2]/div/div/a[3]/span[1]"))).getText();
        System.out.println("Number of Friends: " + str);
         
             try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                
            }
            WebElement wb;
        wb = drive.findElement(By.xpath("//*[@id=\"timeline-medley\"]/div/div[2]/div[1]/div/div"));
        
        try{
            while(!(wb.isDisplayed()))
            jse.executeScript("scroll(0,1000000000);");
         }
        catch(Throwable T){
     
     }
        
        
        
    }
    
}
