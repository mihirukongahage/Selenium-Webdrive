from selenium import webdriver
import time
driver = webdriver.Chrome()
driver.get("https://facebook.com")
a = driver.find_element_by_id("email").send_keys("<email>")
a = driver.find_element_by_id("pass").send_keys("<password>")
driver.find_element_by_id("loginbutton").click();
time.sleep(3)
